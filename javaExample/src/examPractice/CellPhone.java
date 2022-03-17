package examPractice;

public class CellPhone {
	// 공통부분 -> 부모 클래스에 만들어줌
	// 핸드폰의 "속성"
	// 모델
	String model;
	// 색상
	String color;
	
	//-----------------------------------
	
	CellPhone(String model, String color){
		this.model=model; //매개변수와 cellphone에 있는 것이 같아서 this 사용해야함
		this.color=color;
	}
	
	//-----------------------------------
	
	// 핸드폰의 "기능"
	// 전원을 켭니다.
	void powerOn() {
		System.out.println("전원을 켭니다.");
		//return "전원을 켭니다.";
	}
	// 전원을 끕니다.
	void powerOff() {
		System.out.println("전원을 끕니다.");
		//return "전원을 끕니다.";
	}
	// 벨 울림
	void bell() {
		System.out.println("벨이 울립니다.");
		//return "벨이 울립니다.";
	}
	// 수신 목소리 전송(나)
	void recVoice(String re_msg) {
		System.out.println("나 : " + re_msg);
		//return "수신 목소리 전송";
	}
	// 송신 목소리 전송(상대방)
	void senVoice(String sa_msg) {
		System.out.println("상대방 : " + sa_msg);
		//return "송신 목소리 전송";
	}
	// 전화를 끊습니다.
	void callOff() {
		System.out.println("전화를 끊습니다.");
		//return "전화를 끊습니다.";
	}
	

}


