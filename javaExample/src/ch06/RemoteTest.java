package ch06;

public class RemoteTest {

	public static void main(String[] args) {
		/*
		// RemoteŬ����(������ ����)�� ���� �������� �����϶�
		// = �ν��Ͻ�ȭ
		//Remote re;
		//re = new Remote();
		
		// LGTV�� �������� ������
		Remote LGre = new Remote(); // �ν��Ͻ�ȭ �ߴ�
	//  int    a  = 10; �� ����
		
		LGre.volume=10;
		LGre.bgcolor="black";
		LGre.volumeUp();
		
		System.out.println(LGre.volume);
		
		// SAMSUNGTV�� �������� ������
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
