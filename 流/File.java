package 流;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class File {

	public File() throws Exception {
		// TODO Auto-generated constructor stub
		FileReader f=new FileReader("C:/Users/hasee/Desktop/PLAN.txt");//字符流一次读取两个字节
		//FileInputStream instr=new FileInputStream("C:/Users/hasee/Desktop/PLAN.txt");//一字符=两个字节，，
		//所以字节流不能用在汉字上，，汉字只能用字符流读写
		//字符流只能复制文本文件，，字节流可以用于所有文件
		int zifu;
		zifu=f.read();
		while(zifu!=-1){//字符的ASCII值最小为0
			System.out.print((char)zifu);
			zifu=f.read();//读取必须放在整型变量中，，只有什么都没有时才会返回-1
		}
		f.close();
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		new File();

	}

}
