package ch03_copy;
// 부호 연산자
public class OperateEx02 {

	public static void main(String[] args) {
		int i=-10; // i라는 변수에 -10 대입
		
		i=+i; // i=+(-10) : -10 * 1 => i변수에는 -10이 저장
		System.out.println(i);
		
		i=-10;
		i=-i; //i=-(-10) : -10 * -1 => i변수에는 +10이 저장
		System.out.println(i);

	}

}

