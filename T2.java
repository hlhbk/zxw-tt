
public class T2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		B b1=new B(20);
		B b2=new B(20);
		System.out.println(b1.equals(b2));//==�Ƚ���������ʱ�ȵ�������������ڴ��ַ
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
	boolean equals(B b){//equals��obj�еķ����������Ա��κ�����д���ǡ���һ������¶�Ҫ���ǣ������ݶ�̬�����������ʮ��ǿ��
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
		super(j);//��C���е�J��ֵ����B���е�i
		// TODO Auto-generated constructor stub
		this.j=j;
	}
	boolean equals(B b){//�Ƚ�C���е�j
		C c=(C)b;//��̬����ǿ��ת��һ��
		if(this.j==c.j){
			return true;
		}
		else{
			return false;
		}
	}
}
