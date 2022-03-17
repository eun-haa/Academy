package ch06;
// 참조형 매개변수 예제
public class ReferencePramEx {

	public static void main(String[] args) {
		Data d = new Data(); 
		d.x=10;
		System.out.println("main() : " + d.x);
		
		change(d);
		System.out.println("After change(d) : ");
		System.out.println("main() : "+d.x);

	}//main 메소드 끝
	static void change(Data d) {// 참조형 매개변수, Data d에는 주소(0x100)저장
		d.x=1000;
		System.out.println("change(0 : x = "+d.x);
	}

}
