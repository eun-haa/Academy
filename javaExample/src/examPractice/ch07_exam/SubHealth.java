package examPractice.ch07_exam;
// �ڽ�Ŭ����
public class SubHealth extends Health{
	// ǥ��ü���� ���� ����
	double s_weight;
	// �񸸵��� ���� ����
	double fat;
	// ������� ���� ����
	String result;
	
	//------------------------------------
	// �ʱ�ȭ�� ���� ������
	SubHealth(){
		s_weight=0.0;
		fat=0.0;
		result=null;
	}
	//------------------------------------
	// calculate() - �񸸵��� ����ϴ� �޼ҵ�
	void calculate() {
		if(gender=='m' || gender=='M') {
			s_weight=(tall-100)*0.9;
		}else {
			s_weight=(tall-100)*0.85;
		}
		
		fat=weight/s_weight*100;
		
		if(fat >= 151) {
			result="����";
		}else if(fat >=131) {
			result="�ߵ���";
		}else if(fat >=121) {
			result="�浵��";
		}else if(fat >= 111) {
			result="��ü��";
		}else if(fat >= 91) {
			result="����(ǥ��ü��)";
		}else {
			result="��ü��";
		}
	}
	// output2() - ����ϴ� �޼ҵ�
	void output2() {

		System.out.printf("����� �񸸵� %.2f�̰�, %s�Դϴ�.", fat,result);
	}
}
