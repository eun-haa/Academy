package ch06;
// �⺻�� �Ű����� ����
public class PrimitiveParamEx {

	public static void main(String[] args) {
		Data d = new Data(); // x��� ������ ������ �� ����
		d.x=10; //d.x�� x�� �ٸ� ���� ������ ����(���念���� �ٸ�) d.x�� ���� ����
		System.out.println("main() : " + d.x);
		
		// change�޼ҵ� ȣ��
		change(d.x);
		System.out.println("After change(d.x) : ");
		System.out.println("main() : "+d.x);
		
	}// main �޼ҵ� ��
	static void change(int x) { // �⺻�� �Ű�����
		x=1000; //x�� �ݽ��ÿ� ����
		System.out.println("change() : " +x);
	}

}
