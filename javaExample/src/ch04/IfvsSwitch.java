package ch04;
// ì¡°ê±´ë¬? if?? switchë¬? ë¹„êµ
public class IfvsSwitch {

	public static void main(String[] args) {
		// ï»¿ifë¬¸ì˜ ì¡°ê±´?‹?— >=,<=,>,<?˜ ê¸°í˜¸ê°? ?ˆ?œ¼ë©? switchë¬¸ìœ¼ë¡? ë³?ê²? ë¶ˆê?
		// ? ?ˆ˜ê°? 60?  ?´?ƒ?´ë©? ?•©ê²?
		// ê·¸ë ‡ì§? ?•Š?œ¼ë©? ë¶ˆí•©ê²?
		
		int score = 70;
		
		if(score>=60) {// ? ?ˆ˜ê°? 60?  ?´?ƒ?´ë©? ?•©ê²?
			System.out.println("?•©ê²?");
		}else {// ê·¸ë ‡ì§? ?•Š?œ¼ë©? ë¶ˆí•©ê²?
			System.out.println("ë¶ˆí•©ê²?");
		}
		
		
		// ï»¿ifë¬¸ì˜ ì¡°ê±´?‹?— ==?˜ ê¸°í˜¸ê°? ?ˆ?œ¼ë©? switchë¬¸ìœ¼ë¡? ë³?ê²? ë¶ˆê?
		// ?ˆ«?ê°? 1?´ë©? SK
		// ?ˆ«?ê°? 6?´ë©? KT
		// ?ˆ«?ê°? 9?´ë©? LG
		// ê·¸ì™¸ UN
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
		
		// ?œ„ ifë¬¸ì„ switchë¬¸ìœ¼ë¡? ë³?ê²?
		switch(num) {
			case 1: // ?ˆ«?ê°? 1?´ë©? SK
				System.out.println("SK");
				break;
			case 6: // ?ˆ«?ê°? 6?´ë©? KT
				System.out.println("KT");
				break;
			case 9: // ?ˆ«?ê°? 9?´ë©? LG
				System.out.println("LG");
				break;
			default: // ê·¸ë ‡ì§? ?•Š?œ¼ë©? UNKOWN
				System.out.println("UNKOWN");
				break;
		}

	}

}
