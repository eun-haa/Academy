package javaExample;
// 생성자 - 3번 문제
public class Score {
	//객체클래스
	
	//변수 설정
	int math;
	int science;
	int eng;
	int sum;
	double avg;
	
	public void sum() {
		sum = math + science + eng ;
		avg();//평균호출
	}
	public void avg() {
		avg = (sum/3);
		//avg = (int)(sum/3.0*10)/10.0;
		prn();//결과 호출
	}
	
	//출력
	public void prn() {
		System.out.println("평균 : " + avg);
	}
	
}
