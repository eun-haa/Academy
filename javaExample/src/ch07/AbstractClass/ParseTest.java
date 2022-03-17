package ch07.AbstractClass;
// 메인 메서드가 있는 클래스가 제일 먼저 실행
public class ParseTest {

	public static void main(String[] args) {
		// 클래스 메서드는 클래스이름.메서드이름으로 호출했음(new 없이)
		// getParser() => 클래스메서드
		// 클래스메서드 앞에는 static이 붙음  8
		Parseable parser = ParserManager.getParser("JAVA");
		parser.parse("document.java");
		parser = ParserManager.getParser("HTML");
		parser.parse("document.html");

	}

}
