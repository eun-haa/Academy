package ch07;

public class CellPhone {
	// 변수(속성)
	// 모델과 색을 저장
	String model; // 모델
	String color; // 색상
	
	// 생성자(모델과 색상을 초기화 하기 위한 매개변수 2개인 생성자)
	CellPhone(String model, String color){
		this.model=model;
		this.color=color;
	}
	
	// 메서드(기능)
	// 전원을 켭니다
	String PowerOn() {// return 타입이라 void 대신에 String! 
		return "전원을 켭니다."; // 화면에 반환해야 하니까 return
	}
	
	// 전원을 끕니다
	String PowerOff() {
		return "전원을 끕니다.";
	}
	// 벨이 울립니다
	String Bell() {
		return "벨이 울립니다.";
	}
	// 수신목소리전송
	String ReceiveVoice(String msg) {// 값이 다 다르기에 매개변수로 값을 받아와야함
		return msg;
	}
	// 송신목소리전송
	String SendVoice(String msg) {
		return msg;
	}
	// 전화를 끊습니다
	String CallOff() {
		return "전화를 끊습니다.";
	}
	
	
}
