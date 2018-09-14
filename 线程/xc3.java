package 线程;

public class xc3 extends Thread{
	public void run(){
		System.out.println(Thread.currentThread().getName()+"   在执行");
	}
	public static void main(String[] args){
		xc3 x1=new xc3();
		x1.setName("001");
		xc3 x2=new xc3();
		x2.setName("线程");
		xc3 x3=new xc3();
		x3.setName("线程33333");
		xc3 x4=new xc3();
		x4.setName("线程44");
		x1.start();
		x2.start();
		x3.start();
		x4.start();
		//x4.setPriority(Thread.NORM_PRIORITY+3);//默认为5，，+3为8
		//System.out.println("5");
	}

}
