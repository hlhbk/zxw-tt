package GUI;
import java.awt.*;

import javax.swing.*;

import java.awt.event.*;
public class T15 extends JFrame{
	JMenuBar MB;//菜单面板
	JMenu file,edit,format,view,help;//不是最终的，，有下一级
	JMenu f1,f2;//加在文件下面的两个子菜单
	JMenuItem t1,t2,t3,t4,t5,t6,t7;//最终的，，直接出现最后效果
	
	JToolBar tool;
	JButton b1,b2,b3,b4,b5,b6;
	
	JTextArea ta;
	JScrollPane ssp;
	public T15() {
		// TODO Auto-generated constructor stub
		tool=new JToolBar();
		b1=new JButton(new ImageIcon("image001/1.gif"));
		b1.setToolTipText("新建");//光标放在上面显示文字
		b2=new JButton(new ImageIcon("image001/1.gif"));
		b2.setToolTipText("打开");
		b3=new JButton(new ImageIcon("image001/1.gif"));
		b3.setToolTipText("保存");
		b4=new JButton(new ImageIcon("image001/1.gif"));
		b4.setToolTipText("打印");
		b5=new JButton(new ImageIcon("image001/1.gif"));
		b5.setToolTipText("吃饭");
		b6=new JButton(new ImageIcon("image001/1.gif"));
		b6.setToolTipText("肯德基");
		tool.add(b1);tool.add(b2);tool.add(b3);
		tool.add(b4);tool.add(b5);tool.add(b6);
		
		t1=new JMenuItem("傻子呀");t2=new JMenuItem("没有？");
		t3=new JMenuItem("打印(P)");t3.setMnemonic('P');//设置快捷键
		t4=new JMenuItem("不哭");
		t5=new JMenuItem("蛋蛋(D)");t5.setMnemonic('D');
		t6=new JMenuItem("观世音");
		t7=new JMenuItem("猪头(M)");t7.setMnemonic('M');
		
		f1=new JMenu("新建(ctrl+n)");f1.setMnemonic('N');
		f1.add(t1);f1.add(t2);	
		f2=new JMenu("保存(ctrl+s)");f2.setMnemonic('S');
		f2.add(t3);
		file=new JMenu("文件(F)");file.setMnemonic('F');
		file.add(f1);file.add(f2);
		file.addSeparator();//加上分割线
		file.add(t4);file.add(t5);file.add(t6);
		file.addSeparator();
		file.add(t7);
		edit=new JMenu("编辑(E)");edit.setMnemonic('E');
		format=new JMenu("格式(O)");format.setMnemonic('O');
		view=new JMenu("查看(V)");view.setMnemonic('V');
		help=new JMenu("帮助(H)");help.setMnemonic('H');
		
		MB=new JMenuBar();
		MB.add(file);MB.add(edit);MB.add(format);MB.add(view);MB.add(help);
		ta=new JTextArea();
		ssp=new JScrollPane(ta);
		this.setJMenuBar(MB);//设置菜单栏
		this.add(tool,BorderLayout.NORTH);
		this.add(ssp);
		this.setTitle("记事本");
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
		new T15();
	}
}
