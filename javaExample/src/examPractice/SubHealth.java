package examPractice;

public class SubHealth extends Health {
	// 표준체중을 저장하는 변수
	double s_weight;
	// 비만도를 저장하는 변수
	double fat;
	// 결과값을 저장하는 변수
	String result;
	
	//-----------------------------------
	
	// 생성자
	// 문제에서 하라고 해서 했지만, 작성 안해도 괜찮긴 함
	// 예를들어, s_weight를 0.0이 아닌 다른 값으로 주어야 하면 무조건 작성하는게 맞음
	SubHealth(){
		s_weight=0.0;
		fat=0.0;
		result=null;
	}
	
	//-----------------------------------
	
	// 비만도를 계산하는 Calculate 메서드 선언
	// 표준체중을 먼저 구해서 비만도를 계산하기
	void calculate() {
		// 표준체중
		// 남성 표준체중 = (신장-100)*0.9
		// 여성 표준체중 = (신장-100)*0.85
		if(gender=='M' || gender=='m') {
			s_weight=(tall-100)*0.9;
		}else {
			s_weight=(tall-100)*0.85;
		}
		
		// 비만도 = 현재 체중/표준체중*100
		fat = weight/s_weight*100;
		
		if(fat >= 150) {      // 비만도가 150 이상이면 고도비만
			result="고도비만";
		}else if(fat >= 131) {// 비만도가 131 이상이면 중도비만
			result="중도비만";
		}else if(fat >= 121) {// 비만도가 121 이상이면 경도비만
			result="경도비만";
		}else if(fat >= 111) {// 비만도가 111 이상이면 과체중
			result="과체중";
		}else if(fat >= 91) {// 비만도가 91 이상이면 정상(표준체중)
			result="정상(표준체중)";
		}else {              // 그렇지 않으면 저체중
			result="저체중";
		}
	}// calculate() 끝
	
	// 출력하는 output2() 메서드 선언
	// 소수점은 mathRound() 사용하거나, c언어 사용!
	void output2() {
		//System.out.println("당신의 비만도는 " + fat + "이고, " + result + "입니다.");
		// c언어 출력법 사용,  %.2f => 소수점 아래 둘쨋자리까지만 표시
		System.out.printf("당신의 비만도는 %.2f 이고, %s 입니다.", fat, result);
	}
	
}

