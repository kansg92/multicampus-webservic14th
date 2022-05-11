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
 * App2���� �� UI ����
 * @author noranbear (norandoly@gmail.com)
 * @since 2022. 4. 27. ���� 10:03:50
 * @version 1.0
 */
public class UI {
	
	// �����ͺ��̽��� �����ϱ� ����
	Dao<String, CustVo> dao;
	// select ������ ���� ArrayList - ���� �̸��� �ٸ� ������ Ŭ������ ������ �̷��� �ڵ����� ������.
	java.util.List<CustVo> clist;
	
	Frame f;
	Button b1, b2;
	Panel p1, p2; 	// �Ƕ���
	Panel main;
	TextField t1, t2, t3;
	TextField mainT;
	List list;		// awt�� �ִ� list
	
	// Constructor
	public UI() {
		dao = new CustDao();	// �����ͺ��̽� ����
		init();
		make();
		addEvent();
	}
	/**
	 * ����� ������Ʈ ����
	 */
	public void init() {
		// ����
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
	 * UI �����
	 */
	public void make() {
		// frame�� ��ư ���̱�
//		f.add(b1, "North");		// parameter �ΰ��� ���� ��ư�� ��ġ�� ������ �� �ִ�.
								// awt�� �׵鸸�� ���̾ƿ��� �־ ���ϴ´�� ����� ���� �ʴ�.
								// frame ���̾ƿ��� �ٲ�����
		
		// �Ƕ��� �� ����
		p1.setBackground(Color.red);
		p2.setBackground(Color.green);
		
		p2.setLayout(new BorderLayout());		// p2 �Ƕ����� ���̾ƿ��� ������������ �ٲ۴�.
		p2.add(list, "Center");			// p2 �гο� list�� ���δ�.
		p2.add(b2,"South");
		
		// p1 �Ƕ��⿡ ��ư ���̴µ� �����ϰ� ���� -> �ǳ� ���̾ƿ��� �ٲ���.
		p1.setLayout(new GridLayout(6, 1));	// �ٵ��� 6�� 1��
		// p1�� Text field ���̱�
		p1.add(t1);		// id, pw, name ���� ��
		p1.add(t2);
		p1.add(t3);
		// p1�� ��ư ���̱�
		p1.add(b1);		
		
		// ���̾ƿ��� Ŀ�����Ѵ�
		main.setLayout(new GridLayout(1, 2));	// �ٵ���ó�� ������. 1�� 2��
		
		// ���̾ƿ��� �Ƕ��� ���̱� (������ ���� ��, �ķ��� ������ ��)
		main.add(p1);
		main.add(p2);
		
		// ���� �г��� frame�� ���̱�
		f.add(main,"Center");
		// ���� Text field�� frame �ؿ� ���̱�
		f.add(mainT,"South");
		
		// frame�� ������ ���ϱ�
		f.setSize(500,500);
		
		// ȭ�鿡 frame�� �������� �ϱ�
		f.setVisible(true);
	}
	
	/**
	 * frame�� �̺�Ʈ ���̱�
	 */
	public void addEvent() {
		
		// ����Ʈ �̺�Ʈ
		list.addActionListener(new ActionListener() {
			/**
			 * ����Ʈ ���� ������ ������ ��, mainT�� �ش� ������ �����ֱ�
			 * ��??
			 */
			@Override
			public void actionPerformed(ActionEvent e) {
				// 1. ����Ʈ Ŭ������ ���� ��ġ�� �� �� �ִ�.
				int target = list.getSelectedIndex();
//				mainT.setText(target + "");		// target�̶�� int Ÿ�� ������ �� String���� ����� ��. +""
				// 2. �� ��ġ�� list���� index ��ġ
				CustVo cust = clist.get(target);
				// 3. �����ͼ� mainT�� ���ش�.
				String s = cust.getId() + " " + cust.getPwd() + " " + cust.getName();
				mainT.setText(s);

			}
		});
		// ��ư�� Ŭ�� ���� ���� �̺�Ʈ
		b1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// ���� �Է�
				String id = t1.getText();
				String pw = t2.getText();
				String name = t3.getText();
				CustVo v = new CustVo(id,pw,name);
				try {
					dao.insert(v);
					// text field�鿡�� ���� �����.
					t1.setText("");
					t2.setText("");
					t3.setText("");
					// ����� �˷��ش�
					mainT.setText(id+" Insert OK");
					
				} catch (Exception e1) {
					// text field�鿡�� ���� �����.
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
						// list���� text�ۿ� �� ���� text�� ����� �����.
						String str = c.getId() + " " + c.getPwd() + " " + c.getName();
						list.add(str);
						// ����� ������ ��
						mainT.setText(clist.size()+": Completed!");
					}
				} catch (Exception e1) {
					
					e1.printStackTrace();
				}
				
			}
		});
		
		// frame �̺�Ʈ
		f.addWindowListener(new WindowAdapter() {

			/**
			 * frame ����
			 */
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
			
		});
	}
	
	
}
