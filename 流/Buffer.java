package 流;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class Buffer {

	public Buffer() throws Exception{
		// TODO Auto-generated constructor stub
		BufferedInputStream inp=new BufferedInputStream(new FileInputStream("E:/BaiduNetdiskDownload/001.mp4"));
		BufferedOutputStream outp=new BufferedOutputStream(new FileOutputStream("E:/BaiduNetdiskDownload/00002.mp4"));
		////缓冲流，，要建立输入输出流的前提下缓冲
		byte[] hc=new byte[4096];
		int aa;
		aa=inp.read(hc);//缓冲流一次读取4096byte放在hc中
		while(aa!=-1){
			outp.write(hc, 0, aa);//从hc中0处到aa处写入输出
			aa=inp.read(hc);
		}
		outp.flush();//将流中残余输出干净
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
