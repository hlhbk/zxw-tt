package 线程;

public class xc4 implements Runnable {
	public static int Tickets = 100;
	String aa = new String("1");// 字符串可以随便定义
	@Override
	public void run() {
		// TODO Auto-generated method stub
		// 既可以修饰代码块块，又可以修饰函数，，修饰函数时不需要后面的参数相当于默认是this
		// 使其所管辖的部分为一个整体，，要么全部执行完，，要么不执行
		while (true) {
			synchronized (aa)
			{
				if (Tickets > 0) {

					System.out.println("第" + Thread.currentThread().getName()
							+ "正在售卖第" + (101 - Tickets) + "张票");// 可能线程执行完这句之后就执行其他线程去了
					--Tickets;
				} 
				else {
					break;
				}
			}
		}

	}

	

	public static void main(String[] args) {
		xc4 xx1 = new xc4();
		Thread tt1 = new Thread(xx1);tt1.start();
		tt1.setName("001");
		//xc4 xx2 = new xc4();
		Thread tt2 = new Thread(xx1);tt2.start();
		tt2.setName("002");
		//xc4 xx3 = new xc4();
		Thread tt3 = new Thread(xx1);tt3.start();
		tt3.setName("003");
		//xc4 xx4 = new xc4();
		Thread tt4 = new Thread(xx1);tt4.start();
		tt4.setName("004");
		
		
		
		
	}
}
