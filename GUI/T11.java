package GUI;
import java.awt.*;
import javax.swing.*;

import java.util.*;
public  class T11 extends JFrame{
	JPanel p1,p2;
	JLabel label1,label2;
	String[] str1={"�Ϻ�","����","�ϲ�","�Ϸ�","����","�人"};
	String[] str2={"Сѧ","����","����","ר��","����","˶ʿ","��ʿ","..."};
	JComboBox comb;//��Ͽ򣬣������б߿�
	JList list;//�б�
	JScrollPane jsp;//�������
	//JScrollBar bar;//����
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
		label1=new JLabel("����");
		comb=new JComboBox(str1);
		p1.add(label1);p1.add(comb);
		
		p2=new JPanel();
		label2=new JLabel("ѧ��");
		list=new JList(str2);
		list.setVisibleRowCount(1);//���ÿ�����ʾ������
		jsp=new JScrollPane(list);//�½�һ���������
		p2.add(label2);p2.add(jsp);
		this.setLayout(new GridLayout(2,1));
		this.add(p1);this.add(p2);
		
		this.setTitle("�û�����");
		this.setIconImage((new ImageIcon("image001/me.jpg")).getImage());
		this.setLocation(300,400);
		this.setSize(250,200);
		this.setVisible(true);
		this.setResizable(false);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}
