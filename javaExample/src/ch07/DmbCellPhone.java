package ch07;
// 부모클래스 상속(CellPhone)
public class DmbCellPhone extends CellPhone{
	// 속성(DMB 채널)
	int channel;
	
	// 생성자를 통해 모델과 색, 채널을 초기화 합니다.
	DmbCellPhone(String model, String color, int channel){
		// 부모도 초기화를 해주어야해서 super()가 필요!
		super(model, color);
		this.channel=channel;
	}
	
	// 기능
	// DMB 방송 수신을 시작합니다.
	String DmbOn() {
		return "채널 "+channel+"번 DMB 방송 수신을 시작합니다.";
	}
	// 채널을 변경합니다. 
	String ChangeChannel(int channel) {// 매개변수를 받아야 함
		return "채널 " + channel +"번으로 바꿉니다.";
	}
	// DMB 방송 수신을 종료합니다.
	String DmbOff() {
		return "DMB 방송 수신을 종료합니다.";
	}
}
