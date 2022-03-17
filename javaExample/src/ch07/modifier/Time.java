package ch07.modifier;

public class Time {
	private int hour;   // ��
	private int minute; // ��
	private int second; // ��
	
	// ������
	Time(int hour, int minute, int second){
		this.hour=hour;
		this.minute=minute;
		this.second=second;
	}
	
	// getter : �ν��Ͻ��� ����� ���� ������ ���� ��
	// setter : �ν��Ͻ��� ���� ����

	public int getHour() {
		return hour;
	}

	public void setHour(int hour) {
		// �ð��� 0 �̸�
		if(hour<0 || hour>23) {
			return; // ������ �Ǵ� ���� setHour�� ����
		}
		this.hour = hour;
	}

	public int getMinute() {
		return minute;
	}

	public void setMinute(int minute) {
		// ���� 0�̸��̰ų� 59���ʰ��̸� return
		if(minute<0 || minute>59) {
			return;
		}
		this.minute = minute;
	}

	public int getSecond() {
		return second;
	}

	public void setSecond(int second) {
		// �ʰ� 0�̸��̰ų� 59�� �ʰ��̸� return(�ؿ� �� ������������)
		if(second<0 || second>59) {
			return;
		}
		this.second = second;
	}
	
	public String toString() {
		return hour+":"+minute+":"+second;
	}
	

}
