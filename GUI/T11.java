package GUI;
import java.awt.*;
import javax.swing.*;

import java.util.*;
public  class T11 extends JFrame{
	JPanel p1,p2;
	JLabel label1,label2;
	String[] str1={"上海","江苏","南昌","合肥","北京","武汉"};
	String[] str2={"小学","初中","高中","专科","本科","硕士","博士","..."};
	JComboBox comb;//组合框，，下拉列边框
	JList list;//列表
	JScrollPane jsp;//滚动面板
	//JScrollBar bar;//滚动
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new T11();
	}
	public T11() {
		// TODO Auto-generated constructor stub
		p1=new JPanel();
		label1=new JLabel("籍贯");
		comb=new JComboBox(str1);
		p1.add(label1);p1.add(comb);
		
		p2=new JPanel();
		label2=new JLabel("学历");
		list=new JList(str2);
		list.setVisibleRowCount(1);//设置可以显示的行数
		jsp=new JScrollPane(list);//新建一个滚动面板
		p2.add(label2);p2.add(jsp);
		this.setLayout(new GridLayout(2,1));
		this.add(p1);this.add(p2);
		
		this.setTitle("用户调查");
		this.setIconImage((new ImageIcon("image001/me.jpg")).getImage());
		this.setLocation(300,400);
		this.setSize(250,200);
		this.setVisible(true);
		this.setResizable(false);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}
