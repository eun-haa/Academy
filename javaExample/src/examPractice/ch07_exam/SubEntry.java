package examPractice.ch07_exam;
// 자식클래스
public class SubEntry extends Entry {
	// 부모클래스와 연결해주었기에 부모 클래스에 있는 것들이 상속됨
	// 생성자(초기화) 빼고!
	
	// 원어를 담을 변수
	String definition;
	// 시기를 담을 변수
	int year;
	
	// 생성자 초기화
	SubEntry(String w){
		word=w;
	}
	SubEntry(String w, String d, int y){
		this(w);
		definition=d;
		year=y;
	}
	
	// 원어, 시기 출력하는 메소드
	public void printView() {
		System.out.println("원어 : " + definition);
		System.out.println("시기 : "+ year);
	}
	
	
}
