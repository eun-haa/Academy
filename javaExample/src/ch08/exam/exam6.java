package ch08.exam;

import java.util.InputMismatchException;
import java.util.Scanner;

public class exam6 {
	public static void main(String[] args) {
		int cNum=20;
		//int cNum=(int)(Math.random() * 100)*1;
		int count=0;
		
		while(true) { // �ݺ� ����
			int user=0;
			System.out.print("1�� 100������ ���� �Է��ϼ��� : ");
			Scanner sc = new Scanner(System.in);
			user = sc.nextInt();
			count++;

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
