package �߳�;

public class xc4 implements Runnable {
	public static int Tickets = 100;
	String aa = new String("1");// �ַ���������㶨��
	@Override
	public void run() {
		// TODO Auto-generated method stub
		// �ȿ������δ����飬�ֿ������κ����������κ���ʱ����Ҫ����Ĳ����൱��Ĭ����this
		// ʹ������Ͻ�Ĳ���Ϊһ�����壬��Ҫôȫ��ִ���꣬��Ҫô��ִ��
		while (true) {
			synchronized (aa)
			{
				if (Tickets > 0) {

					System.out.println("��" + Thread.currentThread().getName()
							+ "����������" + (101 - Tickets) + "��Ʊ");// �����߳�ִ�������֮���ִ�������߳�ȥ��
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
