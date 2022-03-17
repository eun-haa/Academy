package ch06;

public class RemoteTest {

	public static void main(String[] args) {
		/*
		// Remote클래스(리모컨 설계)를 보고 리모컨을 구현하라
		// = 인스턴스화
		//Remote re;
		//re = new Remote();
		
		// LGTV의 리모컨을 만들자
		Remote LGre = new Remote(); // 인스턴스화 했다
	//  int    a  = 10; 과 같음
		
		LGre.volume=10;
		LGre.bgcolor="black";
		LGre.volumeUp();
		
		System.out.println(LGre.volume);
		
		// SAMSUNGTV의 리모컨을 만들자
		Remote SAMSUNGre = new Remote();
		SAMSUNGre.bgcolor="white";
		*/
		
		
//		int    a = 10;
//		int[]  a = new int[5];
		
//		Remote re = new Remote();
		Remote[] re = new Remote[5];
		
		for(int i=0; i<re.length; i++) {
			re[i] = new Remote();
		}
		
		
		re[0].fontcolor="black";
		re[1].channel=10;
		re[2].power=true;
		re[3].bgcolor="blue";
		re[4].volume=20;
		
		System.out.println(re[0].fontcolor);
		System.out.println(re[1].channel);
		System.out.println(re[2].power);
		System.out.println(re[3].bgcolor);
		System.out.println(re[4].volume);
		
		
	}

}
