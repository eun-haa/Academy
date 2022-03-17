package ch03_copy;
// 비트전환연산자
public class OperateEx04 {

	public static void main(String[] args) {
		byte p=10;
		
		System.out.println("p = "+toBinaryString(p));
		System.out.println("p = "+toBinaryString(~p)); // ~기호가 비트전환연산자
		
	} // main 메소드 끝

	// 10진수를 2진수로 변환하는 메서드
	static String toBinaryString(int x) { // toBinaryString 시작
		String zero="00000000000000000000000000000000"; // 0이 32개 있어야함
		String tmp=zero + Integer.toBinaryString(x);
		return tmp.substring(tmp.length()-32);
	} // toBinaryString 끝
}
