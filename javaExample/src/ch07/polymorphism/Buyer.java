package ch07.polymorphism;

import java.util.ArrayList;

// p가 tv도 됐다가, computer도 됐다가 하는게 다형성
public class Buyer {// 고객, 물건을 사는 사람
	int money=1000; // 지금 현재 고객이 소유한 금액(1000)
	int bonusPoint=0;
	int i = 0;

	
	//------------------------------------------
	
	// [배열] 구입한 제품을 배열로 만들기
	// 정적 배열(길이 고정 배열)
	// Product[] item = new Product[10];
	
	// Generic Type
	ArrayList<Product> item = new ArrayList<>();

	//------------------------------------------
	
	void buy(Product p) {// 물건을 사기 위한 기능
		if(money < p.price) {// money 변수에 있는 값 < Tv클래스에 있는 price 값
			System.out.println("잔액이 부족합니다.");
			return;
		}
		// money = money - p.price;
		money -= p.price;// 소유한 금액에서 구입한 제품의 가격을 뺀다
		
		// bonusPoint = bonusPoint + p.bonusPoint;
		bonusPoint += p.bonusPoint;// 제품의 보너스 점수를 추가한다
		
		// [배열] 각 제품의 주소를 각 배열의 인덱스에 저장
		//item[0]=p;
		//item[1]=p;
		//item[2]=p;
		//item[i++]=p;
		
		item.add(p);
		
		// System.out.println(p.toString()+" 구입하셨습니다.");
		System.out.println(p+"을/를 구입하셨습니다.");
		
	}
	
	//------------------------------------------
	
	// [배열] 구매한 물품에 대한 정보를 요약해서 보여주는 기능을 하는 메소드
	void summary() {
		// 구입한 물품의 총 금액
		int sum = 0;
		// 구입한 물픔 목룍
		String itemList="";
		
		for(int i=0; i<item.size(); i++) {
			sum+=item.get(i).price;
			itemList+=item.get(i)+",";
		}
		System.out.println("구입하신 물품의 총금액은 " + sum + "만원입니다.");
		System.out.println("구입하신 제품은 "+itemList + "입니다.");
	}
	
	// [배열] 구입한 제품을 환불한다.
	void refund(Product p) {
		if(item.remove(p)) {// 제품을 ArrayList에서 제거한다
			money += p.price;
			bonusPoint -= p.bonusPoint;
			System.out.println(p + "을/를 반품하셨습니다.");
		}
	}
}
