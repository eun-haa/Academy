package ch08;
// 멀티캐치
public class ExceotionEx1 {

	public static void main(String[] args) {
		System.out.println("가나다");  // 문법적 오류(예외가 아니라 컴파일 에러), 
									 //	실행 안했을 때 빨간색 줄 그이는 것
		System.out.println(1);
		System.out.println(2);
		
		// 예외가 발생할 것 같은 구문에 try-catch 사용
		try { // 예외가 발생할 수 있다고 판단되는 곳
			System.out.println(3);
			System.out.println(0/0); // 예외 발생!!
			System.out.println(4);	 // 예외가 발생하면 건너뛰어짐
		}catch(ArithmeticException ae) {
			ae.printStackTrace();
			System.out.println("예외 메세지 : " + ae.getMessage());
			
			System.out.println(5);	// 예외 발생하지 않으면 실행 X, 예외발생하면 실행 O
			System.out.println("ArithmeticException"); // 예외 발생하지 않으면 실행 X, 예외발생하면 실행 O
		}catch(Exception e) {
			System.out.println("ArithmeticException"); // 예외 발생하지 않으면 실행 X, 예외발생하면 실행 O
		}

	}

}
