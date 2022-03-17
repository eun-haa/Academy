package ch07.modifier;

public class TimeTest {

	public static void main(String[] args) {
		Time t = new Time(12,35,30); // 12시 35분 30초
		
		// 메소드를 사용해서 우회해서 값을 가지고 오기(현재 private 설정이 되어있음)
		
		t.setHour(30);
		System.out.println(t.toString());
	}

}
