package javaExample;

import java.util.Scanner;

public class CalculatorTest {

	public static void main(String[] args) {
		// �ν��Ͻ� �޼���ϱ� new ��ü ���� �ʼ�
		Calculator c = new Calculator();
		
		Scanner s = new Scanner(System.in);
		System.out.println("�����ϰ��� �ϴ� �� �������� �����ڸ� �Է��ϼ���");
		int num1 = s.nextInt();
		String x = s.next();
		int num2 = s.nextInt();
		
		
		if(x.equals("+")) {
			System.out.println("�������� " + c.getAdd(num1, num2)+"�Դϴ�.");
		}else if(x.equals("-")) {
			System.out.println("�������� " + c.getSub(num1, num2)+"�Դϴ�.");
		}else if(x.equals("*")) {
			System.out.println("�������� " + c.getMul(num1, num2)+"�Դϴ�.");
		}else if(x.equals("/")) {
			System.out.println("�������� " + c.getDiv(num1, num2)+"�Դϴ�.");
		}else {
			System.out.println("�ٽ� �Է��ϼ���.");
		}
		
//		System.out.println("�������� " + c.getAdd(num1, num2)+"�Դϴ�.");
//		System.out.println("�������� " + c.getSub(num1, num2)+"�Դϴ�.");
//		System.out.println("�������� " + c.getMul(num1, num2)+"�Դϴ�.");
//		System.out.println("�������� " + c.getDiv(num1, num2)+"�Դϴ�.");
	}

}
