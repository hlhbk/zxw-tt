package �߳�;

public class xc3 extends Thread{
	public void run(){
		System.out.println(Thread.currentThread().getName()+"   ��ִ��");
	}
	public static void main(String[] args){
		xc3 x1=new xc3();
		x1.setName("001");
		xc3 x2=new xc3();
		x2.setName("�߳�");
		xc3 x3=new xc3();
		x3.setName("�߳�33333");
		xc3 x4=new xc3();
		x4.setName("�߳�44");
		x1.start();
		x2.start();
		x3.start();
		x4.start();
		//x4.setPriority(Thread.NORM_PRIORITY+3);//Ĭ��Ϊ5����+3Ϊ8
		//System.out.println("5");
	}

}
