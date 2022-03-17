package ch_04;

public class If {

	public static void main(String[] args) {
		// 1. if문(단일)
		// 내 점수를 저장하는 변수
//		int score = 70;
		// 나의 점수가 60점 이상이면 합격
//		if(나의 점수가 60점 이상) {
//			합격
//		}
		
//		if(score >= 60) {
//			System.out.println("합격");
//		}

		// 2. if-else
		
//		// 내 점수를 저장하는 변수
//		int score = 70;
//		
//		// 나의 점수가 60점 이상이면 합격
//		// 그렇지 않으면 불합격
//		if(score>=60) {
//			System.out.println("합격");
//		} else {
//			System.out.println("불합격");
//		}
//		
//		int score=70;
//		String result="";
//		
//		if(score>=60) {
//			result="합격";
//		} else {
//			result="불합격";
//		}
//		
//		System.out.println(result);
		
		// 3. if-else if

		// 나의 점수가 60점 이상이면 합격
		// 나의 점수가 55점 이상이면 보류
		// 그렇지 않으면 불합격
		
//		int score = 50;
//		String result = ""; // if 입장에서 전역변수, 그래서 빠져나와도 결과가 살아있을 수 있음
//		
//		if(score>=60) {
//			result="합격"; // 거짓이면 아래로 가게됨
//		} else if(score>=55) {
//			result="보류";
//		} else {
//			result="불합격";
//		}
//		
//		System.out.println(result);
		
		
		// 중첩 if문
		
		int score=70;
		char grade=' ', opt='0';
		
		if(score>=90) { // 90점 이상 중에서도 
			grade='A';
			
			if(score>=98) {// 98점 이상이면 A+ : 98, 99, 100
				opt='+';
			}else if(score<94) {// 94점 미만이면 A- : 94, 93, 92, 91, 90
				opt='-';
			}			// 95~97     A0 : 95, 96, 97
			
		}else if(score>=80) { // 80점 이상 중에서도
			grade='B';

			if(score>=88) {// 88점 이상이면 B+ : 88, 89
				opt='+';
			}else if(score<84) {// 84점 미만이면 B- : 84, 83, 82, 81, 80
				opt='-';
			}			// 85 ~ 87  B0 : 85, 86, 87
		}else {
			grade='C';
		}
		// 중간에 문자열을 이어주는 ""을 넣어야 제대로 나옴
		// 만약 안넣으면 아스키코드로 변환해서 숫자로 나옴
		System.out.println(grade+""+opt);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
