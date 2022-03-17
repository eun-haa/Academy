package javaExample;

import java.util.Scanner;

// 생성자 - 3번 문제
public class ScoreTest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//객체 생성
		Score s = new Score();
		
		//묻기
		System.out.println("수학 점수 입력 : ");
		s.math = sc.nextInt();
		System.out.println("과학 점수 입력 :");
		s.science = sc.nextInt();
		System.out.println("영어 점수 입력 : ");
		s.eng = sc.nextInt();
		
		//출력
		s.sum();
		
	

	}


}
