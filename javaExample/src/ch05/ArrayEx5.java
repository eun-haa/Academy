package ch05;
// �迭�� ����
public class ArrayEx5 {

	public static void main(String[] args) {
		// ���� ������
		int[] oldNumber = {1,2,3,4,5};
		
		// ���纻 ������
		int[] newNumber = new int[10];
		
		
		// 1.for�� �Ἥ �����ϱ�
		for(int i=0; i<oldNumber.length; i++) {
			newNumber[i]=oldNumber[i];
		}
		
		// for�� Ǯ� ���ٸ�?
//		newNumber[0]=oldNumber[0];
//		newNumber[1]=oldNumber[1];
//		newNumber[2]=oldNumber[2];
//		newNumber[3]=oldNumber[3];
//		newNumber[4]=oldNumber[4];
		// �̷��� ������⶧���� for���� �Ἥ �ڵ带 �ٿ��ִ� ��!
		
		
		// 2.�Լ� ����ϱ�
		//System.arraycopy(
		// 1)����������, 
		// 2)���������� ��𼭺��ͺ���, 
		// 3)���纻������, 
		// 4)���纻������ ��𼭺��� �ٿ��ֱ�, 
		// 5)���������� ��� ���� ����)
		
		System.arraycopy(oldNumber, 0, newNumber, 0, oldNumber.length);
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
