package ��;

import java.io.PrintStream;

public class PrinS {

	/**
	 * @param args
	 */
	public static void main(String[] args){
		// TODO Auto-generated method stub
		try{
		PrintStream p1=new PrintStream("src/��/PrinS.txt");
		PrintStream err=new PrintStream("src/��/PrinS01.txt");
		System.setOut(p1);//�������λ�ã���Ĭ����ʾ̨
		System.out.println("��Һã�����");
		System.setErr(err);//���ó��ִ����쳣ʱ�������������·��
		}
		catch(Exception e){
			System.out.println("�����쳣");
		}
	}

}
