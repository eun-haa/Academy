package ch07.AbstractClass;
// Parseable 인터페이스는 구문분석(Parsing)을 수행하는 기능을 구현할 목적으로
// 추상메서트 parse(STring fileName)을 정의.
public interface Parseable {
	// (public abstract) void parse(String fileName) -> 앞 괄호 생략된 상태
	void parse(String fileName); // 세미콜론으로 닫았으니까 interface,추상인 걸 알 수 있음
}
