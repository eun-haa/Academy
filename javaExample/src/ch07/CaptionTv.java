package ch07;

public class CaptionTv extends Tv{ // extends Tv => Tv 클래스를 그대로 옮겨옴
	// 속성
	// 캡션(자막) 상태
	boolean caption;
	// 기능
	// 화면에 캡션(자막)을 보여준다.
	void displayCaption(String text) {// 캡션상태가 true일때만 text를 보여준다.
		if(caption) {
		System.out.println(text);
		}
	}
}
