package examPractice;

public class Entry {
	// 약어를 저장하기 위한 인스턴스 변수
	String word;
	
	// 기본 생성자
	Entry(){
		
	}
	// 약어를 전달받아 word 변수를 초기화 하기 위한 새성자
	Entry(String w){
		word=w;
	}
	// 약어를 출력하기 위한 기능이 있는 메소드 선언
	// 리턴 타입도 없고 매개변수도 없는 메서드
	public void writeView() {
		System.out.println("약어 : " + word);
	}
}
