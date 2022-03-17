package ch07;

public class SubHealth extends Health{
	// 필드명(변수)
	double s_weight;  // 표준체중
	double fat;       // 비만도
	String result;    // 결과값
	
	//---------------------------------------------
	
	// 생성자(초기화)
	SubHealth(){
		s_weight=0.0;
		fat=0.0;
		result=null;
	}
	
	//---------------------------------------------
	
	// 메서드
	void calculate() { // 표준체중계산법
		// 남성과 여성의 계산법이 다르기에 if문으로 분리해주어야함
		// 성별이 "M"이면 
		// 표준체중 = (신장 - 100) * 0.9
		// 성별이 "F"이면
		// 표준체중 = (신장 - 100) * 0.85
		if(gender=='M'||gender=='m') {// 이 클래스에는 젠더가 없지만, 상속 받았기에 가능!
			s_weight = (tall-100)*0.9;
		}else {
			s_weight = (tall-100)*0.85;
		}
		
		// 비만도 계산
		fat = (weight/s_weight)*100;
		
		if(fat >= 150) {
			result="고도비만";
		}else if(fat >= 131) {
			result="중도비만";
		}else if(fat >= 121) {
			result="경도비만";
		}else if(fat >= 111) {
			result="과체중";
		}else if(fat >= 91) {
			result="정상(표준체중)";
		}else {
			result="저체중";
		}
	}
	void output2() { // 출력
		// 소수점 끊어주기 위해 c문법 사용, %.2f -> 소수점 둘쨋자리까지 끊기
		System.out.printf("당신은 비만도 %.2f이고, %s입니다.", fat,result);
	}
	
	// 설계 끝
}
