package ch06;
import java.util.Scanner;
public class StuScoreTest {
	public static void main(String[] args) {
		StuScore[] ss = new StuScore[5];
		Scanner scan = new Scanner(System.in) ;
		for(int i=0;i<ss.length;i++) {
			ss[i] = new StuScore();
			System.out.println((i+1)+"번 학생의 이름을 입력하세요.");
			ss[i].name=scan.next();
			System.out.println((i+1)+"번 학생의 국어 점수를 입력하세요.");
			ss[i].kor=scan.nextInt();
			System.out.println((i+1)+"번 학생의 영어 점수를 입력하세요.");
			ss[i].eng=scan.nextInt();
			System.out.println((i+1)+"번 학생의 수학 점수를 입력하세요.");
			ss[i].math=scan.nextInt();

		}
		System.out.println("이름	국어	영어	수학	총점	평균");
		System.out.println("============================================");
		int korTotal=0;
		int engTotal=0;
		int mathTotal=0;
		int max=ss[0].kor;
		int min=ss[0].kor;
		for(int i=0;i<ss.length;i++) {
			System.out.printf("%s\t%d\t%d\t%d\t%d\t%.1f\n",ss[i].name,ss[i].kor,ss[i].eng,ss[i].math,ss[i].sum(),ss[i].avg());
			korTotal+=ss[i].kor;
			engTotal+=ss[i].eng;
			mathTotal+=ss[i].math;
			
			if(max<ss[i].kor) {
				max=ss[i].kor;
			}
			if(max<ss[i].eng) {
				max=ss[i].eng;
			}
			if(max<ss[i].math) {
				max=ss[i].math;
			}
			if(min>ss[i].kor) {
				min=ss[i].kor;
			}
			if(min>ss[i].eng) {
				min=ss[i].eng;
			}
			if(min>ss[i].math) {
				min=ss[i].math;
			}
		}
		System.out.println("============================================");
		System.out.printf("총점 : \t%d\t%d\t%d\t%d\t%.1f\n",korTotal,engTotal,mathTotal,korTotal+engTotal+mathTotal,(korTotal+engTotal+mathTotal)/3f);
		System.out.printf("최대값 : %d, 최소값 : %d",max,min);
	}
}