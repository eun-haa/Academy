package ch06;

public class Student {
	String name;
	int kor;
	int eng;
	int math;
	int sum=0;
	float avg = 0f;
	
	// ����
	int sum() {
		sum=kor+eng+math;
		return sum;
	}
	
	// ���
	float avg() {
		avg=(kor+eng+math)/3f;
		return avg;
	}
	
}
