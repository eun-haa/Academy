package ch07;

public class SubHealth extends Health{
	// �ʵ��(����)
	double s_weight;  // ǥ��ü��
	double fat;       // �񸸵�
	String result;    // �����
	
	//---------------------------------------------
	
	// ������(�ʱ�ȭ)
	SubHealth(){
		s_weight=0.0;
		fat=0.0;
		result=null;
	}
	
	//---------------------------------------------
	
	// �޼���
	void calculate() { // ǥ��ü�߰���
		// ������ ������ ������ �ٸ��⿡ if������ �и����־����
		// ������ "M"�̸� 
		// ǥ��ü�� = (���� - 100) * 0.9
		// ������ "F"�̸�
		// ǥ��ü�� = (���� - 100) * 0.85
		if(gender=='M'||gender=='m') {// �� Ŭ�������� ������ ������, ��� �޾ұ⿡ ����!
			s_weight = (tall-100)*0.9;
		}else {
			s_weight = (tall-100)*0.85;
		}
		
		// �񸸵� ���
		fat = (weight/s_weight)*100;
		
		if(fat >= 150) {
			result="����";
		}else if(fat >= 131) {
			result="�ߵ���";
		}else if(fat >= 121) {
			result="�浵��";
		}else if(fat >= 111) {
			result="��ü��";
		}else if(fat >= 91) {
			result="����(ǥ��ü��)";
		}else {
			result="��ü��";
		}
	}
	void output2() { // ���
		// �Ҽ��� �����ֱ� ���� c���� ���, %.2f -> �Ҽ��� ��¶�ڸ����� ����
		System.out.printf("����� �񸸵� %.2f�̰�, %s�Դϴ�.", fat,result);
	}
	
	// ���� ��
}
