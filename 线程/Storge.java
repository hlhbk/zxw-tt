package �߳�;

public class Storge {
	char[] sto=new char[5];
	int index;
	public synchronized void product(char aa){
		while(index==sto.length){
			try{
				this.wait();
			}catch(Exception e){
				
			}
			this.notify();//����ǰ�̴߳�����ͣ����״̬�������������߳�
		}
		sto[index]=aa;
		System.out.println("����������"+(index+1)+"����Ʒ��"+aa);
		index++;
	}
	public synchronized void consume(){
		char aa;
		while(index==0){
			try{
				this.wait();
			}catch(Exception e){
				
			}
		}
		this.notify();
		aa=sto[index-1];
		System.out.println("�������ѵ��ǵ�"+index+"����Ʒ��"+aa);
		
		index--;
	
	}
	public static void main(String[] args){
		Storge st=new Storge();
		Product p=new Product(st);
		Consume c=new Consume(st);
		p.start();
		c.start();
	}
}
class Product extends Thread{
	char aa;
	Storge sto;
	public Product(Storge sto){
		this.sto=sto;
	}
	public void run(){
		for(int i=0;i<26;i++){
			aa=(char)('A'+i);
			this.sto.product(aa);

		}
	}
	
}
class Consume extends Thread{
	Storge sto;
	public Consume(Storge sto){
		this.sto=sto;
	}
	public void run(){
			for(int i=0;i<26;i++){
			this.sto.consume();
			
			}	
	}
}