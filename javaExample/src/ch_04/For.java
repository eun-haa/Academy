package ch_04;
// �ݺ���
public class For {

	public static void main(String[] args) {
		// Hello World��� ���ڿ��� 10�� ����ϼ���.(for��)
		// for(�ʱⰪ ; ���ǽ�; ������){�ݺ��� ����}
//		for(int i=1; i<=10; i++) {
//			System.out.println("Hello World");
//		}
		
		// for�� - 1���� 10���� ���� ���ϱ�
//		int sum=0;
//		int i=0;
//		for(i=1; i<11; i++) {
//			sum=sum+i; // sum+=i
//		}
//		System.out.println(i-1+"������ �� : " +sum);//int i�� ���������� �ν� X, ����
//		
		// while
		// �ʱⰪ
		// while(���ǽ�){
		// �߰���
		// �ݺ��� ����
		// }
//		int i=11;
//		while(i<11) {
//			i++;
//			System.out.println("Hello World");
//		}
		
		// do-while
//		int i=11;
//		do {
//			i++;
//			System.out.println("Hello World");
//		}while(i<11);
		
		
		
		// ��ø for�� �̿��Ͽ� 2�ܺ��� 9�ܱ��� ������.
//		for(int i=2; i<10; i++) {
//			for(int j=1; j<10; j++) {
//				System.out.println(i + " X " + j + " = " + i*j);
//			}
//		}
		
		
		
		// break
//		int sum=0;
//		int i=0;
//		
//		while(true) {//while���� ���ǽ��� true�̸�, ���� ����
//			if(sum>100) {
//				break;
//			}
//			i++;
//			sum+=i;
//			
//			
//		}
//		System.out.println("i = " +i);
//		System.out.println("sum = "+sum);
		
		
		
		// continue
//		for(int i=0; i<10; i++) {
//			if(i%3==0) { //3�� ����� �κи� ���� �ݺ�(����� ������)
//				continue;
//			}
//			System.out.println(i);
//		}
		
		
		// �̸� ���� �ݺ���
		// �̸��� ���ٸ�?
		for(int i=2; i<10; i++) {
			for(int j=1; j<10; j++) {
				System.out.println(i + " X " + j + " = " + i*j);
				break; // j �ݺ��� ����(���� �����̿� �ִ� �ݺ����� ���߰���)
			}
			break; // i �ݺ��� ����
		} // ���� ���߰� �Ϸ��� �ΰ��� �극��ũ�� �ʿ���
		
		
		// �̸��� �ٿ��ָ�?
		Loop1:for(int i=2; i<10; i++) {
			for(int j=1; j<10; j++) {
				//System.out.println(i + " X " + j + " = " + i*j);
				if(j==5) {
					//break; // 2~9�� ��� 5�������� ����
					//break Loop1; // 2���� 5�������� ����(Loop1�� break)
					continue; // j�� ���� continue, �� ���� 5���� ���� �ݺ�
					          //(��� sysout�� if �ڿ� �־����)
					//continue Loop1;
				}
				//System.out.println(i + " X " + j + " = " + i*j);
			}
		}
		
		
		
		
		
		
		
		
	}

}
