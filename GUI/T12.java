package GUI;
import java.util.*;
import java.awt.*;
import javax.swing.*;
public class T12 extends JFrame{
	JPanel p1,p2;
	
	String[] str={"�����","�׹Ǿ�","������","������","��ʴ��","����Ȯ"};
	JList list;
	JScrollPane sp;
	JTextField tf;
	JButton send;
	//JScrollBar bar1,bar2;
	JScrollPane jsp;
	JTextArea ta;
	public T12() {
		// TODO Auto-generated constructor stub
		p1=new JPanel();
		p2=new JPanel();
		
		list=new JList(str);
		list.setVisibleRowCount(1);
		sp=new JScrollPane(list);
		tf=new JTextField(10);
		send=new JButton("����");
		p1.add(sp);	p1.add(tf);	p1.add(send);
		
		//bar1=new JScrollBar(JScrollBar.HORIZONTAL);
		//bar2=new JScrollBar(JScrollBar.VERTICAL);
		ta=new JTextArea();
		ta.setText("�Ҳ�������ܣ�");
		ta.setEditable(false);
		jsp=new JScrollPane(ta);
		//ta.add(bar1);
		//ta.add(bar2);
		this.add(jsp);
		this.add(p1,BorderLayout.SOUTH);
		this.setTitle("���촰��");
		this.setIconImage((new ImageIcon("image001")).getImage());
		this.setLocation(400,500);
		this.setSize(500, 400);
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new T12();

	}

}
