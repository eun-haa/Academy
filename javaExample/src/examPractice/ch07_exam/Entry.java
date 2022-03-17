package examPractice.ch07_exam;
// 부모클래스
public class Entry {
	// 약어를 담을 변수
	String word;
	
	// 초기화
	Entry(){
		
	}
	
	Entry(String w){
		word=w;
	}
	
	// 약어 출력 메소드
	public void writeView() {
		System.out.println("약어 : " + word);
	}
}
