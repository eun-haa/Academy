package ch07;

public class HealthTest {

	public static void main(String[] args) {
		System.out.println("***** �񸸵� Check *****");
		
		// 1.Ű����� �Է¹޴� ����� �������(����), �������� ���� �޼��忡 ȣ���ؾ���!
		// ��ɿ��� ������ �ȵ�
		// 2.void input()�� �ҷ����� ���ؼ� �ν��Ͻ� ������ �ؾ���(�ν��Ͻ� Ŭ�����ϱ�!)
		// + void input()�� ���� Health Ŭ������ �־�����, SubHealth�� ��ӵȻ���
		// + �׷��� SubHealth�� �ҷ��͵� ��
		
		// �⺻ ������ ȣ��(�Ű����� ���� �����ڸ� �̹� ��������, �װ� ��ȯ)
		SubHealth sh = new SubHealth();
		
		// (1) input() ȣ��
		// input()�� Ŭ���� �޼ҵ尡 �ƴ� �ν��Ͻ� �޼ҵ��, ���� sh�� �̿��ؼ� ȣ���ؾ���
		// sh.input()�� Ű����� ����, ü��, ���� �Է¹ޱ�
		sh.input();
		
		// (2) output1() ȣ��
		// input() �޼ҵ带 �̿��Ͽ� �Է¹��� ���� ����ϴ� �޼ҵ�
		sh.output1();
		
		// (3) calculate() ȣ��
		// �񸸵��� ������� ���ϴ� �޼ҵ���
		sh.calculate();
		
		// (4) output2() ȣ��
		// calculate()�� �̿��Ͽ� ���� �񸸵��� ������� ����ϴ� �޼ҵ�
		sh.output2();
		

	}

}
