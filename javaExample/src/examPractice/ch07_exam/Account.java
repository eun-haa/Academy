package examPractice.ch07_exam;

public class Account {
	private int balance=0;         // �ܺο��� balance �ʵ带 �������� ���ϵ���
	final int MIN_BALANCE=0;       // �ּ� �ܰ�=0�� ���
	final int MAX_BALANCE=1000000; // �ִ� �ܰ�=1000000�� ���
	
	
	// �޼ҵ� ����
	public int getBalance() {
		return balance;
	}
	
	public void setBalance(int setter) {
		// balance�� ���� �����̰ų� �鸸���� �ʰ��ϸ� 
		if(setter >= MIN_BALANCE && setter <= MAX_BALANCE) {
			// ���� balance�� �����϶�
			this.balance=setter;
		}
	}
}
