package javaExample;

public class Time {
	// 시, 분, 초  변수 설정
	private int hour;   // 시
	private int minute; // 분
	private int second; //초
	
	// 파라미터로 hour, minute, second를 가지는 생성자
	Time(int hour, int minute, int second){
		this.hour=hour;
		this.minute=minute;
		this.second=second;
	}
	// setter, getter
	// 시간이 0 미만이거나 23 초과면 리턴, 리턴이 되는 순간 setHour는 끝남
	public void setHour(int hour) {
		if(hour < 0 || hour > 23) {
			return;
		}
		this.hour=hour;
	}
	
	public int getHour() {
		return hour;
	}
	// 분이 0 미만이거나 59분 초과면 리턴
	public void setMinute(int minute) {
		if(minute < 0 || minute > 59) {
			return;
		}
		this.minute=minute;
	}
	
	public int getMinute() {
		return minute;
	}
	
	// 초가 0 마만이거나  59 초과면 리턴
	public void setSecond(int second) {
		if(second < 0 || second > 59) {
			return;
		}
		this.second=second;
	}
	
	public int getSecond() {
		return second;
	}
	
	// String toString() 메서드 -> 시간:분:초 를 리턴하는 메서드
	
	public String toString() {
		return hour+ " : "+minute+" : " +second;
	}
}
