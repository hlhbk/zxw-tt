package ������;
import java.lang.reflect.Method;
import java.util.*;

public class T6 {

	/**
	 * @param args
	 */
	public void fanxing(){
		ArrayList<drinks> shipin=new ArrayList<drinks>();
		//ArrayList shipin=new ArrayList();
		drinks d1=new drinks("����֭",8);
		shipin.add(d1);
		drinks d2=shipin.get(0);
		//snacks s1=(snacks)shipin.get(0);//��ʹ�÷���ʱ��ǿתΪ�κ����Ͳ��ᱨ����ֻ������ʱ����
		System.out.println("�����ǣ�"+d2.mingchen);
	}
	public void fanshejizhi(){
		Testify<Integer> in=new Testify<Integer>(8);
		in.showClass();
		drinks dr=new drinks("����֭",8);
		Testify<drinks> drin=new Testify<drinks>(dr);
		drin.showClass();
		snacks sn=new snacks();
		Testify<snacks> sna=new Testify<snacks>(sn);
		sna.showClass();
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		T6 t6=new T6();
		t6.fanxing();
		t6.fanshejizhi();
	}

}
class drinks{
	String mingchen;
	float jiage;
	drinks(String mingchen,float jiage){
		this.mingchen=mingchen;
		this.jiage=jiage;
	}
}
class snacks{
	String name;
	int savetime;
	float jiage;
	String manyidu;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getSavetime() {
		return savetime;
	}
	public void setSavetime(int savetime) {
		this.savetime = savetime;
	}
	public float getJiage() {
		return jiage;
	}
	public void setJiage(float jiage) {
		this.jiage = jiage;
	}

	public void comment(){
		if(manyidu.equals("yes")){
			System.out.println("���۲���");
		}else if(manyidu.equals("no")){
			System.out.println("������");
		}
	}
	
}
class Testify<H>{
	private H i;
	Testify(H i){
		this.i=i;
	}
	public void showClass(){
		System.out.println("��ǰ���ͷ�����Ƽ��������ǣ�"+i.getClass());
		Method []me=i.getClass().getDeclaredMethods();
		for(int i=0;i<me.length;i++){
			System.out.println("����"+(i+1)+"������Ϊ��"+me[i].getName());
		}
	}
}