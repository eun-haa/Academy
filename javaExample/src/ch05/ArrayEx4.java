package ch05;

public class ArrayEx4 {

	public static void main(String[] args) {
		// 1���� �迭
		int[] score1 = new int[5]; //1�� 5���� �迭
		// ù��° �ʱ�ȭ ���
		score1[0]=10;
		score1[1]=20;
		score1[2]=30;
		score1[3]=40;
		score1[4]=50;
		
		// �ι�° �ʱ�ȭ ���
		int[] score2 = new int[] {10,20,30,40,50};
		
		// ����° �ʱ�ȭ ��� -> ���� ����ȭ ��Ų ���
		int[] score3 = {10,20,30,40,50};
		
		
		
		
		// 2���� �迭
		int[][] score4 = new int[5][3]; //5�� 3���� �迭
		
		// ù��° �ʱ�ȭ ���
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
		
		// �ι�° �ʱ�ȭ ���
		int[][] score5 = new int[][] {
				{100,100,100},
				{20,20,20},
				{30,30,30},
				{40,40,40},
				{50,50,50}
			};
		
									
		// ����° �ʱ�ȭ ���
		int[][] score6 = {
				{100,100,100},
				{20,20,20},
				{30,30,30},
				{40,40,40},
				{50,50,50}
			};
		
		
		System.out.println(score6.length); // �� �� �� Ȯ���ϱ�
		System.out.println(score6[0].length); // Ų �� Ȯ���ϱ�
		
		for(int i=0; i<score6.length; i++) { // ���η� ��������
			for(int j=0; j<score6[i].length; j++) { // ���ο� ��ĭ����
				score6[i][j]=10;
				System.out.print(score6[i][j]);
			}
			System.out.println();//j 3�� ���� �������ͼ� ����ġ��
		}
		
		
		
		
		
		// �����迭
		
		// ù��° ���
//		int[][]score7 = new int[5][]; //��� ĭ�� ���� �ۼ�!
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

		
		
		// �ι�° ���
		int[][]score8 = new int[][]{
			{100,100,100},
			{20,20},
			{30},
			{40,40,40},
			{50,50}
		};
		
		
		
		// ����°���
		int[][]score9 = {
				{100,100,100},
				{20,20},
				{30},
				{40,40,40},
				{50,50}
		};
		
		
		
		// for�� ���
		System.out.println(score9.length); // �� �� �� Ȯ���ϱ�
		System.out.println(score9[0].length); // Ų �� Ȯ���ϱ�
		System.out.println(score9[1].length);
		System.out.println(score9[2].length);
		System.out.println(score9[3].length);
		System.out.println(score9[4].length);
		
		for(int i=0; i<score9.length; i++) { // ���η� ��������
			for(int j=0; j<score9[i].length; j++) { // ���ο� ��ĭ����
				score6[i][j]=10;
				System.out.print(score9[i][j]);
			}
			System.out.println();//j 3�� ���� �������ͼ� ����ġ��
		}
	}

}
