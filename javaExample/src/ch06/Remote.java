package ch06;

public class Remote {
	// 속성
	// 리모컨 색깔
	String bgcolor; // 전역변수라서 초기값 안줘도 됨(지역변수는 초기화 필수)
	// 리모컨 글자 색깔
	String fontcolor;
	// 볼륨 숫자
	int volume;
	// 채널 숫자
	int channel;
	// 전원 상태
	boolean power; // boolean 타입의 초기값은 false(tv가 꺼져있는 상태)
	
	
	
	// 기능
	// 볼륨을 올리는 기능
	int volumeUp() { //클래스, void는 리턴할 것이 없다는 것!, 그래서 int로 바꿔줌
		volume++; // ++은 증감연산자
		
		return volume; // 볼륨값을 화면에 보여줘라.(return) 
	}
	// 볼륨을 낮추는 기능
	int volumeDown() {
		volume--;
		return volume;
	}
	
	// 채널을 올리는 기능
	int channelUp() {
		channel++;
		return channel;
	}
	// 채널을 내리는 기능
	int channelDown() {
		channel--;
		return channel;
	}
	
	// 파워 on/off
	void power() { // 보여줄게 없으니까 return 필요없고, 즉 void
		power=!power; // 논리 반전 연산자
	}
}
