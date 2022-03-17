package examPractice.ch07_exam;

public class EntryTest {

	public static void main(String[] args) {
		SubEntry se = new SubEntry("ODP", "Object Oriented Programming", 1991);
		
		System.out.println("*****약어사전*****");
		se.writeView();
		se.printView();

	}

}
