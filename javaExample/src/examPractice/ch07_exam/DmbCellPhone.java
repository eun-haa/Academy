package examPractice.ch07_exam;
// 자식클래스
public class DmbCellPhone extends CellPhone{
	// 부모 클래스 상속 안료
	
	// 속성
	// 채널을 저장하는 변수
	int channel;
	
	//------------------------------------
	// 초기화 생성자
	DmbCellPhone(String model, String color, int channel){
		super(model, color);
		this.channel=channel;
		
	}
	
	//------------------------------------
	// Dmb on
	void dmbOn() {
		System.out.println("채널" + channel + "번 DMB 방송 수신을 시작합니다.");
	}
	
	// 채널 변경
	void changeChannel() {
		System.out.println("채널 12번으로 바꿉니다.");
	}
	
	// DMB off
	void dmbOff() {
		System.out.println("DMB 방송 수신을 종료합니다.");
	}
}
