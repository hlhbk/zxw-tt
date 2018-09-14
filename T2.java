
public class T2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		B b1=new B(20);
		B b2=new B(20);
		System.out.println(b1.equals(b2));//==比较两个对象时比的是两个对象的内存地址
		int a=1;
		int b=1;
		System.out.println(a==b);

	}

}
class B{
	private int i;
	B(int i){
		this.i=i;
	}
	boolean equals(B b){//equals是obj中的方法，，可以被任何类重写覆盖。。一般情况下都要覆盖，，根据多态结合起来，，十分强大
		if(this.i==b.i){
			return true;
		}
		else{
			return false;
		}
	}
}
class C extends B{
    private int j;
	C(int j) {
		super(j);//给C类中的J赋值给了B类中的i
		// TODO Auto-generated constructor stub
		this.j=j;
	}
	boolean equals(B b){//比较C类中的j
		C c=(C)b;//多态。。强制转换一下
		if(this.j==c.j){
			return true;
		}
		else{
			return false;
		}
	}
}
