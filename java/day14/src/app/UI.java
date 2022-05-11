package app;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Color;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.List;
import java.awt.Panel;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import dao.CustDao;
import frame.Dao;
import vo.CustVo;

/**
 * App2에서 쓸 UI 설계
 * @author noranbear (norandoly@gmail.com)
 * @since 2022. 4. 27. 오전 10:03:50
 * @version 1.0
 */
public class UI {
	
	// 데이터베이스와 연동하기 위해
	Dao<String, CustVo> dao;
	// select 정보를 담을 ArrayList - 같은 이름의 다른 폴더의 클래스가 있으면 이렇게 자동으로 적어줌.
	java.util.List<CustVo> clist;
	
	Frame f;
	Button b1, b2;
	Panel p1, p2; 	// 판떼기
	Panel main;
	TextField t1, t2, t3;
	TextField mainT;
	List list;		// awt에 있는 list
	
	// Constructor
	public UI() {
		dao = new CustDao();	// 데이터베이스 연동
		init();
		make();
		addEvent();
	}
	/**
	 * 사용할 컴포넌트 생성
	 */
	public void init() {
		// 생성
		f = new Frame("My Frame");
		b1 = new Button("ADD");
		b2 = new Button("SELECT");
		p1 = new Panel();
		p2 = new Panel();
		main = new Panel();
		mainT = new TextField();
		t1 = new TextField();
		t2 = new TextField();
		t3 = new TextField();
		list = new List();
		
	}
	
	/**
	 * UI 만들기
	 */
	public void make() {
		// frame에 버튼 붙이기
//		f.add(b1, "North");		// parameter 두개를 쓰면 버튼의 위치를 조정할 수 있다.
								// awt는 그들만의 레이아웃이 있어서 원하는대로 만들기 쉽지 않다.
								// frame 레이아웃을 바꿔주자
		
		// 판떼기 색 조정
		p1.setBackground(Color.red);
		p2.setBackground(Color.green);
		
		p2.setLayout(new BorderLayout());		// p2 판떼기의 레이아웃을 동서남북으로 바꾼다.
		p2.add(list, "Center");			// p2 패널에 list를 붙인다.
		p2.add(b2,"South");
		
		// p1 판떼기에 버튼 붙이는데 옹졸하게 붙음 -> 판넬 레이아웃도 바꾸자.
		p1.setLayout(new GridLayout(6, 1));	// 바둑판 6행 1열
		// p1에 Text field 붙이기
		p1.add(t1);		// id, pw, name 쓰는 곳
		p1.add(t2);
		p1.add(t3);
		// p1에 버튼 붙이기
		p1.add(b1);		
		
		// 레이아웃을 커스텀한다
		main.setLayout(new GridLayout(1, 2));	// 바둑판처럼 나눠라. 1행 2열
		
		// 레이아웃에 판떼기 붙이기 (빨강이 왼쪽 반, 파랭이 오른쪽 반)
		main.add(p1);
		main.add(p2);
		
		// 메인 패널을 frame에 붙이기
		f.add(main,"Center");
		// 메인 Text field를 frame 밑에 붙이기
		f.add(mainT,"South");
		
		// frame의 사이즈 정하기
		f.setSize(500,500);
		
		// 화면에 frame이 보여지게 하기
		f.setVisible(true);
	}
	
	/**
	 * frame에 이벤트 붙이기
	 */
	public void addEvent() {
		
		// 리스트 이벤트
		list.addActionListener(new ActionListener() {
			/**
			 * 리스트 안의 정보를 눌렀을 때, mainT에 해당 정보를 보여주기
			 * 됨??
			 */
			@Override
			public void actionPerformed(ActionEvent e) {
				// 1. 리스트 클릭했을 때의 위치를 알 수 있다.
				int target = list.getSelectedIndex();
//				mainT.setText(target + "");		// target이라는 int 타입 변수를 걍 String으로 만드는 법. +""
				// 2. 그 위치와 list안의 index 매치
				CustVo cust = clist.get(target);
				// 3. 가져와서 mainT에 쏴준다.
				String s = cust.getId() + " " + cust.getPwd() + " " + cust.getName();
				mainT.setText(s);

			}
		});
		// 버튼을 클릭 했을 때의 이벤트
		b1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// 정보 입력
				String id = t1.getText();
				String pw = t2.getText();
				String name = t3.getText();
				CustVo v = new CustVo(id,pw,name);
				try {
					dao.insert(v);
					// text field들에서 글을 지운다.
					t1.setText("");
					t2.setText("");
					t3.setText("");
					// 결과를 알려준다
					mainT.setText(id+" Insert OK");
					
				} catch (Exception e1) {
					// text field들에서 글을 지운다.
					t1.setText("");
					t2.setText("");
					t3.setText("");
					mainT.setText("Insert Error... !!!");
				}
			}

		});
		
		b2.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				try {
					clist = dao.selectAll();
					for (CustVo c : clist) {
						// list에는 text밖에 안 들어가서 text를 만들어 줘야함.
						String str = c.getId() + " " + c.getPwd() + " " + c.getName();
						list.add(str);
						// 출력한 정보의 수
						mainT.setText(clist.size()+": Completed!");
					}
				} catch (Exception e1) {
					
					e1.printStackTrace();
				}
				
			}
		});
		
		// frame 이벤트
		f.addWindowListener(new WindowAdapter() {

			/**
			 * frame 종료
			 */
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
			
		});
	}
	
	
}
