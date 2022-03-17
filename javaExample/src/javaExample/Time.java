package javaExample;

public class Time {
	// ��, ��, ��  ���� ����
	private int hour;   // ��
	private int minute; // ��
	private int second; //��
	
	// �Ķ���ͷ� hour, minute, second�� ������ ������
	Time(int hour, int minute, int second){
		this.hour=hour;
		this.minute=minute;
		this.second=second;
	}
	// setter, getter
	// �ð��� 0 �̸��̰ų� 23 �ʰ��� ����, ������ �Ǵ� ���� setHour�� ����
	public void setHour(int hour) {
		if(hour < 0 || hour > 23) {
			return;
		}
		this.hour=hour;
	}
	
	public int getHour() {
		return hour;
	}
	// ���� 0 �̸��̰ų� 59�� �ʰ��� ����
	public void setMinute(int minute) {
		if(minute < 0 || minute > 59) {
			return;
		}
		this.minute=minute;
	}
	
	public int getMinute() {
		return minute;
	}
	
	// �ʰ� 0 �����̰ų�  59 �ʰ��� ����
	public void setSecond(int second) {
		if(second < 0 || second > 59) {
			return;
		}
		this.second=second;
	}
	
	public int getSecond() {
		return second;
	}
	
	// String toString() �޼��� -> �ð�:��:�� �� �����ϴ� �޼���
	
	public String toString() {
		return hour+ " : "+minute+" : " +second;
	}
}
