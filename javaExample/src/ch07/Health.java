package ch07;
// Health��� Ŭ������ ����
import java.util.Scanner;

public class Health {
	Scanner s = new Scanner(System.in);
	
	// �ʵ��(����)
	char gender;  // ����
	double tall;  // ����
	double weight;// ü��
	
	//---------------------------------------------
	
	// ������(�ʱ�ȭ)
	Health(){    // �ʱ�ȭ�� �ϱ�����(�� ������ �⺻������ ��)
		gender=' ';
		tall=0.0;
		weight=0.0;
	}
	
	//---------------------------------------------
	
	// �޼���
	// input - ����, ����, ü�� �Է¹ޱ�(scanner �ʿ�!)
	void input(){//����Ÿ���� �𸣰����� �ϴ� void�� �ֱ�  // void�� �ν��Ͻ� !
		// ����
		System.out.println("����(M/F) : ");
		gender=s.next().charAt(0); // �ν��Ͻ� �޼ҵ�� �޼ҵ� �ȿ� �ۼ�����
		                           // .next()�� �������� ����� ����?
		                           // 1. char�� String���� �ٲ��ֱ�
		                           // 2. char�� ����ҰŸ�, .next()�� char Ÿ������ �ٲ��ֱ�
		                           // �� charAt() �ٿ��ֱ�, 0��°�� �ٲ��شٴ� �ǹ�
		// ����
		System.out.println("����(Cm) : ");
		tall=s.nextDouble();
		
		// ü��
		System.out.println("ü��(Kg) : ");
		weight=s.nextDouble();
	}
	
	// output - ���
	void output1(){
		char gender_kor=' ';
		// ����(gender)�� "M"�̸� 
		// "��"���� ���, �׷��� ������ "��" ���
		if(gender=='M' || gender=='m') {
			gender_kor='��';
		}else {
			gender_kor='��';
		}
		System.out.println("���� - " + gender_kor);
		System.out.println("���� - " + tall + "Cm");
		System.out.println("ü�� - " + weight + "Kg");
	}
	
}
