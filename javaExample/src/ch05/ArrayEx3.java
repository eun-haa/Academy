package ch05;

public class ArrayEx3 {

	public static void main(String[] args) {
//		// !! �л� ���� ���� ���α׷�
//		// 10���� �л��鿡 ���� ������ �迭�� �����ϰ�
//		int[] score = {88,73,64,91,85,77,61,80,74,63};
//		
//		// �հ�
//		int sum=0; // �հ踦 �����ϴ� ����
//		float average=0.0f; // ����� �����ϴ� ����
//		
//		// �л�����ŭ �ݺ�
//		for(int i=0; i<score.length; i++) {
//			sum+=score[i];//sum=sum+score[i];
//		}
//		// ����� ���ϼ���.(�հ�/10)
//		// ����� ���ϼ���.(�հ�/�л���)
//		average=sum/(float)(score.length);
//		System.out.println("�հ�� " +sum+"�̰�, ����� "+average+"�̴�.");
//	
	
	
	// !! �ִ밪�� �ּҰ� ���ϱ�
//	// ���� �迭�� �����ϰ�
//	int[] score = {88,73,64,91,85,77,61,80,74,86};
//	
//	// �ִ밪
//	int max=score[0]; // max ���� ����
//	for(int i=0; i<score.length; i++) {
//		if(max < score[i])
//			max = score[i];
//	}
//
//	
//	// �ּҰ�
//	int min= score[0];
//	for(int i=0; i<score.length; i++) {
//		if(min > score[i])
//			min = score[i];
//	}
//	
//	// ����ϱ�
//	System.out.println("�ִ밪�� "+max+"�̰�, �ּҰ��� "+min+"�̴�.");
	
	
	// �ִ밪�� �ּҰ��� ����!
		
	int[] score = {88,73,64,91,85,77,61,80,74,86};
	int max = score[0];
	int min = score[0];
	
	for(int i=0; i<score.length; i++) {
		if(max < score[i])
			max = score[i];
		if(min > score[i])
			min = score[i];
	}
	
	// ����ϱ�
	System.out.println("�ִ밪�� "+max+"�̰�, �ּҰ��� "+min+"�̴�.");
	
	
	
	
	
	}
}
