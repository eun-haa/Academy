package examPractice.ch07_exam;

import java.util.Scanner;

// �θ�Ŭ����
public class Health {
	// ������ ���� ����
	char gender;
	// ������ ���� ����
	double tall;
	// ü���� ���� ����
	double weight;
	
	//------------------------------------
	// ������ �ʱ�ȭ
	Health(){
		gender=' ';
		tall=0.0;
		weight=0.0;
	}
	
	//------------------------------------
	
	Scanner s = new Scanner(System.in);
	
	// input() - ����, ����, ������ �Է¹޴� �޼ҵ�
	void input() {
		System.out.print("����(M/F) : ");
		gender=s.next().charAt(0);
		
		System.out.print("����(Cm) : ");
		tall=s.nextDouble();
		
		System.out.print("ü��(Kg) : ");
		weight=s.nextDouble();		
	}
	
	// output1() - ����ϴ� �޼ҵ�
	void output1() {
		System.out.println("���� - " + gender);
		System.out.println("���� - " + tall + "Cm");
		System.out.println("ü�� - " + weight + "Kg");
	}
}
