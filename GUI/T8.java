package GUI;
import java.awt.*;

import javax.swing.*;
public class T8 extends JFrame{
	JPanel []p={null,null,null};
	JButton []b={null,null,null,null,null,null,null,null,null};
	JButton []bb={null,null,null,null,null,null,null,null};

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new T8();
	}
	public T8(){
		p[0]=new JPanel();
		p[1]=new JPanel();
		p[2]=new JPanel();
		
		b[1]=new JButton("西瓜");
		b[2]=new JButton("香蕉");
		b[3]=new JButton("西红柿");
		b[4]=new JButton("马铃薯");
		b[5]=new JButton("东");
		b[6]=new JButton("西");
		b[7]=new JButton("南");
		b[8]=new JButton("中");
		b[0]=new JButton("北");
		bb[0]=new JButton();bb[1]=new JButton();bb[2]=new JButton();bb[3]=new JButton();
		bb[4]=new JButton();bb[5]=new JButton();bb[6]=new JButton();bb[7]=new JButton();
		for(int i=0;i<bb.length;i++){
			bb[i].setText("00"+i);
		}
		p[0].setLayout(new FlowLayout(FlowLayout.LEFT));
		p[0].add(b[1]);	p[0].add(b[2]);	p[0].add(b[3]);	p[0].add(b[4]);
		p[1].setLayout(new BorderLayout());
		p[1].add(b[5],BorderLayout.EAST);	p[1].add(b[6],BorderLayout.WEST);
		p[1].add(b[7],BorderLayout.SOUTH);	p[1].add(b[0],BorderLayout.NORTH);
		p[1].add(b[8],BorderLayout.CENTER);
		
		p[2].setLayout(new GridLayout(4,2));
		p[2].add(bb[0]);    p[2].add(bb[1]);	p[2].add(bb[2]);	p[2].add(bb[3]);	
		p[2].add(bb[4]);    p[2].add(bb[5]);	p[2].add(bb[6]);	p[2].add(bb[7]);	
		this.setLayout(new GridLayout(1,3));
		this.add(p[0]);
		this.add(p[1]);
		this.add(p[2]);
		this.setTitle("边界试验");
		this.setSize(600, 300);
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}
