package ch_04;

import java.util.Scanner;

public class test_01 {

	public static void main(String[] args) {
		// 1��
//		Scanner s= new Scanner(System.in);
//		System.out.print("���ڸ� �Է��ϼ��� : ");
//		int num = s.nextInt();
//		
//		if(num%3==0 && num%4!=0) {
//			System.out.println("true");
//		}else {
//			System.out.println("false");
//		}
		
		// 2��
//		Scanner s = new Scanner(System.in);
//		System.out.print("���ڸ� �Է��ϼ��� : ");
//		
//		int num = s.nextInt();
//		
//		if(num%2==0 && num!=0) {
//			System.out.println("¦���Դϴ�");
//		}else if(num==0) {
//			System.out.println("0�Դϴ�");
//		}else {
//			System.out.println("Ȧ���Դϴ�");
//		}
		
		// 3��
		// if�� switch ����
//		Scanner s = new Scanner(System.in);
//		System.out.print("������ �Է��ϼ��� : ");
//		
//		int score = s.nextInt();
//		char grade = ' ';
//		String msg = "";
//		
//		if(score>=90) {
//			grade='A';
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
//				msg="���� �б⿡ �ٽ� �����ϼ���.";
//				break;
//		}
//		
//		System.out.println("���� : " +grade);
//		System.out.println("�޼��� : "+msg);
		
		// 4��
		// 4-1 String
//		Scanner s = new Scanner(System.in);
//		System.out.println("������ �Է��ϼ���(ex : 3 * 7)>");
//		
//		int first = s.nextInt();
//		String oper = s.next();
//		int second = s.nextInt();
//		
//		if(oper.equals("+")) {
//			System.out.println(first + second);
//		}else if(oper.equals("-")) {
//			System.out.println(first - second);
//		}else if(oper.equals("*")) {
//			System.out.println(first * second);
//		}else if(oper.equals("/")) {
//			System.out.println(first / second);
//		}else {
//			System.out.println("�ٽ� �Է��ϼ���.");
//		}
		
		// 4-2 char�� charAt
		Scanner s = new Scanner(System.in);
		System.out.println("������ �Է��ϼ���(ex : 3 * 7)>");
		
		int first = s.nextInt();
		char oper = s.next().charAt(0);
		int second = s.nextInt();
		
		if(oper=='+') {
			System.out.println(first + second);
		}else if(oper=='-') {
			System.out.println(first - second);
		}else if(oper=='*') {
			System.out.println(first * second);
		}else if(oper=='/') {
			System.out.println(first / second);
		}else {
			System.out.println("�ٽ� �Է��ϼ���.");
		}

	}

}
