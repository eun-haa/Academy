package examPractice;
// 상속되는 것 : 변수/메서드(생성자는 상속 X, 생성자도 가져가려면 super써야함)
public class SubEntry extends Entry{
	// 정의를 저장하기 위한 인스턴스 변수
	String definirion;
	// 년도를 저장하기 위한 인스턴스 변수
	int year;
	
	// 기본 생성자
	// 유지보수할 때 편하려고 미리 만들어놓는 경우 있음
	SubEntry(String w){
		// 상속을 받았기 때문에 word가 들어가는게 맞음
		word=w;
	}
	// SubEntry(string w) 호출 -> this()써야함.
	// 나 말고 다른 생성자 호출할 때 사용하는 것 -> this()
	SubEntry(String w, String d, int y){
		this(w);
		definirion=d;
		year=y;
	}
	public void printView() {
		System.out.println("원어 : "+definirion);
		System.out.println("시기 : "+year);
	}
	
}
