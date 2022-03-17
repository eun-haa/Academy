package ch08;
// 5.예외 발생시키기
public class ExcepcionEx2 {

	public static void main(String[] args) {
		try {
			Exception e = new Exception("강제로 예외를 발생시켜보자");
			throw e;
		}catch(Exception e) {
			System.out.println("에러 메시지 : " + e.getMessage());
			e.printStackTrace();
		}
		System.out.println("프로그램이 정상 종료되었음.");

	}

}
