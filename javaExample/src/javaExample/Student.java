package javaExample;

public class Student {
	String name; //�л��̸�
	int ban; //��
	int no; //��ȣ
	int kor; //��������
	int eng; //��������
	int math; //��������
	
	int getTotal() {
		return kor+eng+math;
	}
	
	float getAverage() {
		return getTotal()/3f;

	}
}
