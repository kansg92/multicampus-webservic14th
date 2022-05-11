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

import dao.BookDao;
import frame.Dao;
import vo.BookVo;


public class UI {
	
	Dao<String, BookVo> dao;
	java.util.List<BookVo> blist;
	
	Frame f;
	Button b1,b2,b3,b4;
	Panel p1,p2,p3,p4;
	Panel main;
	TextField t1, t2, t3;
	TextField mainT;
	List list;
	
	// Constructor
	public UI() {
		dao = new BookDao();
		init();
		make();
		addEvent();
	}


	private void init() {
		// 생성
		f = new Frame("도서 대여 서비스");
		b1 = new Button("Enter");
		b2 = new Button("All");
		b3 = new Button("lend");
		b4 = new Button("Return");
		p1 = new Panel();
		p2 = new Panel();
		p3 = new Panel();
		p4 = new Panel();
		main = new Panel();
		mainT = new TextField();
		t1 = new TextField();
		t2 = new TextField();
		t3 = new TextField();
		list = new List();
				
	}

	private void make() {
		p1.setBackground(Color.red);
		p2.setBackground(Color.blue);
		p2.setBackground(Color.green);
		p2.setBackground(Color.white);
		
		p4.setLayout(new BorderLayout());		// p2 판떼기의 레이아웃을 동서남북으로 바꾼다.
		p4.add(list, "Center");			// p2 패널에 list를 붙인다.
		p4.add(b2,"North");
		
		// 해당도서 있는지 확인.
		p1.setLayout(new GridLayout(1, 2));
		// p1에 Text field 붙이기
		p1.add(t1);			
		// p1에 버튼 붙이기
		p1.add(b1);		
		
		// 도서 대여.
		p2.setLayout(new GridLayout(1, 2));
		// p1에 Text field 붙이기
		t2.setSize(800, 100);
		p2.add(t2, "West");	
		// p1에 버튼 붙이기
		b3.setSize(100, 100);
		p2.add(b3, "East");		

		
		
		// 도서 반납
		p3.setLayout(new GridLayout(1, 2));
		// p1에 Text field 붙이기
		p3.add(t3, "West");			
		// p1에 버튼 붙이기
		p3.add(b4, "East");	
		// 레이아웃을 커스텀한다
		main.setLayout(new GridLayout(4, 2));	// 바둑판처럼 나눠라. 4행 2열
		
		
		// 레이아웃에 판떼기 붙이기 
		main.add(p1);
		main.add(p2);
		main.add(p3);
		main.add(p4);
		
		// 메인 패널을 frame에 붙이기
		f.add(main,"Center");
		// 메인 Text field를 frame 밑에 붙이기
		f.add(mainT,"South");
		
		// frame 사이즈 정하기
		f.setSize(600, 300);
		
		// 화면에 frame이 보여지게 하기.
		f.setVisible(true);
		
		
	}

	private void addEvent() {
		// TODO Auto-generated method stub
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
				BookVo book = blist.get(target);
				// 3. 가져와서 mainT에 쏴준다.
				String s = book.getId() + " " + book.getTitle() + " " + book.getAuthor()+ " " + book.getIsbn()+ " " + book.getStatus();
				mainT.setText(s);
			}
		});
		b1.addActionListener(new ActionListener() {
			
			
			public void actionPerformed(ActionEvent e) {
				String title = t1.getText();
				BookVo book = new BookVo();
				try {
					dao.select(title);
					t1.setText("");	
					mainT.setText(book.getId() + " " + book.getTitle() + " " + book.getAuthor()+ " " + book.getIsbn()+ " " + book.getStatus());
				} catch (Exception e1) {
					t1.setText("");
					mainT.setText("조회오류..... 해당 도서는 존재하지 않습니다.");
				}
			
			
			}
					
		});
		
		b2.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				try {
					blist = dao.selectAll();
					for (BookVo b : blist) {
						// list에는 text밖에 안 들어가서 text를 만들어 줘야함.
						String str = "id: "+b.getId() + "  title: " + b.getTitle() + "  author: " + b.getAuthor()+ "  Isbn: " + b.getIsbn()+ "  status: " + b.getStatus();
						list.add(str);
						// 출력한 정보의 수
						mainT.setText(blist.size()+": Completed!");
					}
				} catch (Exception e1) {
					
					e1.printStackTrace();
				}
				
			}
		});
		
		b3.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				String title = t2.getText();
				try {
					dao.update0(title);
					t1.setText("");
					mainT.setText(title + "  도서 대출이 완료 되었습니다.");
				} catch (Exception e1) {
					mainT.setText("조회오류..... 해당 도서는 존재하지 않습니다.");
				}
			}
			
		});
		
		b4.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				String title = t3.getText();
				try {
					dao.update1(title);
					t1.setText("");
					mainT.setText(title + "  도서 반납이 완료 되었습니다.");
				} catch (Exception e1) {
					mainT.setText("조회오류..... 해당 도서는 존재하지 않습니다.");
				}
			}
			
		});
		
		
		
		
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
