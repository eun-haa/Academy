package examPractice.ch07_exam;

public class AccountTest {

	public static void main(String[] args) {
		Account a = new Account();
		a.setBalance(10000);
		System.out.println("???? ?ܰ??? : " + a.getBalance());
		a.setBalance(-100);
		System.out.println("???? ?ܰ??? : "+ a.getBalance());
		a.setBalance(2000000);
		System.out.println("???? ?ܰ??? : " + a.getBalance());
		a.setBalance(300000);
		System.out.println("???? ?ܰ??? : " + a.getBalance());

	}

}
