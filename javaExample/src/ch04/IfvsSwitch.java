package ch04;
// 조건�? if?? switch�? 비교
public class IfvsSwitch {

	public static void main(String[] args) {
		// ﻿if문의 조건?��?�� >=,<=,>,<?�� 기호�? ?��?���? switch문으�? �?�? 불�?
		// ?��?���? 60?�� ?��?��?���? ?���?
		// 그렇�? ?��?���? 불합�?
		
		int score = 70;
		
		if(score>=60) {// ?��?���? 60?�� ?��?��?���? ?���?
			System.out.println("?���?");
		}else {// 그렇�? ?��?���? 불합�?
			System.out.println("불합�?");
		}
		
		
		// ﻿if문의 조건?��?�� ==?�� 기호�? ?��?���? switch문으�? �?�? 불�?
		// ?��?���? 1?���? SK
		// ?��?���? 6?���? KT
		// ?��?���? 9?���? LG
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
		
		// ?�� if문을 switch문으�? �?�?
		switch(num) {
			case 1: // ?��?���? 1?���? SK
				System.out.println("SK");
				break;
			case 6: // ?��?���? 6?���? KT
				System.out.println("KT");
				break;
			case 9: // ?��?���? 9?���? LG
				System.out.println("LG");
				break;
			default: // 그렇�? ?��?���? UNKOWN
				System.out.println("UNKOWN");
				break;
		}

	}

}
