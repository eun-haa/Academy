package ch08.exam;

import java.util.InputMismatchException;
import java.util.Scanner;

public class exam7 {

	public static void main(String[] args) {
		int cNum=20;
		//int cNum=(int)(Math.random() * 100)*1;
		int count=0;
		
		while(true) { // �ݺ� ����
			int user=0;
			
			try {
			//System.out.println(cNum);
			Scanner sc = new Scanner(System.in);
			System.out.print("1�� 100������ ���� �Է��ϼ��� : ");
			user = sc.nextInt();
			count++;
			}catch(InputMismatchException e){
				System.out.println("���ڸ� �Է��� �� �ֽ��ϴ�. �ٽ� �Է����ּ���~");
				continue;
			}

			if(cNum>user) {
				System.out.println("�� ū ���� �Է��ϼ���.");
			}else if(cNum<user) {
				System.out.println("�� ���� ���� �Է��ϼ���.");
			}else {
				System.out.println("����!!");
				System.out.println(count + "������ ���߼̽��ϴ�.");
				break;
			}
		} // �ݺ� ��

	}// main end.

}

