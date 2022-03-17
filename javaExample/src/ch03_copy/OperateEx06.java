package ch03_copy;
// 쉬프트연산자(비트 이동 연산자)
public class OperateEx06 {

	public static void main(String[] args) { // main 메소드 시작
		byte p = 8;
		// 비트가 오른쪽으로 이동
		System.out.println("p = " +toBinaryString(p>>0)); //이동 X
		System.out.println("p = " +toBinaryString(p>>1)); //
		System.out.println("p = " +toBinaryString(p>>2));
		
		
		p = 8;
		// 비트가 왼쪽으로 이동
		System.out.println("p = " +toBinaryString(p>>0));
		System.out.println("p = " +toBinaryString(p>>1));
		System.out.println("p = " +toBinaryString(p>>2));

	} // main 메소드 끝
	// 10진수를 2진수로 변환하는 메서드
	static String toBinaryString(int x) { // toBinaryString 시작
		String zero="00000000000000000000000000000000"; // 0이 32개 있어야함
		String tmp=zero + Integer.toBinaryString(x);
		return tmp.substring(tmp.length()-32);
	} // toBinaryString 끝

}
