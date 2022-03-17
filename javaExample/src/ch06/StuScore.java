package ch06;

public class StuScore {
	String name;
	int kor;
	int eng;
	int math;
	int sum=0;
	float avg=0f;
	
	// รัมก
	int sum() {
		sum=kor+eng+math;
		return sum;
	}
	// รัมก
	float avg() {
		avg=(kor+eng+math)/3f;
		return avg;
	}
}
