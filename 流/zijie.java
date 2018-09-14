package 流;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class zijie {

	public zijie() throws Exception{
		// TODO Auto-generated constructor stub
		FileInputStream in=new FileInputStream("F:/KwDownload/song/xiazi.mp3");
		FileOutputStream out=new FileOutputStream("F:/KwDownload/song/x.mp3");
		
		int aa=in.read();
		while(aa!=-1){
			out.write(aa);
			aa=in.read();
		}
		out.flush();//将流中残留全部输出，写在文件关闭之前
		in.close();
		out.close();
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		new zijie();
	}

}
