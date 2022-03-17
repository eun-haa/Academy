package ch_04;

import java.util.Scanner;

public class test_01 {

	public static void main(String[] args) {
		// 1번
//		Scanner s= new Scanner(System.in);
//		System.out.print("숫자를 입력하세요 : ");
//		int num = s.nextInt();
//		
//		if(num%3==0 && num%4!=0) {
//			System.out.println("true");
//		}else {
//			System.out.println("false");
//		}
		
		// 2번
//		Scanner s = new Scanner(System.in);
//		System.out.print("숫자를 입력하세요 : ");
//		
//		int num = s.nextInt();
//		
//		if(num%2==0 && num!=0) {
//			System.out.println("짝수입니다");
//		}else if(num==0) {
//			System.out.println("0입니다");
//		}else {
//			System.out.println("홀수입니다");
//		}
		
		// 3번
		// if와 switch 쓰기
//		Scanner s = new Scanner(System.in);
//		System.out.print("점수를 입력하세요 : ");
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
//				msg="참 잘했습니다.";
//				break;
//			case 'C':
//			case 'D':
//				msg="좀 더 노력하세요.";
//				break;
//			default:
//				msg="다음 학기에 다시 수강하세요.";
//				break;
//		}
//		
//		System.out.println("학점 : " +grade);
//		System.out.println("메세지 : "+msg);
		
		// 4번
		// 4-1 String
//		Scanner s = new Scanner(System.in);
//		System.out.println("계산식을 입력하세요(ex : 3 * 7)>");
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
//			System.out.println("다시 입력하세요.");
//		}
		
		// 4-2 char과 charAt
		Scanner s = new Scanner(System.in);
		System.out.println("계산식을 입력하세요(ex : 3 * 7)>");
		
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
			System.out.println("다시 입력하세요.");
		}

	}

}
