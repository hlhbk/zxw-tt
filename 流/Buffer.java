package ��;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class Buffer {

	public Buffer() throws Exception{
		// TODO Auto-generated constructor stub
		BufferedInputStream inp=new BufferedInputStream(new FileInputStream("E:/BaiduNetdiskDownload/001.mp4"));
		BufferedOutputStream outp=new BufferedOutputStream(new FileOutputStream("E:/BaiduNetdiskDownload/00002.mp4"));
		////����������Ҫ���������������ǰ���»���
		byte[] hc=new byte[4096];
		int aa;
		aa=inp.read(hc);//������һ�ζ�ȡ4096byte����hc��
		while(aa!=-1){
			outp.write(hc, 0, aa);//��hc��0����aa��д�����
			aa=inp.read(hc);
		}
		outp.flush();//�����в�������ɾ�
		inp.close();
		outp.close();
		
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		new Buffer();

	}

}
