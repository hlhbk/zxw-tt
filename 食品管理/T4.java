package  ≥∆∑π‹¿Ì;

import java.util.LinkedList;
import java.util.Stack;
import java.util.Vector;

public class T4 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*LinkedList list=new LinkedList();
		Food f1=new Food(1,"ª∞√∑",5);
		Food f2=new Food(2,"∫ÀÃ“",7);
		Food f3=new Food(3,"–”» ",6);
		//list.addFirst(f1);
		//list.addFirst(f2);
		//list.addFirst(f3);
		//list.add(f1);
		//list.add(f2);
		//list.add(f3);
		list.addLast(f1);
		list.addLast(f2);
		list.addLast(f3);
		for(int i=0;i<list.size();i++){
			//System.out.println(((Food)(list.get(i))));
			//System.out.println(((Food)(list.getFirst())));
			System.out.println(((Food)(list.getLast())));
		}*/
		/*Vector vec=new Vector();
		Food f1=new Food(1,"ª∞√∑",5);
		Food f2=new Food(2,"∫ÀÃ“",7);
		Food f3=new Food(3,"–”» ",6);
		vec.add(f1);
		vec.add(f2);
		vec.add(f3);
		System.out.println(vec.capacity());
		for(int i=0;i<vec.size();i++){
			System.out.println(((Food)(vec.get(i))));
		}*/
		Stack sta=new Stack();
		Food f1=new Food(1,"ª∞√∑",5);
		Food f2=new Food(2,"∫ÀÃ“",7);
		Food f3=new Food(3,"–”» ",6);
		sta.add(f1);
		sta.add(f2);
		sta.add(f3);
		System.out.println(sta.capacity());
		for(int i=0;i<sta.size();i++){
			System.out.println(((Food)(sta.get(i))));
			//System.out.println(((Food)(sta.iterator().next())));
		}
	}

}
