package ch06;
// ������ �Ű����� ����
public class ReferencePramEx {

	public static void main(String[] args) {
		Data d = new Data(); 
		d.x=10;
		System.out.println("main() : " + d.x);
		
		change(d);
		System.out.println("After change(d) : ");
		System.out.println("main() : "+d.x);

	}//main �޼ҵ� ��
	static void change(Data d) {// ������ �Ű�����, Data d���� �ּ�(0x100)����
		d.x=1000;
		System.out.println("change(0 : x = "+d.x);
	}

}
