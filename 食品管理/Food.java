package 食品管理;

public class Food {
	private int bianhao;
	private String mingchen;
	private double price;
	public Food(){
		
	}
	public Food(int bianhao,String mingchen,double price){
		this.bianhao=bianhao;
		this.mingchen=mingchen;
		this.price=price;
	}
	public int getBianhao() {
		return bianhao;
	}
	public void setBianhao(int bianhao) {
		this.bianhao = bianhao;
	}
	public String getMingchen() {
		return mingchen;
	}
	public void setMingchen(String mingchen) {
		this.mingchen = mingchen;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public String toString(){
		return this.getBianhao()+"\t"+this.getMingchen()+"\t"+this.getPrice();
	}

}
