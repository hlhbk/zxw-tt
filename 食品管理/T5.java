package ʳƷ����;

import java.util.HashMap;
import java.util.Iterator;

public class T5 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap hm=new HashMap();//��ϣ�࣬�����ǹ�ϣ����������ڡ����������Զ�ʶ����ͬ�ļ�¼
		Food f1=new Food(1,"��÷",5);
		Food f2=new Food(2,"����",7);
		Food f3=new Food(3,"����",6);
		hm.put("key001", f1);
		hm.put("key002",f2);
		hm.put("key003", f3);
		//hm.put("key003", f2);//��ֵ��������һ����ǣ����Ḳ��ǰһ����ֵ��ͬ�ļ�¼
		if(hm.containsKey("key001")){
			System.out.println(((hm.get("key003")).hashCode()));
		}
		else{
			System.out.println("�Ҳ�����ʳƷ��");
		}
		Iterator it=hm.keySet().iterator();//����������Ҫ�õ����������ֵ��ȡ����
		while(it.hasNext()){
			String key=it.next().toString();
			Food food=(Food)hm.get(key);
			System.out.println(food);
		}
		/*for(int i=0;i<hm.size();i++){
			//System.out.println(hm.get());
		}*/

	}

}
