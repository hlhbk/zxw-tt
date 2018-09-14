package 流;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;

public class DataLiu {

	public DataLiu() throws Exception{
		// TODO Auto-generated constructor stub
		ByteArrayOutputStream DataArrOS=new ByteArrayOutputStream();//字节数组输出流
		DataOutputStream DataOS=new DataOutputStream(DataArrOS);//将字节数组输出流放进一个数据输出流
		long aa=123456789;
		DataOS.writeLong(aa);//将aa写进输出流中
		
		byte[] bb=DataArrOS.toByteArray();//将输入流中的字节数组取出
		ByteArrayInputStream DataArrIS=new ByteArrayInputStream(bb);//将字节数组放入字节数组输入流，初始化
		DataInputStream DataIS=new DataInputStream(DataArrIS);//将字节数组输入流放入一个数据流
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
