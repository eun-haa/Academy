package ch04;

import java.util.Scanner;

public class For_exam {

	public static void main(String[] args) {
		// 1��
		
		// 1-1
//		int x=15;
//		if(x>10 && x<20) {System.out.println("ture");}
//		// 1-2
//		char ch='a';
//		if(ch!=' ' && ch != '\t') {System.out.println("true");}
//		// 1-3
//		char ch='x';
//		if(ch=='x'||ch=='X') {System.out.println("true");}
//		// 1-4
//		char ch='5';
//		if(ch>='0' && ch<='9') {System.out.println("true");}
//		// 1-5
//		char ch='a';
//		if(ch>=65 && ch<=122) {System.out.println("true");}
//		// 1-6
//		int year = 440;
//		if(year%400==0 || year%4==0 && year%100!=0) {
//			System.out.println("true");
//		}
//		// 1-7
//		boolean powerOn=false;
//		if(powerOn==false) {
//			System.out.println("true");
//		}
//		// 1-8
//		String str="yes";
//		if(str.equals("yes")) {
//			System.out.println("true");
//		}
		
		
		// 2��
//		int sum = 0;
//		
//		for(int i=1; i<21; i++) {
//			if(i%3!=0 && i%2!=0) {
//				sum+=i;
//			}
//		}
//		System.out.println(sum);
		
		
		// 3��
		// ����
//		for(int i=0; i<=10; i++) {
//			for(int j=0; j<=i; j++) 
//				System.out.print("*");
//			System.out.println();
//		}
//		
//		// ��
//		int i=0;
//		
//		while(i<=10) {
//			int j=0;
//			while(j<=i) {
//				System.out.print("*");
//				j++;
//			}
//			System.out.println();
//			i++;
//		}
		
		
		
		// 4��
//		for(int i=1; i<=6; i++) {
//			for(int j=1; j<=6; j++) {
//				if(i+j==6) {
//					System.out.println(i+" + "+j);
//				}
//			}
//		}
		
		
		// 5��
		// if �� �ʿ� ����!
		//int value = (int) (Math.random() * 10) +1;
		//�� ���� 10����! 6���� �������� 10 ��ſ� 6�� ������ ��
		
		// ��
//		int value = (int) (Math.random() * 6) +1;
//		System.out.println(value);
		
		
		
		
		// 6��
//		for(int x=0; x<=10; x++) {
//			for(int y=0; y<=10; y++) {
//				if((2*x)+(4*y)==10)
//				System.out.println("x=" + x + "," + "y=" + y);
//			}
//		}
		
		
		
		// 7��
		// switch ���
//		Scanner s = new Scanner(System.in);
//
//		int i = 0;
//		boolean b = true;
//		
//		while(b) {
//		System.out.println("-------------------------------");
//		System.out.println("1. ���� | 2. ��� | 3. ��ȸ | 4. ����");
//		System.out.println("-------------------------------");
//		System.out.println("����>");
//		
//		int input=s.nextInt(); 
//		
//		switch(input) {
//			case 1:
//				System.out.println("���ݾ�>");
//				i += s.nextInt();
//				break;
//			case 2:
//				System.out.println("��ݾ�>");
//				i -= s.nextInt();
//				break;
//			case 3:
//				System.out.println("�ܰ� : " + i);
//				break;
//			case 4:
//				System.out.println("���α׷� ����");
//				b=false;
//				break;
//			default:
//				System.out.println("�ٽ� �����ϼ���");
//		}
//		
//		}
		
		
		
		// if ���
		Scanner s = new Scanner(System.in);

		int i = 0;
		boolean b = true;
		
		while(b) {
		System.out.println("-------------------------------");
		System.out.println("1. ���� | 2. ��� | 3. ��ȸ | 4. ����");
		System.out.println("-------------------------------");
		System.out.println("����>");
		
		int input=s.nextInt(); 
		
		if(input==1) {
			System.out.println("���ݾ�>");
			i+=s.nextInt();
		}else if(input==2) {
			System.out.println("��ݾ�>");
			i-=s.nextInt();
		}else if(input==3) {
			System.out.println("�ܰ� : " + i);
		}else if(input==4){
			System.out.println("���α׷� ����");
			b=false;
		}else {
			System.out.println("�ٽ� �����ϼ���.");
		}
		
		
		}


		
		
	}

}
