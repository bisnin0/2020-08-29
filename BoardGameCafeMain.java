import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;

import javax.swing.AbstractButton;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTabbedPane;
import javax.swing.JTextArea;
import javax.swing.KeyStroke;
import javax.swing.ScrollPaneConstants;


/*
	���� � -> ���� ����, ���� ����, â �ݱ�
	�޸�  -> �޸� ����, �޸� ����
	
	������� = ���� ���¶�� ���� ��� ����. ��������
	
	���� ���� = ��� �����͸� �� ���̺� �����ϰ� ��� ������ �ʱ�ȭ �� ���� ����
	
	
 	�޴��ٿ� ����Ű �����ϱ�.
 
 
 */

public class BoardGameCafeMain extends JFrame implements Runnable, ActionListener{
	Font font1 = new Font("Arial", Font.BOLD, 60);
	Font font2 = new Font("���� ���", Font.BOLD, 15);
	Font font3 = new Font("���� ���", Font.BOLD, 35);
	ImageIcon ii1 = new ImageIcon("img/6.jpg"); // ȸ�� ���� ��
	ImageIcon ii2 = new ImageIcon("img/1.jpg"); // ȸ�� ���� ��
//	BufferedImage m = ImageIO.read(new File("img/1.jpg"));
	
	JMenuBar mb = new JMenuBar();
		JMenu departmentMenu = new JMenu("�");
			JMenuItem openMenu = new JMenuItem("���� ����");
			JMenuItem closeMenu = new JMenuItem("���� ����");
		JMenu memoMenu = new JMenu("�޸�");
			JMenuItem newMemo = new JMenuItem("�� �޸�");
			JMenuItem openMemo = new JMenuItem("�޸� ����");
			JMenuItem saveMemo = new JMenuItem("�޸� ����");
			
	JTabbedPane main = new JTabbedPane(); 
		JPanel departmentPane = new JPanel(new GridLayout(5,4,10,10));
		JPanel tt1 = new JPanel();
//		JPanel ttt1 = new JPanel();
//		JLabel t1 = new JLabel("�׽�Ʈ");
		JButton t1 = new JButton("��ư�׽�Ʈ");
		JButton t2 = new JButton("��ư�׽�Ʈ2");
		JButton t3 = new JButton("��ư�׽�Ʈ2");
		JButton t4 = new JButton("��ư�׽�Ʈ2");
		JButton t5 = new JButton("��ư�׽�Ʈ2");
		JButton t6 = new JButton("��ư�׽�Ʈ2");
		JButton t7 = new JButton("��ư�׽�Ʈ2");
		JButton t8 = new JButton("��ư�׽�Ʈ2");
		JButton t9 = new JButton("��ư�׽�Ʈ2");
		JButton t10 = new JButton("��ư�׽�Ʈ2");
		JButton t11 = new JButton("��ư�׽�Ʈ2");
		JButton t12 = new JButton("��ư�׽�Ʈ2");
		JButton t13 = new JButton("��ư�׽�Ʈ2");
		JButton t14 = new JButton("��ư�׽�Ʈ2");
		JButton t15 = new JButton("��ư�׽�Ʈ2");
		JButton t16 = new JButton("��ư�׽�Ʈ2");
		JButton t17 = new JButton("��ư�׽�Ʈ2");
		JButton t18 = new JButton("��ư�׽�Ʈ2");
		JButton t19 = new JButton("��ư�׽�Ʈ2");
		JButton t20 = new JButton("��ư�׽�Ʈ2");
	String table[] = {"t1", "t2", "t3", "t4", 
					  "t5", "t6", "t7", "t8", 
					  "t9", "t10", "t11", "t12", 
					  "t13", "t14", "t15", "t16", 
					  "t17", "t18", "t19", "t20"};
	
		JPanel memberPane = new JPanel();
		JPanel merPane = new JPanel();
		JPanel managePane = new JPanel();
		JPanel reportPane = new JPanel();
		
		
	
	JPanel rightPane = new JPanel(new BorderLayout());
		JLabel teamLbl = new JLabel("0 / 20");	
		JTextArea memoTa = new JTextArea("�ٹ��� �޸���");
		JScrollPane memoJp = new JScrollPane(memoTa);
		JLabel tableInfoLbl = new JLabel(); 
	public BoardGameCafeMain() {
		super("�������ī�� �������α׷�");
		
		//�޴��� ����
		openMenu.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_O, ActionEvent.CTRL_MASK));
		closeMenu.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_P, ActionEvent.CTRL_MASK));
		newMemo.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_N, ActionEvent.ALT_MASK));
		openMemo.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_O, ActionEvent.ALT_MASK));
		saveMemo.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S, ActionEvent.ALT_MASK));
		
		departmentMenu.setFont(font2); 		memoMenu.setFont(font2);
		openMenu.setFont(font2); 	closeMenu.setFont(font2);
		newMemo.setFont(font2);		openMemo.setFont(font2);		saveMemo.setFont(font2);
		
		mb.add(departmentMenu); mb.add(memoMenu);
		departmentMenu.add(openMenu); departmentMenu.add(closeMenu);
		memoMenu.add(newMemo); memoMenu.add(openMemo); memoMenu.add(saveMemo);
		setJMenuBar(mb);
		
		
		//������� �г� ����
		
		departmentPane.setBackground(new Color(100,100,100));
		
		departmentPane.add(t1); departmentPane.add(t2);	departmentPane.add(t3); departmentPane.add(t4);
		departmentPane.add(t5); departmentPane.add(t6);	departmentPane.add(t7); departmentPane.add(t8);
		departmentPane.add(t9); departmentPane.add(t10);	departmentPane.add(t11); departmentPane.add(t12);
		departmentPane.add(t13); departmentPane.add(t14);	departmentPane.add(t15); departmentPane.add(t16);
		departmentPane.add(t17); departmentPane.add(t18);	departmentPane.add(t19); departmentPane.add(t20);
		
		
		//����ȭ�� �Ǳ�ɱ���.
		main.setFont(font3);
		main.add("���� ����", departmentPane); 	main.add("ȸ�� ����", memberPane);
		main.add("��ǰ ����", merPane); 		main.add("� ��Ȳ", managePane);
		main.add("����", reportPane); 		add(main, BorderLayout.CENTER);

				
		//����ȭ�� ������ â ����  
		teamLbl.setFont(font1); 			
		teamLbl.setHorizontalAlignment(JLabel.CENTER);
		memoJp.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
		memoJp.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		tableInfoLbl.setPreferredSize(new Dimension(300, 600));

		//����ȭ�� ������ �������̺�, �޸���, ���̺� ����
		rightPane.add(teamLbl, BorderLayout.NORTH); 		rightPane.add(memoJp, BorderLayout.CENTER); 
		rightPane.add(tableInfoLbl, BorderLayout.SOUTH); 	add(rightPane, BorderLayout.EAST);
		
		
		
		setSize(1300,900);
		setVisible(true);
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		
		Thread th1 = new Thread(this);
		th1.start();
		
		t1.addActionListener(this);
		
		System.out.println("dd");
	}

	public void run() {
		int a = 13;
		while(true) {
			
			a++;
		try {
			Thread.sleep(1000);
		}catch(Exception e) {}
//		t1.setPreferredSize(new Dimension(200, 100));
//		t1.setText("<html> <p style=\"text-align:right;\">"+a+"��� ����"+a+"<br/>��ȯ<br/>�̷���<br />"+a+"ǥ�õǳ�?</p></html>");
//		t1.setAlignmentX(JButton.RIGHT);
////		t1.setHorizontalTextPosition(textPosition);
//		t1.setHorizontalTextPosition(JButton.RIGHT); // �ؽ�Ʈ ���
//		t1.setHorizontalAlignment(JLabel.CENTER);
//		t1.setHorizontalAlignment(JLabel.RIGHT);
		try {
			Thread.sleep(1000);
		}catch(Exception e) {}
//		t2.setIcon(ii1);
		try {
			Thread.sleep(1000);
		}catch(Exception e) {}
//		t1.setIcon(ii1);
		try {
			Thread.sleep(1000);
		}catch(Exception e) {}
//		t1.setText{"<html><p>���� ����</p><br />  <p align=\"center\">��� ����</p> <p align=\"right\">������ ����</p></html>"};
		t1.setIcon(ii2);
//		t1.setText("ddd");
//		t1.setHorizontalTextPosition(JButton.CENTER); // �ؽ�Ʈ ���
//		t1.setHorizontalTextPosition(JLabel.CENTER); // �ؽ�Ʈ ���
		}
	}
	
	public void actionPerformed(ActionEvent ae) {
		System.out.println("dddd");
	}
	
	
	public static void main(String[] args) {
		new BoardGameCafeMain();
	}
}
