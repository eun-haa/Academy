package ch07;

public class EntryTest {

	public static void main(String[] args) {
		SubEntry se = new SubEntry();
		// 상속했기때문에 SubEntry만 불러오는 것
		
		// se가 가지고 있는 writeView()를 가지고와라
		se.writeView();
		
		// se가 가지고 있는 printView()를 가지고와라
		se.printView();

	}

}
