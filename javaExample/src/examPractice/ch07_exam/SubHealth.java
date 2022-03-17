package examPractice.ch07_exam;
// 자식클래스
public class SubHealth extends Health{
	// 표준체중을 담을 변수
	double s_weight;
	// 비만도를 담을 변수
	double fat;
	// 결과값을 담을 변수
	String result;
	
	//------------------------------------
	// 초기화를 위한 생성자
	SubHealth(){
		s_weight=0.0;
		fat=0.0;
		result=null;
	}
	//------------------------------------
	// calculate() - 비만도를 계산하는 메소드
	void calculate() {
		if(gender=='m' || gender=='M') {
			s_weight=(tall-100)*0.9;
		}else {
			s_weight=(tall-100)*0.85;
		}
		
		fat=weight/s_weight*100;
		
		if(fat >= 151) {
			result="고도비만";
		}else if(fat >=131) {
			result="중도비만";
		}else if(fat >=121) {
			result="경도비만";
		}else if(fat >= 111) {
			result="과체중";
		}else if(fat >= 91) {
			result="정상(표준체중)";
		}else {
			result="저체중";
		}
	}
	// output2() - 출력하는 메소드
	void output2() {

		System.out.printf("당신은 비만도 %.2f이고, %s입니다.", fat,result);
	}
}
