package examPractice;
// 부모로부터 상속받은 기본 생성자를 호출하는 super() 내장
// but 부모에 기본생성자가 아닌 생성자가 들어가있어서, 부모클래스에 기본생성자가 사라짐
// 그래서 자식에도 맞춰주어야 함 DmbCellPhone((super());
public class DmbCellPhone extends CellPhone{
	// 부가 기능 -> 자식 클래스에 만들어줌
	// Dmb on
	// Dmb off
	// Dmb 채널 변경
	
	// 속성(DMB 채널)
	int channel;
	
	//-----------------------------------
	
	// 생성자로 초기화
	DmbCellPhone(String model, String color, int channel){
		super(model, color);
		this.channel=channel;
	}
	
	//-----------------------------------
	// 부가 기능 -> 자식 클래스에 만들어줌
	
	// Dmb on
	void dmbOn(int channel) {
		System.out.println("채널 " + channel +"번 DMB 방송 수신을 시작합니다.");
		//return "채널 " + channel +"번 DMB 방송 수신을 시작합니다.";
	}
	// Dmb off
	void dmbOff() {
		System.out.println("DMB 방송 수신을 종료합니다.");
		//return "DMB 방송 수신을 종료합니다.";
	}
	// Dmb 채널 변경
	void channelChange() { // 매개변수를 받아야 해서 int channel 들어감
		System.out.println("채널을 바꿉니다.");
		//return "채널을 " + channel + "번으로 바꿉니다.";
	}


	
}
