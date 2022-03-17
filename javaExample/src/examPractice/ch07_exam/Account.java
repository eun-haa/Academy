package examPractice.ch07_exam;

public class Account {
	private int balance=0;         // 외부에서 balance 필드를 변경하지 못하도록
	final int MIN_BALANCE=0;       // 최소 잔고값=0인 상수
	final int MAX_BALANCE=1000000; // 최대 잔고값=1000000인 상수
	
	
	// 메소드 선언
	public int getBalance() {
		return balance;
	}
	
	public void setBalance(int setter) {
		// balance의 값이 음수이거나 백만원을 초과하면 
		if(setter >= MIN_BALANCE && setter <= MAX_BALANCE) {
			// 현재 balance를 유지하라
			this.balance=setter;
		}
	}
}
