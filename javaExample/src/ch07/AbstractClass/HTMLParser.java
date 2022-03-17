package ch07.AbstractClass;
//Parseable 인터페이스 구현
public class HTMLParser implements Parseable{
		// 빨간 밑줄이 그이는 이유? -> 구현이 아직 안되어있어서(반드시 구현해야함)
	public void parse(String fileName) {
		System.out.println(fileName + "- HTML parsing completed.");
	}
}
