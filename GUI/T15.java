package GUI;
import java.awt.*;

import javax.swing.*;

import java.awt.event.*;
public class T15 extends JFrame{
	JMenuBar MB;//�˵����
	JMenu file,edit,format,view,help;//�������յģ�������һ��
	JMenu f1,f2;//�����ļ�����������Ӳ˵�
	JMenuItem t1,t2,t3,t4,t5,t6,t7;//���յģ���ֱ�ӳ������Ч��
	
	JToolBar tool;
	JButton b1,b2,b3,b4,b5,b6;
	
	JTextArea ta;
	JScrollPane ssp;
	public T15() {
		// TODO Auto-generated constructor stub
		tool=new JToolBar();
		b1=new JButton(new ImageIcon("image001/1.gif"));
		b1.setToolTipText("�½�");//������������ʾ����
		b2=new JButton(new ImageIcon("image001/1.gif"));
		b2.setToolTipText("��");
		b3=new JButton(new ImageIcon("image001/1.gif"));
		b3.setToolTipText("����");
		b4=new JButton(new ImageIcon("image001/1.gif"));
		b4.setToolTipText("��ӡ");
		b5=new JButton(new ImageIcon("image001/1.gif"));
		b5.setToolTipText("�Է�");
		b6=new JButton(new ImageIcon("image001/1.gif"));
		b6.setToolTipText("�ϵ»�");
		tool.add(b1);tool.add(b2);tool.add(b3);
		tool.add(b4);tool.add(b5);tool.add(b6);
		
		t1=new JMenuItem("ɵ��ѽ");t2=new JMenuItem("û�У�");
		t3=new JMenuItem("��ӡ(P)");t3.setMnemonic('P');//���ÿ�ݼ�
		t4=new JMenuItem("����");
		t5=new JMenuItem("����(D)");t5.setMnemonic('D');
		t6=new JMenuItem("������");
		t7=new JMenuItem("��ͷ(M)");t7.setMnemonic('M');
		
		f1=new JMenu("�½�(ctrl+n)");f1.setMnemonic('N');
		f1.add(t1);f1.add(t2);	
		f2=new JMenu("����(ctrl+s)");f2.setMnemonic('S');
		f2.add(t3);
		file=new JMenu("�ļ�(F)");file.setMnemonic('F');
		file.add(f1);file.add(f2);
		file.addSeparator();//���Ϸָ���
		file.add(t4);file.add(t5);file.add(t6);
		file.addSeparator();
		file.add(t7);
		edit=new JMenu("�༭(E)");edit.setMnemonic('E');
		format=new JMenu("��ʽ(O)");format.setMnemonic('O');
		view=new JMenu("�鿴(V)");view.setMnemonic('V');
		help=new JMenu("����(H)");help.setMnemonic('H');
		
		MB=new JMenuBar();
		MB.add(file);MB.add(edit);MB.add(format);MB.add(view);MB.add(help);
		ta=new JTextArea();
		ssp=new JScrollPane(ta);
		this.setJMenuBar(MB);//���ò˵���
		this.add(tool,BorderLayout.NORTH);
		this.add(ssp);
		this.setTitle("���±�");
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
