package ������;

import java.util.ArrayList;



public class T3 {
	

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList arr=new ArrayList();
		System.out.println("���ѧ����֮ǰ�������СΪ��"+arr.size());
		Stu s1=new Stu("��˽�",222,(float)85.22);
		Stu s2=new Stu("������",221,(float)85.22);
		Stu s3=new Stu("�����",223,(float)85.22);
		Stu s4=new Stu("��ɵ��",224,(float)85.22);
		arr.add(s1);
		arr.add(s2);
		arr.add(s3);
		arr.add(s4);
		System.out.println("�����СΪ��"+arr.size());
		System.out.print("\n");
		//arr.remove(0);
		//arr.add(0, s1);
		System.out.println("����"+"\t"+"ѧ��"+"\t"+"����");
		for(int i=0;i<arr.size();i++){
			Stu tu=(Stu)arr.get(i);////��̬������̬���������������������object��ǿ��ת����stu��
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