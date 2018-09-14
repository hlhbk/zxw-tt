package 集合类;

import java.util.ArrayList;



public class T3 {
	

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList arr=new ArrayList();
		System.out.println("添加学生项之前的数组大小为："+arr.size());
		Stu s1=new Stu("猪八戒",222,(float)85.22);
		Stu s2=new Stu("猪无能",221,(float)85.22);
		Stu s3=new Stu("猪和尚",223,(float)85.22);
		Stu s4=new Stu("猪傻子",224,(float)85.22);
		arr.add(s1);
		arr.add(s2);
		arr.add(s3);
		arr.add(s4);
		System.out.println("数组大小为："+arr.size());
		System.out.print("\n");
		//arr.remove(0);
		//arr.add(0, s1);
		System.out.println("姓名"+"\t"+"学号"+"\t"+"分数");
		for(int i=0;i<arr.size();i++){
			Stu tu=(Stu)arr.get(i);////多态，，多态，，，将集合类遍历到的object类强制转化成stu类
			System.out.println(tu);
		}
	}

}
class Stu{
	private String name;

	private int id;
	private float score;
	Stu(String name,int id,float score){
		this.name=name;
		this.id=id;
		this.score=score;
	}
		public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public float getScore() {
		return score;
	}
	public void setScore(float score) {
		this.score = score;
	}
	public String toString(){
		return this.getName()+"\t"+this.getId()+"\t"+this.getScore();
	}
}