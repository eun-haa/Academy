package ch03_copy;
// ��Ʈ��ȯ������
public class OperateEx04 {

	public static void main(String[] args) {
		byte p=10;
		
		System.out.println("p = "+toBinaryString(p));
		System.out.println("p = "+toBinaryString(~p)); // ~��ȣ�� ��Ʈ��ȯ������
		
	} // main �޼ҵ� ��

	// 10������ 2������ ��ȯ�ϴ� �޼���
	static String toBinaryString(int x) { // toBinaryString ����
		String zero="00000000000000000000000000000000"; // 0�� 32�� �־����
		String tmp=zero + Integer.toBinaryString(x);
		return tmp.substring(tmp.length()-32);
	} // toBinaryString ��
}
