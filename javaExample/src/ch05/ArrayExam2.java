package ch05;

import java.util.Scanner;

// �׽�Ʈ - 2���� �迭
public class ArrayExam2 {

	public static void main(String[] args) {
		// 1��
		int[][]score = {
				{90, 95, 98},
				{75, 85, 88},
				{60, 68, 77},
				{82, 63, 84},
				{74, 77, 98}
		};
		
		// 2��
		// ����ڰ� ������ �Է��� �� �ֵ���......
		Scanner s = new Scanner(System.in);
		
		String[] subject = {"����", "����", "����"};
		
		for(int i=0; i<score.length; i++) { // ���� �ݺ�(5�� �ݺ�)
			for(int j=0; j<score[i].length; j++) { // ���� �ݺ�(3�� �ݺ�)
				System.out.println((i+1) +"��° �л��� " + subject[j] + " ������ �Է��ϼ���."); 
				score[i][j]=s.nextInt(); //score 2���� �迭�� ����Ǵ� ��������
			}
		}

		
		
		
		System.out.println("�̸�\t���� \t����\t����\t����\t���");
		System.out.println("=============================================");
		
		String[] name = {"���ڹ�","�̱׸�","��ǻ��","�־���","���Ի�"};
		
		// �������� ���հ� 
		int korTotal=0;
		// �������� ���հ�
		int engTotal=0;
		// �������� ���հ�
		int mathTotal=0;
		// �ִ밪
		int max=score[0][0];
		// �ּҰ�
		int min=score[0][0];
		
		for(int i=0; i<score.length; i++) { // ���� �ݺ�(5�� �ݺ�)
			
			korTotal+= score[i][0]; //korTotal=korTotal+score[i][0];
			engTotal+= score[i][1]; //engTotal=engTotal+score[i][1];
			mathTotal+= score[i][2]; //mathTotal=mathTotal+score[i][2];
			
			// ���� for���� ���� �ʿ� ����(name[])
			System.out.printf("%s \t",name[i]); 
			
			// �л��� �հ� �� ���
			int sum = 0; // �ʱ�ȭ ��Ű�鼭 �����ؼ� ��� �־����
			float avg = 0f;

			for(int j=0; j<score[i].length;j++) { // ���� �ݺ�(3�� �ݺ�)
				
				// �ִ밪 ���ϱ�
				if(max<score[i][j]) {
					max=score[i][j];
				}
				
				// �ּҰ� ���ϱ�
				if(min>score[i][j]) {
					min=score[i][j];
				}
				System.out.printf("%d \t",score[i][j]);
				
				// 3�� �ݺ��� ���� ������ ���ؾ��ؼ� ���⿡ �ۼ�!
				sum=sum+score[i][j];
					
			}
			avg=sum/(float)score[i].length; 
			//sum, score[i].length �� �� ������ ����ȯ ����� �Ҽ��� ����
			
			// sum ��¹��� for�� �ۿ� �ۼ��ؾ���(��¹��� �ݺ���)
			System.out.printf("%d\t%.1f",sum,avg); //0+90+85+98
			
			System.out.println(); // j�� 3�� �ݺ��ϰ� �����Ķ�
		}
		

		
		System.out.println("=============================================");
		System.out.printf("����\t%d\t%d\t%d\t%d\t%d\n",korTotal,engTotal,mathTotal,korTotal+engTotal+mathTotal,(korTotal+engTotal+mathTotal)/3);
		System.out.printf("�ִ밪\t%d\t%d",max,min);

	}

}
