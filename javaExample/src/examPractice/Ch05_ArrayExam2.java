package examPractice;

public class Ch05_ArrayExam2 {

	public static void main(String[] args) {
		// 1��
		int[][]score = {
				{90, 95, 98},
				{75, 85, 88},
				{60, 68, 77},
				{82, 63, 84},
				{74, 77, 98}
		};
		
		System.out.println("�̸�\t���� \t����\t����\t����\t���");
		System.out.println("===========================================");
		
		String[] name = {"���ڹ�","�̱׸�","��ǻ��","�־���","���Ի�"};
		
		for(int i=0; i<score.length; i++) {
			for(int j=0; j<score[i].length; j++) {
				System.out.printf("%d \t",score[i][j]);
			}
			System.out.println();
		}
		
		System.out.println("===========================================");

	}

}
