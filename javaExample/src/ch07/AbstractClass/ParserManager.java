package ch07.AbstractClass;
// ParserManager클래스의 getParser메서드는
// 매개변수로 넘겨받는 type의 값에 따라
// XMLParser인스턴스 또는 HTMLParser인스턴스 반환
public class ParserManager {
// 접근제어자/클래스메서드 /리턴타입      /메서드명       /매개변수
	public static Parseable getParser(String type) {
//			              ㄴ 인터페이스를 메서드의 리턴타입으로 지정할 수 있음
		if(type.equals("JAVA")) {
			// 인터페이스 다형성
			Parseable p = new JAVAParser();
			return p;
			//return new JAVAParser();
		}else {
			// 인터페이스 다형성
			// 인터페이스 타입 = 클래스 타입
			Parseable p = new HTMLParser();
			return p;
			//return new HTMLParser();
		}
	}
}
