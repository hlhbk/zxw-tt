package �߳�;

public class xc2 implements Runnable{//�̳�runnable�ӿڣ�ʵ�ֽӿ���ߵķ���

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		xc2 xc=new xc2();
		Thread th=new Thread(xc);
		th.start();
		for(int j=0;j<35;j++){
			System.out.println("������0000000"+(j+1));
		}

	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i=0;i<50;i++){
			System.out.println("�ӿ�"+(i+1));
		}
		
	}

}
