package ch06;

import java.util.Scanner;

public class StudentTest {

	public static void main(String[] args) {
		Student[] s = new Student[5];
		Scanner scan = new Scanner(System.in);
		
		
		for(int i=0; i<s.length; i++) {
			s[i] = new Student();
			
			System.out.println((i + 1) + "�� �л��� �̸��� �Է��ϼ���.");
			s[i].name = scan.next();
			
			System.out.println((i + 1) + "�� �л��� ���� ������ �Է��ϼ���.");
			s[i].kor = scan.nextInt();
			
			System.out.println((i + 1) + "�� �л��� ���� ������ �Է��ϼ���.");
			s[i].eng = scan.nextInt();
			
			System.out.println((i + 1) + "�� �л��� ���� ������ �Է��ϼ���.");
			s[i].math = scan.nextInt();
		}
		
		System.out.println("�̸�\t����\t����\t����\t����\t���");
		System.out.println("============================================");
		
		int korTotal=0;
		int engTotal=0;
		int mathTotal=0;
		int max=s[0].kor;
		int min=s[0].kor;
		
		for(int i=0; i<s.length; i++) {
			System.out.printf("%s\t%d\t%d\t%d\t%d\t%.1f\n",s[i].name,s[i].kor,s[i].eng,s[i].math,s[i].sum(),s[i].avg());
			
			korTotal+=s[i].kor;
			engTotal+=s[i].eng;
			mathTotal+=s[i].math;
			
			if(max<s[i].kor) {
				max=s[i].kor;
			}
			if(max<s[i].eng) {
				max=s[i].eng;
			}
			if(max<s[i].math) {
				max=s[i].math;
			}
			if(min>s[i].kor) {
				min=s[i].kor;
			}
			if(min>s[i].eng) {
				min=s[i].eng;
			}
			if(min>s[i].math) {
				min=s[i].math;
			}
		}
		System.out.println("============================================");
		System.out.printf("���� : \t%d\t%d\t%d\t%d\t%.1f\n",korTotal,engTotal,mathTotal,korTotal+engTotal+mathTotal,(korTotal+engTotal+mathTotal)/3f);
		System.out.printf("�ִ밪 : %d, �ּҰ� : %d",max,min);
		

	}

}
