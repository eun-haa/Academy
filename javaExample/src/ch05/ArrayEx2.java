package ch05;

public class ArrayEx2 {

	public static void main(String[] args) {
		// 1�� ���
		int[] iArr1 = new int[10];
		/*iArr1[0]=10;
		iArr1[1]=20;
		iArr1[2]=30;
		iArr1[3]=40;
		iArr1[4]=50;
		iArr1[5]=60;
		iArr1[6]=70;
		iArr1[7]=80;
		iArr1[8]=90;
		iArr1[9]=100;
		*/
		for(int i=0; i<iArr1.length; i++) {
			iArr1[i]=(i+1)*10;
		}
		
		/*
		System.out.println(iArr1[0]);
		System.out.println(iArr1[1]);
		System.out.println(iArr1[2]);
		System.out.println(iArr1[3]);
		System.out.println(iArr1[4]);
		System.out.println(iArr1[5]);
		System.out.println(iArr1[6]);
		System.out.println(iArr1[7]);
		System.out.println(iArr1[8]);
		System.out.println(iArr1[9]);
		*/
		
		for(int i=0; i<=iArr1.length; i++) {
			System.out.println(iArr1[i]);
		}
		
		
		
		// 2�� ���
		int[] iArr2 = new int[] {10,20,30,40,50,60,70,80,90,100};
		/*
		 * ��, int[] iArr2;
		 * iArr2 = {10,20,30,40,50,60,70,80,90,100}; ����
		 * */
		
		// 3�� ���(���� ���� �� �ִ� ���)
		int[] iArr3 = {10,20,30,40,50,60,70,80,90,100};
		/*
		 * ��, int[] iArr3;
		 * iArr3 = {10,20,30,40,50,60,70,80,90,100}; �Ұ���(�����߻�!!)
		 * */
	}

}
