package ch_04;
// 조건문 if와 switch문 비교
public class IfvsSwitch {

	public static void main(String[] args) {
		// ﻿if문의 조건식에 >=,<=,>,<의 기호가 있으면 switch문으로 변경 불가
		// 점수가 60점 이상이면 합격
		// 그렇지 않으면 불합격
		
		int score = 70;
		
		if(score>=60) {// 점수가 60점 이상이면 합격
			System.out.println("합격");
		}else {// 그렇지 않으면 불합격
			System.out.println("불합격");
		}
		
		
		// ﻿if문의 조건식에 ==의 기호가 있으면 switch문으로 변경 불가
		// 숫자가 1이면 SK
		// 숫자가 6이면 KT
		// 숫자가 9이면 LG
		// 그외 UN
		int num=1;
		 
		if(num==1) {
			 System.out.println("SK");
		}else if(num==6) {
			 System.out.println("KT");
		}else if(num==9) {
			 System.out.println("LG");
		}else {
			 System.out.println("UNKOWN");
		}
		
		// 위 if문을 switch문으로 변경
		switch(num) {
			case 1: // 숫자가 1이면 SK
				System.out.println("SK");
				break;
			case 6: // 숫자가 6이면 KT
				System.out.println("KT");
				break;
			case 9: // 숫자가 9이면 LG
				System.out.println("LG");
				break;
			default: // 그렇지 않으면 UNKOWN
				System.out.println("UNKOWN");
				break;
		}

	}

}
