package GUI;

import javax.swing.*;
import java.awt.*;
public class T7 extends JFrame{
	JPanel p1,p2,p3,p4;
	JTextField tf;
	JButton b1,b2,b3,b4,b5,b6,b7,b8,b9;
	JButton jia,jian,cheng,chu;
	JButton dele,cle,out;

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new T7();
	}
	public T7(){
		p1=new JPanel();
		p2=new JPanel();
		p3=new JPanel();
		p4=new JPanel();
		p2.setBackground(Color.CYAN);
		tf=new JTextField();
		JButton dele=new JButton("ɾ��");JButton cle=new JButton("���");JButton out=new JButton("=");
		JButton b1=new JButton("1");JButton b2=new JButton("2");JButton b3=new JButton("3");
		JButton b4=new JButton("4");JButton b5=new JButton("5");JButton b6=new JButton("6");
		JButton b7=new JButton("7");JButton b8=new JButton("8");JButton b9=new JButton("9");
		
		JButton jia=new JButton("+");
		JButton jian=new JButton("-");
		JButton cheng=new JButton("*");
		JButton chu=new JButton("/");
		p3.setLayout(new GridLayout(4,1));
		p3.setSize(5, 30);
		p3.add(jia);	p3.add(jian);	p3.add(cheng);	p3.add(chu);//���Ӽ��˳���һ��p3��
		
		p1.setLayout(new GridLayout(4,3));
		p3.setSize(24, 30);
		p1.add(dele);p1.add(cle);p1.add(out);
		p1.add(b1);p1.add(b2);p1.add(b3);
		p1.add(b4);p1.add(b5);p1.add(b6);
		p1.add(b7);p1.add(b8);p1.add(b9);//��1~9���ַ�p1��
		p4.add(p1);	p4.add(p3);
		p2.setLayout(new GridLayout(2,1));
		p2.setSize(70, 450);
		this.setResizable(false);
		p2.add(tf);
		p2.add(p4);//���ı���Ͱ�ť��p2��
	
		this.add(p2);
		this.setTitle("������");
		this.setSize(250, 295);
		this.setLocation(300, 400);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
		this.setResizable(false);
	}

}
