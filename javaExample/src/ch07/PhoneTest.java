package ch07;

import java.util.Scanner;

public class PhoneTest {

	public static void main(String[] args) {
		// 키보드에 입력하는 걸로 바꿔주어야 하니까 Scanner 만들어줌
		Scanner s = new Scanner(System.in);
		
		System.out.println("모델명을 입력하세요.>");
		String model=s.next();    // 모델 입력받기
		
		System.out.println("색상을 입력하세요.>");
		String color=s.next();    // 색상 입력받기
		
		System.out.println("채널을 입력하세요.>");
		int channel=s.nextInt();  // 채널 입력받기
		
		int menu=0;
		int select=0;
		String re_msg="";
		String sa_msg="";
		
		// DmbCellPhone에 고정값이 아닌 키보드에 입력받는 값으로
		DmbCellPhone dcp = new DmbCellPhone(model,color,channel);
		
		System.out.println("모델 : " + dcp.model);
		System.out.println("색상 : " + dcp.color);
		System.out.println("채널 : " + dcp.channel);
		
		
		System.out.println("=====================================================");
		System.out.println("1.전원 켬 2.전원 끔 3.전화받기 4.DMB 켜기 5.DMB채널 바꾸기 6.DMB 끄기");
		System.out.println("=====================================================");
		
		
		// 반복
		while(true) {// true는 무한반복, 무한반복을 끝내고 싶으면 false or break문 쓰기
			System.out.println("하시고자 하는 기능을 선택하세요.>");
			menu=s.nextInt(); // 밖으로 빼서 전역변수로 만들어줘도 됨
			// 1번을 선택하면
			// 전원 켬
			// 2번을 선택하면
			// 전원 끔
			// 3번을 선택하면
			// 전화 받기
			// 4번을 선택하면 
			// DMB 켜기
			// 5번을 선택하면 
			// DMB 채널 바꾸기
			// 6번을 선택하면
			// DMB 끄기
			if(menu==1) {
				System.out.println(dcp.PowerOn());
			}else if(menu==2) {
				System.out.println(dcp.PowerOff());
				break; // 반복문 종료해야함(2번 누르면)
			}else if(menu==3) {//3번 전화받기 옵션
				System.out.println("=======================");
				System.out.println("1.말한다 2.듣는다 3.전화를 끊는다");
				System.out.println("=======================");
				
				// 또 다른 반복문
				 while(true) {
					 System.out.println("1번, 2번, 3번 중 하나를 선택하세요.>");
					 select=s.nextInt(); // 웬만하면 밖에서 전역변수로 선언해주기(int select = 0;)
					 
					 if(select==1) {
						 System.out.println("상대방에게 하시고자 하는 메세지를 입력하세요.>");
						 s.skip("\\r\\n");    // "\\r\\n" 패턴에 걸리는 것은 스킵하라
						                      // return, enter에서 넘어온 것은 스킵하라는 뜻
						                      // nextLine()과의 충돌을 막기 위해
						 re_msg=s.nextLine(); // 왜 next()가 아닌 nextLine()이어야 하는가?
						                      // 엔터 기준으로 넘어가야해서 nextLine()
						                      // next()는 띄울때마다 따로 저장함
						 System.out.println("나 : "+dcp.ReceiveVoice(re_msg));
						  
					 }else if(select==2) {
						 System.out.println("상대방에게 하시고자 하는 메세지를 입력하세요.>");
						 s.skip("\\r\\n");
						 sa_msg=s.nextLine();
						 System.out.println("상대방 : "+dcp.SendVoice(sa_msg));
					 }else if(select==3) {
						 s.skip("\\r\\n");
						 System.out.println(dcp.CallOff());
						 break;
					 }
				 }
			}else if(menu==4) {
				System.out.println(dcp.DmbOn());
			}else if(menu==5) {
				System.out.println(dcp.ChangeChannel(channel));
			}else if(menu==6) {
				System.out.println(dcp.DmbOff());
			}
			
			
	
		}
		
		
//		System.out.println(dcp.PowerOn()); // 리턴은 호출한 곳에 리턴 값을 준다
//		System.out.println(dcp.Bell());
//		System.out.println("나 : "+dcp.ReceiveVoice("여보세요"));
//		System.out.println("상대방 : "+dcp.SendVoice("안녕하세요. 저는 정자바입니다."));
//		System.out.println("나 : "+dcp.ReceiveVoice("아~ 예 반갑습니다."));
//		System.out.println(dcp.CallOff());
//		System.out.println(dcp.DmbOn());
//		System.out.println(dcp.ChangeChannel(12));
//		// 주의하기! ChangeChannel 함수에 매개변수(int Channel) 필수
//		
//		System.out.println(dcp.DmbOff());
		
		

	}

}
