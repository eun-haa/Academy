package ch08.exam;

import java.util.InputMismatchException;
import java.util.Scanner;

public class exam7 {

	public static void main(String[] args) {
		int cNum=20;
		//int cNum=(int)(Math.random() * 100)*1;
		int count=0;
		
		while(true) { // 반복 시작
			int user=0;
			
			try {
			//System.out.println(cNum);
			Scanner sc = new Scanner(System.in);
			System.out.print("1과 100사이의 값을 입력하세요 : ");
			user = sc.nextInt();
			count++;
			}catch(InputMismatchException e){
				System.out.println("숫자만 입력할 수 있습니다. 다시 입력해주세요~");
				continue;
			}

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

