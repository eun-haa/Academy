package examPractice;

import java.util.Scanner;

public class Health {
	// input�� �Է¹ޱ� ����
	Scanner s = new Scanner(System.in);
	
	// ������ �����ϱ� ���� ����
	char gender;
	// ������ �����ϱ� ���� ����
	double tall;
	// ü���� �����ϱ� ���� ����
	double weight;
	
	//-----------------------------------
	
	// ������(�ʱ�ȭ)
	Health(){
		
	}
	
	//-----------------------------------
	
	// ����,����,ü���� �Է¹ޱ�(input)
	void input() {
		System.out.println("����(M/F) : ");
		gender = s.next().charAt(0); //char Ÿ���� ���⿡ String Ÿ�� ������ ��
		                             // .charAt(0) �ٿ��ֱ�
		System.out.println("����(Cm) : ");
		tall = s.nextDouble();
		
		System.out.println("ü��(Kg) : ");
		weight = s.nextDouble();
	}
	// ���(output)
	void output1() {
		System.out.println("���� - " + gender);
		System.out.println("���� - " + tall + "Cm");
		System.out.println("ü�� - " + weight + "Kg");
	}
}
