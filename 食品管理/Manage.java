package ʳƷ����;

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
			System.out.println("�밴��ʾѡ�����¹��ܣ�");
			System.out.println("���ʳƷ�밴��1����");
			System.out.println("����ʳƷ��Ϣ�밴��2����");
			System.out.println("�޸�ʳƷ�۸��밴��3����");
			System.out.println("ɾ��ʳƷ�밴��4����");
			System.out.println("����ʳƷ���밴��5����");
			System.out.println("�˳��밴��0����");

			Scanner sc = new Scanner(System.in);
			flag = sc.nextInt();
			if (flag == 1) {
				System.out.println("������ʳƷ���ƣ�");
				String mingchen = sc.next();
				System.out.println("������ʳƷ�۸�");
				double price = sc.nextDouble();
				this.add(mingchen, price);

			} else if (flag == 2) {
				System.out.println("�������ѯʳƷ�ı�ţ�");
				int bh = sc.nextInt();
				this.searchInformation(bh);
			} else if (flag == 3) {
				System.out.println("��������Ҫ�޸�ʳƷ��Ϣ�ı�ţ�");
				int bianhao = sc.nextInt();
				System.out.println("�������޸ĺ��ʳƷ���ƣ�");
				String mingchen = sc.next();
				System.out.println("�������޸ĺ��ʳƷ�۸�");
				double price = sc.nextDouble();
				this.modify(bianhao, mingchen, price);
			} else if (flag == 4) {
				System.out.println("������ʳƷ��ţ�");
				int bianhao = sc.nextInt();
				while (bianhao > foodArr.size()) {
					System.out.println("����������ʳƷ��ţ�");
					bianhao = sc.nextInt();
				}
				this.deleteRecord(bianhao);

			} else if (flag == 5) {
				this.show();

			} else if (flag == 0) {
				System.out.println("��л����ʹ�ã���ӭ�´�ʹ�ã�");
				System.exit(0);// 0���������˳�����1�����쳣�˳���
			} else {
				System.out.println("��������");
			}
		}
	}

	private void add(String mingchen, double price) {
		Food f = new Food(foodArr.size() + 1, mingchen, price);
		foodArr.add(f);
		System.out.println("���ʳƷ�ɹ���");
		System.out.println("����ʳƷ����Ϊ��" + foodArr.size());
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
			System.out.println("�������ҵ���ϢΪ��");
			System.out.println("���" + "\t" + "����" + "\t" + "�۸�");
			System.out.println(ff);
		} else {
			System.out.println("�Ҳ������������ŵ�ʳƷ��Ϣ��");
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
				System.out.println("�޸�ʳƷ��Ϣ�ɹ�");
				System.out.println("���" + "\t" + "����" + "\t" + "�۸�");
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
			System.out.println("�޸�ʳƷ��Ϣ�ɹ�");
		} else {
			System.out.println("�Ҳ������������ŵ�ʳƷ��Ϣ�������Զ�����¼�¼��");
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
		System.out.println("ɾ�����Ϊ��" + bianhao + "����ʳƷ�ɹ�");

	}

	private void show() {
		System.out.println("���" + "\t" + "����" + "\t" + "�۸�");
		for (int j = 0; j < foodArr.size(); j++) {
			Food ff = (Food) (foodArr.get(j));
			System.out.println(ff);
		}
	}

}

// //scanner.readLine()Ĭ�϶�ȡһ���ַ���
// //float b=Float.parseFloat(scanner.readLine());__��string������float