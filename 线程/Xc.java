package 线程;

public class Xc extends Thread{//继承线程类，，直接new对象然后启用start()

	public void run(){
		for(int i=0;i<20;i++){
			System.out.println(i+1);
		}
	
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Xc xiancheng=new Xc();
		xiancheng.start();
		for(int j=0;j<50;j++){
			System.out.println("00000000"+(j+1));
		}

	}

}
