package ch08;

public class FinallyTest {

	public static void main(String[] args) {
		try {
			startInstall();// 프로그램 설치에 필요한 준비를 하는 기능
			copyFiles();// 파일을 복사하는 기능
			//deleteTempFiles();// 프로그램 설치에 사용된 임시파일들을 삭제하는 기능
		}catch(Exception e) {

			
		}finally {
			// 설치가 잘 되어도 임시파일은 삭제, 안되어도 임시파일은 삭제
			deleteTempFiles();// 프로그램 설치에 사용된 임시파일들을 삭제하는 기능
		}
	}// main메소드 끝
	//메소드 선언
	// new라는 키워드 없이 메소드를 만들어야해서, static을 붙여야 함!
	static void startInstall() {}
	static void copyFiles() {}
	static void deleteTempFiles() {}

}
