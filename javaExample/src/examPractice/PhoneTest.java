package examPractice;

import java.util.Scanner;

public class PhoneTest {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		// 키보드로 입력한 값을 생성자를 이용하여 초기화
		System.out.print("모델명을 입력하세요.>");
		String model=s.nextLine();
		System.out.print("색상을 입력하세요.>");
		String color=s.nextLine();
		System.out.print("채널을 입력하세요.>");
		int channel=s.nextInt();
		
		DmbCellPhone dcp = new DmbCellPhone(model, color, channel);
		// 1.DmbCellPhone() 기본 생성자를 만들어 주거나
		// 2.현재처럼 3개의 인수를 넣어주거나 해야함
		
		System.out.println("모델 : "+model);
		System.out.println("색상 : "+color);
		System.out.println("채널 : "+channel);
		
		System.out.println("=====================================================");
		System.out.println("1.전원 켬 2.전원끔 3.전화 받기 4.DMB 켜기 5.DMB 채널바꾸기 6.DMB 끄기");
		System.out.println("=====================================================");
		
		int num;    // 큰 while문에 사용
		int select; // 전화 안의 while문에 사용
		String re_msg; // for안의 re_msg
		String sa_msg; // for안의 sa_msg
		
		while(true) {
			System.out.print("하시고자 하는 기능을 선택하세요.>");
			num=s.nextInt();
			if(num==1) {
				dcp.powerOn();
			}else if(num==2) {
				dcp.powerOff();
				break; // 반복문 밖으로 빠져나가게
			}else if(num==3) {
				while(true) {
					System.out.println("=======================");
					System.out.println("1.말한다 2.듣는다 3.전화를 끊는다");
					System.out.println("=======================");
					System.out.print("1번,2번,3번 중 하나를 선택하세요.>");
					select=s.nextInt();
					if(select==1) {
						System.out.print("상대방에게 하시고자 하는 메세지를 입력하세요.");
						s.skip("\\\r\\\n"); // 이전에 있는 엔터문은 스킵하고 그 이후의 것만 실행되도록
											// => nextLine()과의 충돌을 막기 위해서 사용
						
						re_msg=s.nextLine();// next()를 쓰면 띄울때마다 따로 저정해서 nextLine()써야함
						dcp.recVoice(re_msg);
					}else if(select==2) {
						System.out.println("상대방이 하시고자 하는 메세지를 입력하세요.>");
						s.skip("\\\r\\\n");
						sa_msg=s.nextLine();
						dcp.senVoice(sa_msg);
					}else {
						dcp.callOff();
						break; // 반복문 밖으로 빠져나가게
					}
				}
			}else if(num==4) {
				dcp.dmbOn(channel);
			}else if(num==5) {
				dcp.channelChange();
			}else if(num==6) {
				dcp.dmbOff();
			}else {
				System.out.println("다시 입력하세요.");
			}
		}
		

	}

}
