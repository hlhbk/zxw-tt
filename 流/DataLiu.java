package ��;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;

public class DataLiu {

	public DataLiu() throws Exception{
		// TODO Auto-generated constructor stub
		ByteArrayOutputStream DataArrOS=new ByteArrayOutputStream();//�ֽ����������
		DataOutputStream DataOS=new DataOutputStream(DataArrOS);//���ֽ�����������Ž�һ�����������
		long aa=123456789;
		DataOS.writeLong(aa);//��aaд���������
		
		byte[] bb=DataArrOS.toByteArray();//���������е��ֽ�����ȡ��
		ByteArrayInputStream DataArrIS=new ByteArrayInputStream(bb);//���ֽ���������ֽ���������������ʼ��
		DataInputStream DataIS=new DataInputStream(DataArrIS);//���ֽ���������������һ��������
		long ss;
		ss=DataIS.readLong();
		System.out.println("s="+ss);
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		new DataLiu();

	}

}
