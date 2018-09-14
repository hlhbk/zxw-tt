package GUI;

import java.awt.*;
import javax.swing.*;
public class T10 extends JFrame{
	JPanel p1,p2,p3;
	JButton b1,b2;
	JLabel label1,label2,label3,label4,label5,label6,label7;
	JCheckBox bb1,bb2,bb3;
	JRadioButton r1,r2;
	ButtonGroup group;//单选按钮组中只能选一个
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new T10();
	}
	public T10() {
			// TODO Auto-generated constructor stub
		p1=new JPanel();
		label1=new JLabel("特长	:  ");label2=new JLabel("	运动");label3=new JLabel("	音乐");label4=new JLabel("	舞蹈");
		bb1=new JCheckBox();bb2=new JCheckBox();bb3=new JCheckBox();
		p1.add(label1);p1.add(label2);p1.add(bb1);p1.add(label3);p1.add(bb2);
		p1.add(label4);p1.add(bb3);
		
		p2=new JPanel();
		label5=new JLabel("性别	: ");label6=new JLabel("	男");label7=new JLabel("		女");
		r1=new JRadioButton();r2=new JRadioButton();
		group=new ButtonGroup();
		group.add(r1);group.add(r2);
		p2.add(label5);p2.add(label6);p2.add(r1);p2.add(label7);p2.add(r2);
		
		p3=new JPanel();
		b1=new JButton("注册");b2=new JButton("取消");
		p3.add(b1);p3.add(b2);
		
		this.setLayout(new GridLayout(3,1));
		this.add(p1);this.add(p2);this.add(p3);
		
		this.setTitle("用户注册");
		this.setIconImage((new ImageIcon("image001/me.jpg")).getImage());
		this.setLocation(300,400);
		this.setSize(300,150);
		this.setVisible(true);
		this.setResizable(false);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		}

}
