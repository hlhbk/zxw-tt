package 线程;

public class xc2 implements Runnable{//继承runnable接口，实现接口里边的方法

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		xc2 xc=new xc2();
		Thread th=new Thread(xc);
		th.start();
		for(int j=0;j<35;j++){
			System.out.println("主函数0000000"+(j+1));
		}

	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i=0;i<50;i++){
			System.out.println("接口"+(i+1));
		}
		
	}

}
