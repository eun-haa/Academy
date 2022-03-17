package examPractice.ch07_exam;

import java.util.Scanner;

public class CellPhoneTest {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("�𵨸��� �Է��ϼ���.>");
		String model=s.nextLine();
		System.out.print("������ �Է��ϼ���.>");
		String color=s.nextLine();
		System.out.print("ä���� �Է��ϼ���.>");
		int channel=s.nextInt();
		
		DmbCellPhone dcp = new DmbCellPhone(model, color, channel);
		
		System.out.println("====================================================");
		System.out.println("1.���� �� 2.���� �� 3.��ȭ �ޱ� 4.DMB �ѱ� 5.DMBä�� �ٲٱ� 6.DMB ����");
		System.out.println("====================================================");
		
		
		
		while(true) {
			System.out.println("�Ͻð��� �ϴ� ����� �����ϼ���.>");
			int num=s.nextInt();
			if(num==1) {
				dcp.powerOn();
			}else if(num==2) {
				dcp.powerOff();
				break;
			}else if(num==3) {
				dcp.bell();
				System.out.println("============================");
				System.out.println("1.���Ѵ�\t2.��´�\t3.��ȭ�� ���´�");
				System.out.println("============================");
				while(true) {
					System.out.print("1��, 2��, 3�� �� �ϳ��� �����ϼ���.>");
					int select=s.nextInt();
					if(select==1) {
						System.out.print("���濡�� �Ͻð��� �ϴ� �޼����� �Է��ϼ���.>");
						s.skip("\\r\\n");
						String re_msg=s.nextLine();
						dcp.recVoice(re_msg);
					}else if(select==2) {
						System.out.println("������ �ϰ��� �ϴ� �޼����� �Է��ϼ���.>");
						s.skip("\\r\\n");
						String sa_msg=s.nextLine();
						dcp.sandVoice(sa_msg);
					}else {
						dcp.callOff();
						break;
					}// num==3 for�� ��
					
				}// num==3 while�� ��
		
			}else if(num==4) {
				dcp.dmbOn();
			}else if(num==5) {
				dcp.changeChannel();
			}else {
				dcp.dmbOff();
			}
		}// while ��
		
	
	}

}
