package javaExample;
// ������ - 3�� ����
public class Score {
	//��üŬ����
	
	//���� ����
	int math;
	int science;
	int eng;
	int sum;
	double avg;
	
	public void sum() {
		sum = math + science + eng ;
		avg();//���ȣ��
	}
	public void avg() {
		avg = (sum/3);
		//avg = (int)(sum/3.0*10)/10.0;
		prn();//��� ȣ��
	}
	
	//���
	public void prn() {
		System.out.println("��� : " + avg);
	}
	
}
