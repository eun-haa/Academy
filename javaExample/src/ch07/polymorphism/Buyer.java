package ch07.polymorphism;

import java.util.ArrayList;

// p�� tv�� �ƴٰ�, computer�� �ƴٰ� �ϴ°� ������
public class Buyer {// ��, ������ ��� ���
	int money=1000; // ���� ���� ���� ������ �ݾ�(1000)
	int bonusPoint=0;
	int i = 0;

	
	//------------------------------------------
	
	// [�迭] ������ ��ǰ�� �迭�� �����
	// ���� �迭(���� ���� �迭)
	// Product[] item = new Product[10];
	
	// Generic Type
	ArrayList<Product> item = new ArrayList<>();

	//------------------------------------------
	
	void buy(Product p) {// ������ ��� ���� ���
		if(money < p.price) {// money ������ �ִ� �� < TvŬ������ �ִ� price ��
			System.out.println("�ܾ��� �����մϴ�.");
			return;
		}
		// money = money - p.price;
		money -= p.price;// ������ �ݾ׿��� ������ ��ǰ�� ������ ����
		
		// bonusPoint = bonusPoint + p.bonusPoint;
		bonusPoint += p.bonusPoint;// ��ǰ�� ���ʽ� ������ �߰��Ѵ�
		
		// [�迭] �� ��ǰ�� �ּҸ� �� �迭�� �ε����� ����
		//item[0]=p;
		//item[1]=p;
		//item[2]=p;
		//item[i++]=p;
		
		item.add(p);
		
		// System.out.println(p.toString()+" �����ϼ̽��ϴ�.");
		System.out.println(p+"��/�� �����ϼ̽��ϴ�.");
		
	}
	
	//------------------------------------------
	
	// [�迭] ������ ��ǰ�� ���� ������ ����ؼ� �����ִ� ����� �ϴ� �޼ҵ�
	void summary() {
		// ������ ��ǰ�� �� �ݾ�
		int sum = 0;
		// ������ ���� ��
		String itemList="";
		
		for(int i=0; i<item.size(); i++) {
			sum+=item.get(i).price;
			itemList+=item.get(i)+",";
		}
		System.out.println("�����Ͻ� ��ǰ�� �ѱݾ��� " + sum + "�����Դϴ�.");
		System.out.println("�����Ͻ� ��ǰ�� "+itemList + "�Դϴ�.");
	}
	
	// [�迭] ������ ��ǰ�� ȯ���Ѵ�.
	void refund(Product p) {
		if(item.remove(p)) {// ��ǰ�� ArrayList���� �����Ѵ�
			money += p.price;
			bonusPoint -= p.bonusPoint;
			System.out.println(p + "��/�� ��ǰ�ϼ̽��ϴ�.");
		}
	}
}
