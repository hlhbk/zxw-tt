package ��;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class File {

	public File() throws Exception {
		// TODO Auto-generated constructor stub
		FileReader f=new FileReader("C:/Users/hasee/Desktop/PLAN.txt");//�ַ���һ�ζ�ȡ�����ֽ�
		//FileInputStream instr=new FileInputStream("C:/Users/hasee/Desktop/PLAN.txt");//һ�ַ�=�����ֽڣ���
		//�����ֽ����������ں����ϣ�������ֻ�����ַ�����д
		//�ַ���ֻ�ܸ����ı��ļ������ֽ����������������ļ�
		int zifu;
		zifu=f.read();
		while(zifu!=-1){//�ַ���ASCIIֵ��СΪ0
			System.out.print((char)zifu);
			zifu=f.read();//��ȡ����������ͱ����У���ֻ��ʲô��û��ʱ�Ż᷵��-1
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
