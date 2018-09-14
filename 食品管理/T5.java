package 食品管理;

import java.util.HashMap;
import java.util.Iterator;

public class T5 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap hm=new HashMap();//哈希类，，跟非哈希类的区别在于————会自动识别相同的记录
		Food f1=new Food(1,"话梅",5);
		Food f2=new Food(2,"核桃",7);
		Food f3=new Food(3,"杏仁",6);
		hm.put("key001", f1);
		hm.put("key002",f2);
		hm.put("key003", f3);
		//hm.put("key003", f2);//键值代表它的一个标记，，会覆盖前一个键值相同的记录
		if(hm.containsKey("key001")){
			System.out.println(((hm.get("key003")).hashCode()));
		}
		else{
			System.out.println("找不到该食品！");
		}
		Iterator it=hm.keySet().iterator();//遍历，，需要用迭代器将其键值都取出来
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
