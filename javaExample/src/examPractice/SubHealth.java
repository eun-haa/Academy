package examPractice;

public class SubHealth extends Health {
	// ǥ��ü���� �����ϴ� ����
	double s_weight;
	// �񸸵��� �����ϴ� ����
	double fat;
	// ������� �����ϴ� ����
	String result;
	
	//-----------------------------------
	
	// ������
	// �������� �϶�� �ؼ� ������, �ۼ� ���ص� ������ ��
	// �������, s_weight�� 0.0�� �ƴ� �ٸ� ������ �־�� �ϸ� ������ �ۼ��ϴ°� ����
	SubHealth(){
		s_weight=0.0;
		fat=0.0;
		result=null;
	}
	
	//-----------------------------------
	
	// �񸸵��� ����ϴ� Calculate �޼��� ����
	// ǥ��ü���� ���� ���ؼ� �񸸵��� ����ϱ�
	void calculate() {
		// ǥ��ü��
		// ���� ǥ��ü�� = (����-100)*0.9
		// ���� ǥ��ü�� = (����-100)*0.85
		if(gender=='M' || gender=='m') {
			s_weight=(tall-100)*0.9;
		}else {
			s_weight=(tall-100)*0.85;
		}
		
		// �񸸵� = ���� ü��/ǥ��ü��*100
		fat = weight/s_weight*100;
		
		if(fat >= 150) {      // �񸸵��� 150 �̻��̸� ����
			result="����";
		}else if(fat >= 131) {// �񸸵��� 131 �̻��̸� �ߵ���
			result="�ߵ���";
		}else if(fat >= 121) {// �񸸵��� 121 �̻��̸� �浵��
			result="�浵��";
		}else if(fat >= 111) {// �񸸵��� 111 �̻��̸� ��ü��
			result="��ü��";
		}else if(fat >= 91) {// �񸸵��� 91 �̻��̸� ����(ǥ��ü��)
			result="����(ǥ��ü��)";
		}else {              // �׷��� ������ ��ü��
			result="��ü��";
		}
	}// calculate() ��
	
	// ����ϴ� output2() �޼��� ����
	// �Ҽ����� mathRound() ����ϰų�, c��� ���!
	void output2() {
		//System.out.println("����� �񸸵��� " + fat + "�̰�, " + result + "�Դϴ�.");
		// c��� ��¹� ���,  %.2f => �Ҽ��� �Ʒ� ��¶�ڸ������� ǥ��
		System.out.printf("����� �񸸵��� %.2f �̰�, %s �Դϴ�.", fat, result);
	}
	
}

