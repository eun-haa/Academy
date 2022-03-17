package ch05;

public class ArrayEx4 {

	public static void main(String[] args) {
		// 1차원 배열
		int[] score1 = new int[5]; //1행 5열의 배열
		// 첫번째 초기화 방법
		score1[0]=10;
		score1[1]=20;
		score1[2]=30;
		score1[3]=40;
		score1[4]=50;
		
		// 두번째 초기화 방법
		int[] score2 = new int[] {10,20,30,40,50};
		
		// 세번째 초기화 방법 -> 가장 간소화 시킨 방법
		int[] score3 = {10,20,30,40,50};
		
		
		
		
		// 2차원 배열
		int[][] score4 = new int[5][3]; //5행 3열의 배열
		
		// 첫번째 초기화 방법
		score4[0][0]=100;
		score4[0][1]=100;
		score4[0][2]=100;
		score4[1][0]=20;
		score4[1][1]=20;
		score4[1][2]=20;
		score4[2][0]=30;
		score4[2][1]=30;
		score4[2][2]=30;
		score4[3][0]=40;
		score4[3][1]=40;
		score4[3][2]=40;
		score4[4][0]=50;
		score4[4][1]=50;
		score4[4][2]=50;
		
		// 두번째 초기화 방법
		int[][] score5 = new int[][] {
				{100,100,100},
				{20,20,20},
				{30,30,30},
				{40,40,40},
				{50,50,50}
			};
		
									
		// 세번째 초기화 방법
		int[][] score6 = {
				{100,100,100},
				{20,20,20},
				{30,30,30},
				{40,40,40},
				{50,50,50}
			};
		
		
		System.out.println(score6.length); // 줄 수 찍어서 확인하기
		System.out.println(score6[0].length); // 킨 수 확인하기
		
		for(int i=0; i<score6.length; i++) { // 세로로 몇줄인지
			for(int j=0; j<score6[i].length; j++) { // 가로에 몇칸인지
				score6[i][j]=10;
				System.out.print(score6[i][j]);
			}
			System.out.println();//j 3번 돌고 빠져나와서 엔터치기
		}
		
		
		
		
		
		// 가변배열
		
		// 첫번째 방법
//		int[][]score7 = new int[5][]; //비울 칸은 비우고 작성!
//		score7[0][0]=100;
//		score7[0][1]=100;
//		score7[0][2]=100;
//		score7[1][0]=20;
//		score7[1][1]=20;
//
//		score7[2][0]=30;
//
//		score7[3][0]=40;
//		score7[3][1]=40;
//		score7[3][2]=40;
//		score7[4][0]=50;
//		score7[4][1]=50;

		
		
		// 두번째 방법
		int[][]score8 = new int[][]{
			{100,100,100},
			{20,20},
			{30},
			{40,40,40},
			{50,50}
		};
		
		
		
		// 세번째방법
		int[][]score9 = {
				{100,100,100},
				{20,20},
				{30},
				{40,40,40},
				{50,50}
		};
		
		
		
		// for문 사용
		System.out.println(score9.length); // 줄 수 찍어서 확인하기
		System.out.println(score9[0].length); // 킨 수 확인하기
		System.out.println(score9[1].length);
		System.out.println(score9[2].length);
		System.out.println(score9[3].length);
		System.out.println(score9[4].length);
		
		for(int i=0; i<score9.length; i++) { // 세로로 몇줄인지
			for(int j=0; j<score9[i].length; j++) { // 가로에 몇칸인지
				score6[i][j]=10;
				System.out.print(score9[i][j]);
			}
			System.out.println();//j 3번 돌고 빠져나와서 엔터치기
		}
	}

}
