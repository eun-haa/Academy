package ch05;

import java.util.Scanner;

// 테스트 - 2차원 배열
public class ArrayExam2 {

	public static void main(String[] args) {
		// 1번
		int[][]score = {
				{90, 95, 98},
				{75, 85, 88},
				{60, 68, 77},
				{82, 63, 84},
				{74, 77, 98}
		};
		
		// 2번
		// 사용자가 점수를 입력할 수 있도록......
		Scanner s = new Scanner(System.in);
		
		String[] subject = {"국어", "영어", "수학"};
		
		for(int i=0; i<score.length; i++) { // 행을 반복(5번 반복)
			for(int j=0; j<score[i].length; j++) { // 열을 반복(3번 반복)
				System.out.println((i+1) +"번째 학생의 " + subject[j] + " 점수를 입력하세요."); 
				score[i][j]=s.nextInt(); //score 2차원 배열에 저장되는 과목점수
			}
		}

		
		
		
		System.out.println("이름\t국어 \t영어\t수학\t총점\t평균");
		System.out.println("=============================================");
		
		String[] name = {"정자바","이그린","컴퓨터","최씨샵","씨뿔뿔"};
		
		// 국어점수 총합계 
		int korTotal=0;
		// 영어점수 총합계
		int engTotal=0;
		// 수학점수 총합계
		int mathTotal=0;
		// 최대값
		int max=score[0][0];
		// 최소값
		int min=score[0][0];
		
		for(int i=0; i<score.length; i++) { // 행을 반복(5번 반복)
			
			korTotal+= score[i][0]; //korTotal=korTotal+score[i][0];
			engTotal+= score[i][1]; //engTotal=engTotal+score[i][1];
			mathTotal+= score[i][2]; //mathTotal=mathTotal+score[i][2];
			
			// 따로 for문을 만들 필요 없음(name[])
			System.out.printf("%s \t",name[i]); 
			
			// 학생별 합계 및 평균
			int sum = 0; // 초기화 시키면서 들어가야해서 요기 있어야함
			float avg = 0f;

			for(int j=0; j<score[i].length;j++) { // 열을 반복(3번 반복)
				
				// 최대값 구하기
				if(max<score[i][j]) {
					max=score[i][j];
				}
				
				// 최소값 구하기
				if(min>score[i][j]) {
					min=score[i][j];
				}
				System.out.printf("%d \t",score[i][j]);
				
				// 3번 반복한 값에 총점을 구해야해서 여기에 작성!
				sum=sum+score[i][j];
					
			}
			avg=sum/(float)score[i].length; 
			//sum, score[i].length 둘 다 정수라서 형변환 해줘야 소수점 나옴
			
			// sum 출력문을 for문 밖에 작성해야함(출력문도 반복됨)
			System.out.printf("%d\t%.1f",sum,avg); //0+90+85+98
			
			System.out.println(); // j문 3번 반복하고 엔터쳐라
		}
		

		
		System.out.println("=============================================");
		System.out.printf("총점\t%d\t%d\t%d\t%d\t%d\n",korTotal,engTotal,mathTotal,korTotal+engTotal+mathTotal,(korTotal+engTotal+mathTotal)/3);
		System.out.printf("최대값\t%d\t%d",max,min);

	}

}
