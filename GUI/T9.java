package GUI;
import java.awt.*;
import javax.swing.*;
public class T9 extends JFrame{
	JPanel p1,p2,p3;
	JButton b1,b2,b3;
	JLabel label1,label2;
	JTextField textf;
	JPasswordField password;
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new T9();
	}
	public T9() {
			// TODO Auto-generated constructor stub
		p1=new JPanel();
		label1=new JLabel("ÕËºÅ");textf=new JTextField(16);
		p1.add(label1);p1.add(textf);
		
		p2=new JPanel();
		label2=new JLabel("ÃÜÂë");password=new JPasswordField(16);
		p2.add(label2);p2.add(password);
		
		p3=new JPanel();
		b1=new JButton("×¢²á");b2=new JButton("µÇÂ¼");b3=new JButton("È¡Ïû");
		p3.add(b1);p3.add(b2);p3.add(b3);
		
		this.setLayout(new GridLayout(3,1));
		this.add(p1);this.add(p2);this.add(p3);
		
		this.setTitle("ÓÃ»§µÇÂ¼");
		this.setIconImage((new ImageIcon("image001/me.jpg")).getImage());
		this.setLocation(300,400);
		this.setSize(300,150);
		this.setVisible(true);
		this.setResizable(false);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		}

}
