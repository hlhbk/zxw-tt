package 食品管理;

import java.util.*;

public class Manage {
	int flag;
	static ArrayList foodArr = new ArrayList();

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Manage();

	}

	Manage() {

		while (true) {
			System.out.println("请按提示选择以下功能：");
			System.out.println("添加食品请按（1）：");
			System.out.println("查找食品信息请按（2）：");
			System.out.println("修改食品价格请按（3）：");
			System.out.println("删除食品请按（4）：");
			System.out.println("遍历食品库请按（5）：");
			System.out.println("退出请按（0）：");

			Scanner sc = new Scanner(System.in);
			flag = sc.nextInt();
			if (flag == 1) {
				System.out.println("请输入食品名称：");
				String mingchen = sc.next();
				System.out.println("请输入食品价格：");
				double price = sc.nextDouble();
				this.add(mingchen, price);

			} else if (flag == 2) {
				System.out.println("请输入查询食品的编号：");
				int bh = sc.nextInt();
				this.searchInformation(bh);
			} else if (flag == 3) {
				System.out.println("请输入需要修改食品信息的编号：");
				int bianhao = sc.nextInt();
				System.out.println("请输入修改后的食品名称：");
				String mingchen = sc.next();
				System.out.println("请输入修改后的食品价格：");
				double price = sc.nextDouble();
				this.modify(bianhao, mingchen, price);
			} else if (flag == 4) {
				System.out.println("请输入食品编号：");
				int bianhao = sc.nextInt();
				while (bianhao > foodArr.size()) {
					System.out.println("请重新输入食品编号：");
					bianhao = sc.nextInt();
				}
				this.deleteRecord(bianhao);

			} else if (flag == 5) {
				this.show();

			} else if (flag == 0) {
				System.out.println("感谢您的使用！欢迎下次使用！");
				System.exit(0);// 0代表正常退出，，1代表异常退出。
			} else {
				System.out.println("输入有误！");
			}
		}
	}

	private void add(String mingchen, double price) {
		Food f = new Food(foodArr.size() + 1, mingchen, price);
		foodArr.add(f);
		System.out.println("添加食品成功！");
		System.out.println("库中食品数量为：" + foodArr.size());
	}

	private void searchInformation(int bh) {
		Food ff = new Food();
		int tag = -1;

		for (int i = 0; i < foodArr.size(); i++) {
			ff = (Food) (foodArr.get(i));
			if (ff.getBianhao() == bh) {
				tag = i;
			}
		}
		if (tag > 0) {
			ff = (Food) (foodArr.get(tag));
			System.out.println("你所查找的信息为：");
			System.out.println("编号" + "\t" + "名称" + "\t" + "价格");
			System.out.println(ff);
		} else {
			System.out.println("找不到你所输入编号的食品信息！");
		}
	}

	private void modify(int bianhao, String mingchen, double price) {
		int tag = -1;
		Food ff = new Food();
		for (int i = 0; i < foodArr.size(); i++) {
			ff = (Food) (foodArr.get(i));
			if (ff.getBianhao() == bianhao) {
				tag = i;
				ff.setMingchen(mingchen);
				ff.setPrice(price);
				System.out.println("修改食品信息成功");
				System.out.println("编号" + "\t" + "名称" + "\t" + "价格");
				for (int j = 0; j < foodArr.size(); j++) {
					ff = (Food) (foodArr.get(j));
					System.out.println(ff);
				}
			}
		}
		if (tag > 0) {
			ff = (Food) (foodArr.get(tag));
			ff.setMingchen(mingchen);
			ff.setPrice(price);
			System.out.println("修改食品信息成功");
		} else {
			System.out.println("找不到你所输入编号的食品信息！将会自动添加新纪录！");
			Food ff0 = new Food(
					((Food) (foodArr.get(foodArr.size()))).getBianhao() + 1,
					mingchen, price);
			foodArr.add(ff0);
		}
	}

	private void deleteRecord(int bianhao) {
		foodArr.remove(bianhao - 1);
		for (int i = bianhao; i < foodArr.size(); i++) {
			Food food = (Food) (foodArr.get(i));
			food.setBianhao(i - 1);
		}
		System.out.println("删除编号为（" + bianhao + "）的食品成功");

	}

	private void show() {
		System.out.println("编号" + "\t" + "名称" + "\t" + "价格");
		for (int j = 0; j < foodArr.size(); j++) {
			Food ff = (Food) (foodArr.get(j));
			System.out.println(ff);
		}
	}

}

// //scanner.readLine()默认读取一行字符串
// //float b=Float.parseFloat(scanner.readLine());__将string解析成float