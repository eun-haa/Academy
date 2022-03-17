package ch08.exam;

import java.util.InputMismatchException;
import java.util.Scanner;

public class exam6 {
	public static void main(String[] args) {
		int cNum=20;
		//int cNum=(int)(Math.random() * 100)*1;
		int count=0;
		
		while(true) { // 반복 시작
			int user=0;
			System.out.print("1과 100사이의 값을 입력하세요 : ");
			Scanner sc = new Scanner(System.in);
			user = sc.nextInt();
			count++;

			if(cNum>user) {
				System.out.println("더 큰 수를 입력하세요.");
			}else if(cNum<user) {
				System.out.println("더 작은 수를 입력하세요.");
			}else {
				System.out.println("정답!!");
				System.out.println(count + "번만에 맞추셨습니다.");
				break;
			}
		} // 반복 끝

	}// main end.
	

	
}
