package 流;

import java.io.PrintStream;

public class PrinS {

	/**
	 * @param args
	 */
	public static void main(String[] args){
		// TODO Auto-generated method stub
		try{
		PrintStream p1=new PrintStream("src/流/PrinS.txt");
		PrintStream err=new PrintStream("src/流/PrinS01.txt");
		System.setOut(p1);//设置输出位置，，默认显示台
		System.out.println("大家好！！！");
		System.setErr(err);//设置出现错误异常时，，处理输出的路径
		}
		catch(Exception e){
			System.out.println("出现异常");
		}
	}

}
