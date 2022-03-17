package ch07;
// Health라는 클래스의 설계
import java.util.Scanner;

public class Health {
	Scanner s = new Scanner(System.in);
	
	// 필드명(변수)
	char gender;  // 성별
	double tall;  // 신장
	double weight;// 체중
	
	//---------------------------------------------
	
	// 생성자(초기화)
	Health(){    // 초기화를 하기위함(안 적으면 기본값으로 들어감)
		gender=' ';
		tall=0.0;
		weight=0.0;
	}
	
	//---------------------------------------------
	
	// 메서드
	// input - 성별, 신장, 체중 입력받기(scanner 필요!)
	void input(){//리턴타입을 모르겠으면 일단 void로 주기  // void는 인스턴스 !
		// 성별
		System.out.println("성별(M/F) : ");
		gender=s.next().charAt(0); // 인스턴스 메소드라서 메소드 안에 작성했음
		                           // .next()에 빨간줄이 생기는 이유?
		                           // 1. char을 String으로 바꿔주기
		                           // 2. char을 사용할거면, .next()를 char 타입으로 바꿔주기
		                           // → charAt() 붙여주기, 0번째를 바꿔준다는 의미
		// 신장
		System.out.println("신장(Cm) : ");
		tall=s.nextDouble();
		
		// 체중
		System.out.println("체중(Kg) : ");
		weight=s.nextDouble();
	}
	
	// output - 출력
	void output1(){
		char gender_kor=' ';
		// 성별(gender)이 "M"이면 
		// "남"으로 출력, 그렇지 않으면 "여" 출력
		if(gender=='M' || gender=='m') {
			gender_kor='남';
		}else {
			gender_kor='여';
		}
		System.out.println("성별 - " + gender_kor);
		System.out.println("신장 - " + tall + "Cm");
		System.out.println("체중 - " + weight + "Kg");
	}
	
}
