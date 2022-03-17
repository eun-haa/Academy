package examPractice;

public class Ch05_ArrayExam2 {

	public static void main(String[] args) {
		// 1번
		int[][]score = {
				{90, 95, 98},
				{75, 85, 88},
				{60, 68, 77},
				{82, 63, 84},
				{74, 77, 98}
		};
		
		System.out.println("이름\t국어 \t영어\t수학\t총점\t평균");
		System.out.println("===========================================");
		
		String[] name = {"정자바","이그린","컴퓨터","최씨샵","씨뿔뿔"};
		
		for(int i=0; i<score.length; i++) {
			for(int j=0; j<score[i].length; j++) {
				System.out.printf("%d \t",score[i][j]);
			}
			System.out.println();
		}
		
		System.out.println("===========================================");

	}

}
