package examPractice.ch07_exam;
// 부모클래스
public class CellPhone {
	// 속성
	// 모델을 저장하는 변수
	String model;
	// 색상을 저장하는 변수
	String color;
	
	//------------------------------------
	// 초기화 생성자
	CellPhone(String model, String color){
		this.model=model;
		this.color=color;
	}
	
	//------------------------------------
	// 기능
	// 전원을 켭니다.
	void powerOn() {
		System.out.println("전원을 켭니다.");
	}
	
	// 전원을 끕니다.
	void powerOff() {
		System.out.println("전원을 끕니다.");
	}
	
	// 벨이 울립니다.
	void bell() {
		System.out.println("벨이 울립니다.");
	}
	
	// 수신 목소리 전송
	void recVoice(String re_msg) {
		System.out.println("나 : " + re_msg);
	}
	
	// 송신 목소리 전송
	void sandVoice(String sa_msg) {
		System.out.println("상대방 : " + sa_msg);
	}
	
	// 전화를 끊습니다.
	void callOff() {
		System.out.println("전화를 끊습니다.");
	}
}
