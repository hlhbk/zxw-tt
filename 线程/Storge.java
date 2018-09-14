package 线程;

public class Storge {
	char[] sto=new char[5];
	int index;
	public synchronized void product(char aa){
		while(index==sto.length){
			try{
				this.wait();
			}catch(Exception e){
				
			}
			this.notify();//将当前线程处于暂停就绪状态，，叫醒其他线程
		}
		sto[index]=aa;
		System.out.println("正在生产第"+(index+1)+"个产品："+aa);
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
		System.out.println("正在消费的是第"+index+"个产品："+aa);
		
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