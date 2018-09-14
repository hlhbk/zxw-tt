import java.util.*;
public class t1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A aa=new A();
		try{
			aa.a();
		}
		catch(Exception e){
			System.out.println("输入有误！");
		}
		finally{//无论程序是否顺利进行，，finally中的语句都会执行。
			System.out.println("程序正常进行中......");
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
		System.out.println("余数为："+c);
	}
	
}