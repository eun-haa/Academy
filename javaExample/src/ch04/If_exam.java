package ch04;

import java.util.Scanner;

public class If_exam {

	public static void main(String[] args) {
		// ����ڰ� Ű����� �Է��� �� �ְ� �ϴ� Class(Scanner)
		// Ŭ���ؼ� import ���ֱ�
		// �ٸ� ��Ű���� �ִ� �� ���⼭�� ����� �� �ְ� �ϱ� ����
		// Scanner�� ������ ����
		
		// int  a = 10;
		// s�� ���� �ְ���� �̸� �൵ ��(�⺻ Ÿ���� ������ó��)
//		Scanner s = new Scanner(System.in);
		
		// ������ int(����)�� �Է¹޾ƾ� �ϴϱ� s.nextInt\
		// �տ� s�� ������ ������ �̸�, �� �̸� ���ؼ� �ҷ���
		
		//--------------------------------------------
		
		// 1�� ���� Ǭ ��
//		int num = 12;
//		if(num%3==0 && num%4==0) {
//			System.out.println("true");
//		}else {
//			System.out.println("false");
//		}
		
		// 1. ���� num�� �Է¹޾�, num�� 3�� ����̸鼭 4�� ����� �ƴϸ� true��,
		// �׷��� ������ false�� ����ϴ� ���α׷��� �ۼ��غ���.
		
		// 1�� Ǯ��
//		System.out.print("���ڸ� �Է��ϼ���."); // ln ������ Ŀ�� �ٹٲ�!
//		int num=s.nextInt();
//		if(num%3==0 && num%4!=0) {
//			System.out.println("true");
//		} else {
//			System.out.println("false");
//		}
		

		//--------------------------------------------		
		
		// 2�� ���� Ǭ ��
//		int num2 = 0;
//		if(num2==0) {
//			System.out.println("0�Դϴ�");
//		}else if(num2%2==0) {
//			System.out.println("¦���Դϴ�");
//		}else {
//			System.out.println("Ȧ���Դϴ�");
//		}
		
		// 2. �Ʒ��� ���� ����� �������� �ڵ��غ���. ��, 0�� 0���� �����
		// (�̶� 3�� Ű����� �Է¹޾Ƽ� ó����)
		// ------------------------------
		// ���ڸ� �Է��ϼ���. >3
		// Ȧ���Դϴ�.
		
		// 2�� Ǯ��
		
//		Scanner s = new Scanner(System.in);
//		System.out.print("���ڸ� �Է��ϼ���");
//		int num2=s.nextInt();
//		
//		// ��
//		if(num2==0) {
//			System.out.println("0�Դϴ�");
//		}else if(num2%2==0) {
//			System.out.println("¦���Դϴ�");
//		}else {
//			System.out.println("Ȧ���Դϴ�");
//		}
//		
//		
//		// ��
//		if(num2%2==0 && num!=0) {
//			System.out.println("¦��");
//		}else if(num==0) {
//			System.out.println("0");
//		}else {
//			System.out.println("Ȧ��");
//		}
		
		
		//--------------------------------------------		
		
		
		// 3�� ���� Ǭ ��
//		Scanner s = new Scanner(System.in);
//		System.out.print("������ �Է��ϼ���");
//		int score = s.nextInt();
//		char grade =' ';
//		String str1 = "�� ���߽��ϴ�.";
//		String str2 = "�� �� ����ϼ���.";
//		String str3 = "���� �б⿡ �ٽ� �����ϼ���.";
//		
//		if(score>=90) {
//			grade ='A';
//			System.out.println("���� : " + grade + "\n" + "�޼��� : " + str1);
//		}else if(score>=80) {
//			grade='B';
//			System.out.println("���� : " + grade + "\n" + "�޼��� : " + str1);
//		}else if(score>=70) {
//			grade='C';
//			System.out.println("���� : " + grade + "\n" + "�޼��� : " + str2);
//		}else if(score>=60) {
//			grade='D';
//			System.out.println("���� : " + grade + "\n" + "�޼��� : " + str2);
//		}else {
//			grade='F';
//			System.out.println("���� : " + grade + "\n" + "�޼��� : " + str3);
//		}
		
		// 3�� Ǯ��
		
//		Scanner s = new Scanner(System.in);
//		System.out.print("������ �Է��ϼ���");
//		int score = s.nextInt();
//		char grade =' ';
//		String msg = "";
//		
//		if(score>=90) {
//			grade ='A';
//		}else if(score>=80) {
//			grade='B';
//		}else if(score>=70) {
//			grade='C';
//		}else if(score>=60) {
//			grade='D';
//		}else {
//			grade='F';
//		}
//		
//		switch(grade) {
//			case 'A':
//			case 'B':
//				msg="�� ���߽��ϴ�.";
//				break;
//			case 'C':
//			case 'D':
//				msg="�� �� ����ϼ���.";
//				break;
//			default:
//				msg="�����б⿡ �ٽ� �����ϼ���.";
//				break;
//		}
//		
//		System.out.println("���� : "+grade);
//		System.out.println("�޼��� : "+msg);
		
		
		//---------------------------------------------
		
		// 4��
		// ���� 2���� ��Ģ����(+ - * /)�� ���� ������ ���̿� �ΰ� �־����� ���,
		// �ش� ������ ����� ����ϴ� ���α׷��� �ۼ��غ���
		
		// ���
		//--------------------------------
		// ������ �Է��ϼ���.(ex:3 * 7)> 3 * 7
		// ������� 21.0 �Դϴ�.
		
		Scanner s =new Scanner(System.in);
		System.out.println("������ �Է��ϼ���.(ex:3 * 7)>");
		
		// ù��° �������� �����ϴ� ����
		int first=s.nextInt();
		
		// ��Ģ�����ȣ�� �����ϴ� ����
		// 1. String���� �ϱ�
		//String oper=s.nextLine();
		//String oper=s.next();
		
		// 2. char���� �ϱ�
		char oper=s.next().charAt(0);
		
		// �ι�° �������� �����ϴ� �Լ�
		int second=s.nextInt();
		
		
		if(oper==('+')) {// ��Ģ�����ȣ(oper)�� '+'�̸�,
			// ù��° ������(first)+�ι�° ������(second)
			System.out.println(first+second);
		}else if(oper==('-')) {// ��Ģ�����ȣ(oper)�� '-'�̸�,
			// ù��° ������(first)-�ι�° ������(second)
			System.out.println(first-second);
		}else if(oper==('*')) {// ��Ģ�����ȣ(oper)�� '*'�̸�,
			// ù��° ������(first)*�ι�° ������(second)
			System.out.println(first*second);
		}else if(oper==('/')) {// ��Ģ�����ȣ(oper)�� '/'�̸�,
			// ù��° ������(first)/�ι�° ������(second)
			System.out.println(first/second);
		}else {
			// +, -, *, / �� �ϳ��� �Է��ϼ���.
			System.out.println("+, -, *, / �� �ϳ��� �Է��ϼ���.");
		}
		
		
		
		
		
		
		
		
		
		
		
		
		

		
		
		
		
		
		
	}

}
