package ch_04;

import java.util.Scanner;

public class For_exam_practice {

	public static void main(String[] args) {
		// 1��
		
//		// 1-1
//		int x=15;
//		if(x>10 && x<20) {
//			System.out.println("true");
//		}
//		
//		// 1-2
//		char ch1 = 'a';
//		if(ch1 != ' ' && ch1 != '\t') {
//			System.out.println("true");
//		}
//		
//		// 1-3
//		char ch2 = 'x';
//		if(ch2=='x' || ch2=='X') {
//			System.out.println("true");
//		}
//		
//		// 1-4
//		char ch3 = '5';
//		if(ch3>='0' && ch3<='9') {
//			System.out.println("true");
//		}
//		
//		// 1-5
//		char ch4 = 'a';
//		if(ch4>=65 && ch4<=122) {
//			System.out.println("true");
//		}
//		
//		// 1-6
//		int year = 440;
//		if(year%400==0 || year%4==0 && year%100!=0) {
//			System.out.println("true");
//		}
//		
//		// 1-7
//		boolean powerOn = false;
//		System.out.println(!powerOn);
//		
//		// 1-8
//		String str = "yes";
//		System.out.println(str.equals("yes"));
		
		
		
		//--------------------------------------------------
		
		// 2��

		// 1���� 20������ ���� �߿��� 2�Ǵ� 3�� ����� �ƴ� ���� ������ ���Ͻÿ�
		
//		int sum = 0;
//		for(int i=1; i<=20; i++) {
//			if(i%2!=0 && i%3!=0) {
//				sum += i;	
//			}
//		}
//		System.out.println(sum);
		
		
		//----------------------------------------------------
		
		// 3�� �ڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡ�
		
//		for(int i=0; i<=10; i++) {
//			for(int j=0; j<=i; j++)
//				System.out.print("*");
//			System.out.println();
//		}
//		
//		// ��
//		
//		int i=0;
//		
//		while(i<=10) {
//			int j=0;
//			while(j<=i) {
//				j++;
//				System.out.print("*");
//			}
//			i++;
//			System.out.println();
//		}
		
		
		//----------------------------------------------------
		
		// 4��
		
//		for(int i=1; i<=6; i++) {
//			for(int j=1; j<=6; j++) {
//				if(i+j==6) {
//					System.out.println(i+ " + " +j);
//				}
//			}
//		}
		
		//----------------------------------------------------
		
		// 5��
//		int value = (int)(Math.random()*6)+1;
//		System.out.println(value);
		
		//----------------------------------------------------
		
		// 6��
//		for(int x=0; x<=10; x++) {
//			for(int y=0; y<=10; y++) {
//				if((2*x) + (4*y) == 10) {
//					System.out.println("x=" + x + ", " + "y=" + y);
//				}
//			}
//		}
		
		//-----------------------------------------------------
		
		// 7��
		
		// if��
		Scanner s = new Scanner(System.in);
		
		int i = 0;
		boolean b = true;
		
		while(b) {
			System.out.println("--------------------------");
			System.out.println("1.���� | 2.��� | 3.��ȸ | 4.����");
			System.out.println("--------------------------");
			System.out.println("����>");
			
		int input = s.nextInt();
		
		if(input==1) {
			System.out.println("���ݾ�>");
			i += s.nextInt();
		}else if(input==2) {
			System.out.println("��ݾ�>");
			i -= s.nextInt();
		}else if(input==3) {
			System.out.println("�ܰ� : " + i);
		}else if(input==4) {
			System.out.println("���α׷� ����");
			b=false;
		}else {
			System.out.println("�ٽ� �Է��ϼ���");
		}
		
		}
		
		
		
		// switch��
//		Scanner s = new Scanner(System.in);
//		
//		int i = 0;
//		boolean bool = true;
//		
//		while(bool) {
//			System.out.println("--------------------------");
//			System.out.println("1.���� | 2.��� | 3.��ȸ | 4.����");
//			System.out.println("--------------------------");
//			System.out.println("����>");
//			
//		int input = s.nextInt();
//		
//		switch(input) {
//			case 1:
//				System.out.println("���ݾ�>");
//				i += s.nextInt();
//				break;
//			
//			case 2:
//				System.out.println("��ݾ�>");
//				i -= s.nextInt();
//				break;
//			
//			case 3:
//				System.out.println("�ܰ� : "+i);
//				break;
//			
//			case 4:
//				System.out.println("���α׷� ����");
//				bool=false;
//				break;
//			
//			default:
//			System.out.println("�ٽ� �Է��ϼ���");
//		}
//		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
