package ch07.polymorphism;
	// ��� ������ �ߺ� ���ǵ� ���,
	// ���������� Ÿ�Կ� ���� ����Ǵ� ��������� �޶���
	// (��������Ÿ�Կ� �������)
	// ���⼭�� �������� = (p,c)

	// �޼��尡 �ߺ� ���ǵ� ���,
	// ���������� Ÿ�Կ� �������
	// �׻� ���� �ν��Ͻ��� Ÿ�Կ� ���ǵ� �޼��尡 ȣ��ȴ�
	// (��������Ÿ�Կ� ���� ���� ����)
	// ���⼭�� �ν��Ͻ� Ÿ�� = (new "Child1()")

public class BindingTest {

	public static void main(String[] args) {
		Parent1 p = new Child1();
		Child1 c = new Child1();
		
		System.out.println(p.x); // parant1�� �ִ� x���� ���
		p.method();
		System.out.println(c.x); // child1�� �ִ� x���� ���
		c.method();

	}

}
