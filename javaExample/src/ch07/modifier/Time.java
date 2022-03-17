package ch07.modifier;

public class Time {
	private int hour;   // 시
	private int minute; // 분
	private int second; // 초
	
	// 생성자
	Time(int hour, int minute, int second){
		this.hour=hour;
		this.minute=minute;
		this.second=second;
	}
	
	// getter : 인스턴스에 저장된 값을 가지고 오는 것
	// setter : 인스턴스에 값을 저장

	public int getHour() {
		return hour;
	}

	public void setHour(int hour) {
		// 시간이 0 미만
		if(hour<0 || hour>23) {
			return; // 리턴이 되는 순간 setHour는 끝남
		}
		this.hour = hour;
	}

	public int getMinute() {
		return minute;
	}

	public void setMinute(int minute) {
		// 분이 0미만이거나 59분초과이면 return
		if(minute<0 || minute>59) {
			return;
		}
		this.minute = minute;
	}

	public int getSecond() {
		return second;
	}

	public void setSecond(int second) {
		// 초가 0미만이거나 59초 초과이면 return(밑에 거 실행하지말기)
		if(second<0 || second>59) {
			return;
		}
		this.second = second;
	}
	
	public String toString() {
		return hour+":"+minute+":"+second;
	}
	

}
