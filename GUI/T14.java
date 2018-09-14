package GUI;
import java.awt.*;

import javax.swing.*;
public class T14 extends JFrame{
	JLabel la;//上部
	JButton bt1,bt2,bt3; JPanel pa;//下部
	//中间
	JTabbedPane tap;//选项卡式的面板
	JPanel p1,p2,p3;
	JLabel ab1,ab2,ab3,ab4;
	JTextField tf;
	JPasswordField pf;
	JButton but;
	JCheckBox cb1,cb2;

	public T14() {
		// TODO Auto-generated constructor stub
		la=new JLabel(new ImageIcon("image001/game02.jpg"));
		
		bt1=new JButton(new ImageIcon("image001/1.gif"));
		bt2=new JButton(new ImageIcon("image001/3.gif"));
		bt3=new JButton(new ImageIcon("image001/4.gif"));
		pa=new JPanel();
		pa.add(bt1);	pa.add(bt2);	pa.add(bt3);
		
		tap=new JTabbedPane(); p1=new JPanel();p2=new JPanel();p3=new JPanel();
		//p1.setBackground(Color.GREEN);
		ab1=new JLabel("QQ  号码",JLabel.CENTER);tf=new JTextField(10);but=new JButton(new ImageIcon("image001/2.gif"));
		
		ab2=new JLabel("QQ  密码",JLabel.CENTER);pf=new JPasswordField(10);
		ab3=new JLabel("忘记密码",JLabel.CENTER);
		ab3.setFont(new Font("宋体",Font.PLAIN,16));//设置字体；；（字体，字体效果，大小）
		ab3.setForeground(Color.blue);
		
		cb1=new JCheckBox("隐身登录");cb2=new JCheckBox("记住密码");
		ab4=new JLabel("<html><a href='http//www.qq.com'>申请密码保护</a>");//链接
		ab4.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));//鼠标放上去，，光标改变
		
		
		p1.setLayout(new GridLayout(3,3));
		p1.add(ab1);p1.add(tf);p1.add(but);
		p1.add(ab2);p1.add(pf);p1.add(ab3);
		p1.add(cb1);p1.add(cb2);p1.add(ab4);
		////////
		p2.setBackground(Color.GRAY);p3.setBackground(Color.RED);
		tap.add("普通用户",p1);tap.add("QQ会员",p2);tap.add("管理员",p3);
		
		
		this.add(la,BorderLayout.NORTH);
		this.add(tap,BorderLayout.CENTER);
		this.add(pa,BorderLayout.SOUTH);
		this.setTitle("用户登录界面");
		this.setIconImage((new ImageIcon("image001/meme.jpg")).getImage());
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
		new T14();

	}

}
