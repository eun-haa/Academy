package ch_04;

import java.util.Scanner;

public class If_exam {

	public static void main(String[] args) {
		// 사용자가 키보드로 입력할 수 있게 하는 Class(Scanner)
		// 클릭해서 import 해주기
		// 다른 패키지에 있는 걸 여기서도 사용할 수 있게 하기 위함
		// Scanner은 참조형 변수
		
		// int  a = 10;
		// s는 내가 주고싶은 이름 줘도 됨(기본 타입의 변수명처럼)
//		Scanner s = new Scanner(System.in);
		
		// 지금은 int(정수)를 입력받아야 하니까 s.nextInt\
		// 앞에 s는 위에서 지정한 이름, 요 이름 통해서 불러옴
		
		//--------------------------------------------
		
		// 1번 내가 푼 거
//		int num = 12;
//		if(num%3==0 && num%4==0) {
//			System.out.println("true");
//		}else {
//			System.out.println("false");
//		}
		
		// 1. 변수 num을 입력받아, num이 3의 배수이면서 4의 배수가 아니면 true를,
		// 그렇지 않으면 false를 출력하는 프로그램을 작성해보자.
		
		// 1번 풀이
//		System.out.print("숫자를 입력하세요."); // ln 넣으면 커서 줄바꿈!
//		int num=s.nextInt();
//		if(num%3==0 && num%4!=0) {
//			System.out.println("true");
//		} else {
//			System.out.println("false");
//		}
		

		//--------------------------------------------		
		
		// 2번 내가 푼 거
//		int num2 = 0;
//		if(num2==0) {
//			System.out.println("0입니다");
//		}else if(num2%2==0) {
//			System.out.println("짝수입니다");
//		}else {
//			System.out.println("홀수입니다");
//		}
		
		// 2. 아래와 같은 결과가 나오도록 코딩해보자. 단, 0은 0으로 출력함
		// (이때 3은 키보드로 입력받아서 처리함)
		// ------------------------------
		// 숫자를 입력하세요. >3
		// 홀수입니다.
		
		// 2번 풀이
		
//		Scanner s = new Scanner(System.in);
//		System.out.print("숫자를 입력하세요");
//		int num2=s.nextInt();
//		
//		// ①
//		if(num2==0) {
//			System.out.println("0입니다");
//		}else if(num2%2==0) {
//			System.out.println("짝수입니다");
//		}else {
//			System.out.println("홀수입니다");
//		}
//		
//		
//		// ②
//		if(num2%2==0 && num!=0) {
//			System.out.println("짝수");
//		}else if(num==0) {
//			System.out.println("0");
//		}else {
//			System.out.println("홀수");
//		}
		
		
		//--------------------------------------------		
		
		
		// 3번 내가 푼 거
//		Scanner s = new Scanner(System.in);
//		System.out.print("점수를 입력하세요");
//		int score = s.nextInt();
//		char grade =' ';
//		String str1 = "참 잘했습니다.";
//		String str2 = "좀 더 노력하세요.";
//		String str3 = "다음 학기에 다시 수강하세요.";
//		
//		if(score>=90) {
//			grade ='A';
//			System.out.println("학점 : " + grade + "\n" + "메세지 : " + str1);
//		}else if(score>=80) {
//			grade='B';
//			System.out.println("학점 : " + grade + "\n" + "메세지 : " + str1);
//		}else if(score>=70) {
//			grade='C';
//			System.out.println("학점 : " + grade + "\n" + "메세지 : " + str2);
//		}else if(score>=60) {
//			grade='D';
//			System.out.println("학점 : " + grade + "\n" + "메세지 : " + str2);
//		}else {
//			grade='F';
//			System.out.println("학점 : " + grade + "\n" + "메세지 : " + str3);
//		}
		
		// 3번 풀이
		
//		Scanner s = new Scanner(System.in);
//		System.out.print("점수를 입력하세요");
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
//				msg="참 잘했습니다.";
//				break;
//			case 'C':
//			case 'D':
//				msg="좀 더 노력하세요.";
//				break;
//			default:
//				msg="다음학기에 다시 수강하세요.";
//				break;
//		}
//		
//		System.out.println("학점 : "+grade);
//		System.out.println("메세지 : "+msg);
		
		
		//---------------------------------------------
		
		// 4번
		// 정수 2개와 사칙연산(+ - * /)가 각각 공백을 사이에 두고 주어지는 경우,
		// 해당 연산의 결과를 출력하는 프로그램을 작성해보자
		
		// 결과
		//--------------------------------
		// 계산식을 입력하세요.(ex:3 * 7)> 3 * 7
		// 계산결과는 21.0 입니다.
		
		Scanner s =new Scanner(System.in);
		System.out.println("계산식을 입력하세요.(ex:3 * 7)>");
		
		// 첫번째 정수값을 저장하는 변수
		int first=s.nextInt();
		
		// 사칙연산기호를 저장하는 변수
		// 1. String으로 하기
		//String oper=s.nextLine();
		//String oper=s.next();
		
		// 2. char으로 하기
		char oper=s.next().charAt(0);
		
		// 두번째 정수값을 저장하는 함수
		int second=s.nextInt();
		
		
		if(oper==('+')) {// 사칙연산기호(oper)가 '+'이면,
			// 첫번째 정수값(first)+두번째 정수값(second)
			System.out.println(first+second);
		}else if(oper==('-')) {// 사칙연산기호(oper)가 '-'이면,
			// 첫번째 정수값(first)-두번째 정수값(second)
			System.out.println(first-second);
		}else if(oper==('*')) {// 사칙연산기호(oper)가 '*'이면,
			// 첫번째 정수값(first)*두번째 정수값(second)
			System.out.println(first*second);
		}else if(oper==('/')) {// 사칙연산기호(oper)가 '/'이면,
			// 첫번째 정수값(first)/두번째 정수값(second)
			System.out.println(first/second);
		}else {
			// +, -, *, / 중 하나를 입력하세요.
			System.out.println("+, -, *, / 중 하나를 입력하세요.");
		}
		
		
		
		
		
		
		
		
		
		
		
		
		

		
		
		
		
		
		
	}

}
