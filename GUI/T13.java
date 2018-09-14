package GUI;
import java.awt.*;
import javax.swing.*;
public class T13 extends JFrame{
	String[] str={"软件开发","游戏开发","平面设计","动画制作","室内设计","会    计"};
	JList list;
	JLabel ja;
	JSplitPane split;
	public T13() {
		// TODO Auto-generated constructor stub
		list=new JList(str);
		ja=new JLabel(new ImageIcon("image001/game01.jpg"));
		split=new JSplitPane(JSplitPane.HORIZONTAL_SPLIT,list,ja);//水平方向拆分为一个列表和标签
		split.setOneTouchExpandable(true);
		//this.add(list,BorderLayout.WEST);
		//this.add(ja,BorderLayout.EAST);
		this.add(split);
		this.setTitle("Split");
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
		new T13();
	}
	
}
