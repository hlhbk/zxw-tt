import java.util.*;
public class t1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A aa=new A();
		try{
			aa.a();
		}
		catch(Exception e){
			System.out.println("��������");
		}
		finally{//���۳����Ƿ�˳�����У���finally�е���䶼��ִ�С�
			System.out.println("��������������......");
		}
		
	}

}
class A {
	void a() throws Exception
	{
		int a,b,c;
		Scanner sc=new Scanner(System.in);
		a=sc.nextInt();
		b=sc.nextInt();
		c=a%b;
		System.out.println("����Ϊ��"+c);
	}
	
}