package ch08;

public class Finally {

	public static void main(String[] args) {
		System.out.println(1);
		System.out.println(2);
		System.out.println(3);
		try {						 // try 블럭에서
			System.out.println(0/0); // 예외 발생 -> catch 블럭 -> finally 블럭
									 // 예외 발생 X -> finally 블럭

		}catch(ArithmeticException ae) {
			ae.printStackTrace();
			System.out.println("산술적인 예외는 여기로...");
		}finally {
			System.out.println(4);
		}

	}

}
