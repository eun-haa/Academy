package ch03_copy;
// ����Ʈ������(��Ʈ �̵� ������)
public class OperateEx06 {

	public static void main(String[] args) { // main �޼ҵ� ����
		byte p = 8;
		// ��Ʈ�� ���������� �̵�
		System.out.println("p = " +toBinaryString(p>>0)); //�̵� X
		System.out.println("p = " +toBinaryString(p>>1)); //
		System.out.println("p = " +toBinaryString(p>>2));
		
		
		p = 8;
		// ��Ʈ�� �������� �̵�
		System.out.println("p = " +toBinaryString(p>>0));
		System.out.println("p = " +toBinaryString(p>>1));
		System.out.println("p = " +toBinaryString(p>>2));

	} // main �޼ҵ� ��
	// 10������ 2������ ��ȯ�ϴ� �޼���
	static String toBinaryString(int x) { // toBinaryString ����
		String zero="00000000000000000000000000000000"; // 0�� 32�� �־����
		String tmp=zero + Integer.toBinaryString(x);
		return tmp.substring(tmp.length()-32);
	} // toBinaryString ��

}
