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
		// ����
		f = new Frame("���� �뿩 ����");
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
		
		p4.setLayout(new BorderLayout());		// p2 �Ƕ����� ���̾ƿ��� ������������ �ٲ۴�.
		p4.add(list, "Center");			// p2 �гο� list�� ���δ�.
		p4.add(b2,"North");
		
		// �ش絵�� �ִ��� Ȯ��.
		p1.setLayout(new GridLayout(1, 2));
		// p1�� Text field ���̱�
		p1.add(t1);			
		// p1�� ��ư ���̱�
		p1.add(b1);		
		
		// ���� �뿩.
		p2.setLayout(new GridLayout(1, 2));
		// p1�� Text field ���̱�
		t2.setSize(800, 100);
		p2.add(t2, "West");	
		// p1�� ��ư ���̱�
		b3.setSize(100, 100);
		p2.add(b3, "East");		

		
		
		// ���� �ݳ�
		p3.setLayout(new GridLayout(1, 2));
		// p1�� Text field ���̱�
		p3.add(t3, "West");			
		// p1�� ��ư ���̱�
		p3.add(b4, "East");	
		// ���̾ƿ��� Ŀ�����Ѵ�
		main.setLayout(new GridLayout(4, 2));	// �ٵ���ó�� ������. 4�� 2��
		
		
		// ���̾ƿ��� �Ƕ��� ���̱� 
		main.add(p1);
		main.add(p2);
		main.add(p3);
		main.add(p4);
		
		// ���� �г��� frame�� ���̱�
		f.add(main,"Center");
		// ���� Text field�� frame �ؿ� ���̱�
		f.add(mainT,"South");
		
		// frame ������ ���ϱ�
		f.setSize(600, 300);
		
		// ȭ�鿡 frame�� �������� �ϱ�.
		f.setVisible(true);
		
		
	}

	private void addEvent() {
		// TODO Auto-generated method stub
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
				BookVo book = blist.get(target);
				// 3. �����ͼ� mainT�� ���ش�.
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
					mainT.setText("��ȸ����..... �ش� ������ �������� �ʽ��ϴ�.");
				}
			
			
			}
					
		});
		
		b2.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				try {
					blist = dao.selectAll();
					for (BookVo b : blist) {
						// list���� text�ۿ� �� ���� text�� ����� �����.
						String str = "id: "+b.getId() + "  title: " + b.getTitle() + "  author: " + b.getAuthor()+ "  Isbn: " + b.getIsbn()+ "  status: " + b.getStatus();
						list.add(str);
						// ����� ������ ��
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
					mainT.setText(title + "  ���� ������ �Ϸ� �Ǿ����ϴ�.");
				} catch (Exception e1) {
					mainT.setText("��ȸ����..... �ش� ������ �������� �ʽ��ϴ�.");
				}
			}
			
		});
		
		b4.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				String title = t3.getText();
				try {
					dao.update1(title);
					t1.setText("");
					mainT.setText(title + "  ���� �ݳ��� �Ϸ� �Ǿ����ϴ�.");
				} catch (Exception e1) {
					mainT.setText("��ȸ����..... �ش� ������ �������� �ʽ��ϴ�.");
				}
			}
			
		});
		
		
		
		
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
