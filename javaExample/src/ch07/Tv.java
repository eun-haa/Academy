package ch07;

public class Tv {
	// 속성
	// 전원상태(on/off)
	boolean power; // 인스턴스 변수
	// 채널
	int channel;   // 인스턴스 변수
	
	// 기능
	// 전원을 키거나 끈다
	void power() {
		power = !power;
	}
	// 채널을 올린다.
	void channelUp() {++channel;}
	// 채널을 내린다.
	void channelDown() {--channel;}
}
