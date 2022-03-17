package ch05;

public class Array {

	public static void main(String[] args) {
		// 각각쓰기
		//int[] score;
		//score = new int[5];
		
		// 1.선언과 동시에 생성함
		// 한줄로 합치기
		//int[] score = new int[5];
		
		//System.out.println(score);
		// 배열에 초기화
		//score[0]=100;
		//score[1]=90;
		//score[2]=80;
		//score[3]=70;
		//score[4]=60;
		
		// 2.선언과 동시에 생성하고 배열에 초기화
		//int[] score = {100,90,80,70,60};
		
		// 3.선언만 따로 설정하고, 생성과 동시에 초기화
		// 작성할 시, new타입[]
		int[] score;
		score = new int[] {100,90,80,70,60};
	}

}
