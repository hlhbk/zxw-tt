package GUI;
import java.awt.*;

import javax.swing.*;
public class T8 extends JFrame{
	JPanel []p={null,null,null};
	JButton []b={null,null,null,null,null,null,null,null};

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new T8();
	}
	public T8(){
		p[0]=new JPanel();
		p[0].setBackground(Color.blue);
		p[0].setSize(300, 300);p[0].setVisible(true);
		p[1]=new JPanel();
		p[1].setBackground(Color.cyan);
		p[1].setSize(200, 300);p[1].setVisible(true);
		p[2]=new JPanel();
		p[2].setBackground(Color.GRAY);
		p[2].setSize(100, 300);p[2].setVisible(true);
		b[1]=new JButton("����");
		b[2]=new JButton("�㽶");
		b[3]=new JButton("������");
		b[4]=new JButton("������");
		b[5]=new JButton("��");
		b[6]=new JButton("��");
		b[7]=new JButton("��");
		b[0]=new JButton("��");
		
		p[0].add(b[1]);	p[0].add(b[2]);	p[0].add(b[3]);	p[0].add(b[4]);
		
		p[1].add(b[5],BorderLayout.EAST);	p[1].add(b[6],BorderLayout.WEST);
		p[1].add(b[7],BorderLayout.SOUTH);	p[1].add(b[0],BorderLayout.NORTH);
		
		/*p[2].setLayout(new GridLayout(4,2));
		p[2].add(b[1]);	p[2].add(b[2]);	p[2].add(b[3]);	p[2].add(b[4]);
		p[2].add(b[5]);	p[2].add(b[6]);	p[2].add(b[7]);	p[2].add(b[0]);*/
		this.setLayout(new GridLayout(1,3));
		this.add(p[0]);
		this.add(p[1]);
		this.add(p[2]);
		this.setTitle("�߽�����");
		this.setSize(600, 300);
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}
