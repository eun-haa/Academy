package ch05;

public class ArrayEx3 {

	public static void main(String[] args) {
//		// !! 학생 성적 관리 프로그램
//		// 10명의 학생들에 대한 성적을 배열에 저장하고
//		int[] score = {88,73,64,91,85,77,61,80,74,63};
//		
//		// 합계
//		int sum=0; // 합계를 저장하는 변수
//		float average=0.0f; // 평균을 저장하는 변수
//		
//		// 학생수만큼 반복
//		for(int i=0; i<score.length; i++) {
//			sum+=score[i];//sum=sum+score[i];
//		}
//		// 평균을 구하세요.(합계/10)
//		// 평균을 구하세요.(합계/학생수)
//		average=sum/(float)(score.length);
//		System.out.println("합계는 " +sum+"이고, 평균은 "+average+"이다.");
//	
	
	
	// !! 최대값과 최소값 구하기
//	// 값을 배열에 저장하고
//	int[] score = {88,73,64,91,85,77,61,80,74,86};
//	
//	// 최대값
//	int max=score[0]; // max 변수 지정
//	for(int i=0; i<score.length; i++) {
//		if(max < score[i])
//			max = score[i];
//	}
//
//	
//	// 최소값
//	int min= score[0];
//	for(int i=0; i<score.length; i++) {
//		if(min > score[i])
//			min = score[i];
//	}
//	
//	// 출력하기
//	System.out.println("최대값은 "+max+"이고, 최소값은 "+min+"이다.");
	
	
	// 최대값과 최소값을 같이!
		
	int[] score = {88,73,64,91,85,77,61,80,74,86};
	int max = score[0];
	int min = score[0];
	
	for(int i=0; i<score.length; i++) {
		if(max < score[i])
			max = score[i];
		if(min > score[i])
			min = score[i];
	}
	
	// 출력하기
	System.out.println("최대값은 "+max+"이고, 최소값은 "+min+"이다.");
	
	
	
	
	
	}
}
