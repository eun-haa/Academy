package examPractice.ch07_exam;

import java.util.Scanner;

public class CellPhoneTest {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("모델명을 입력하세요.>");
		String model=s.nextLine();
		System.out.print("색상을 입력하세요.>");
		String color=s.nextLine();
		System.out.print("채널을 입력하세요.>");
		int channel=s.nextInt();
		
		DmbCellPhone dcp = new DmbCellPhone(model, color, channel);
		
		System.out.println("====================================================");
		System.out.println("1.전원 켬 2.전원 끔 3.전화 받기 4.DMB 켜기 5.DMB채널 바꾸기 6.DMB 끄기");
		System.out.println("====================================================");
		
		
		
		while(true) {
			System.out.println("하시고자 하는 기능을 선택하세요.>");
			int num=s.nextInt();
			if(num==1) {
				dcp.powerOn();
			}else if(num==2) {
				dcp.powerOff();
				break;
			}else if(num==3) {
				dcp.bell();
				System.out.println("============================");
				System.out.println("1.말한다\t2.듣는다\t3.전화를 끊는다");
				System.out.println("============================");
				while(true) {
					System.out.print("1번, 2번, 3번 중 하나를 선택하세요.>");
					int select=s.nextInt();
					if(select==1) {
						System.out.print("상대방에게 하시고자 하는 메세지를 입력하세요.>");
						s.skip("\\r\\n");
						String re_msg=s.nextLine();
						dcp.recVoice(re_msg);
					}else if(select==2) {
						System.out.println("상대방이 하고자 하는 메세지를 입력하세요.>");
						s.skip("\\r\\n");
						String sa_msg=s.nextLine();
						dcp.sandVoice(sa_msg);
					}else {
						dcp.callOff();
						break;
					}// num==3 for문 끝
					
				}// num==3 while문 끝
		
			}else if(num==4) {
				dcp.dmbOn();
			}else if(num==5) {
				dcp.changeChannel();
			}else {
				dcp.dmbOff();
			}
		}// while 끝
		
	
	}

}
