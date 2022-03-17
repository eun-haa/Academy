package examPractice;

import java.util.Scanner;

public class PhoneTest {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		// Ű����� �Է��� ���� �����ڸ� �̿��Ͽ� �ʱ�ȭ
		System.out.print("�𵨸��� �Է��ϼ���.>");
		String model=s.nextLine();
		System.out.print("������ �Է��ϼ���.>");
		String color=s.nextLine();
		System.out.print("ä���� �Է��ϼ���.>");
		int channel=s.nextInt();
		
		DmbCellPhone dcp = new DmbCellPhone(model, color, channel);
		// 1.DmbCellPhone() �⺻ �����ڸ� ����� �ְų�
		// 2.����ó�� 3���� �μ��� �־��ְų� �ؾ���
		
		System.out.println("�� : "+model);
		System.out.println("���� : "+color);
		System.out.println("ä�� : "+channel);
		
		System.out.println("=====================================================");
		System.out.println("1.���� �� 2.������ 3.��ȭ �ޱ� 4.DMB �ѱ� 5.DMB ä�ιٲٱ� 6.DMB ����");
		System.out.println("=====================================================");
		
		int num;    // ū while���� ���
		int select; // ��ȭ ���� while���� ���
		String re_msg; // for���� re_msg
		String sa_msg; // for���� sa_msg
		
		while(true) {
			System.out.print("�Ͻð��� �ϴ� ����� �����ϼ���.>");
			num=s.nextInt();
			if(num==1) {
				dcp.powerOn();
			}else if(num==2) {
				dcp.powerOff();
				break; // �ݺ��� ������ ����������
			}else if(num==3) {
				while(true) {
					System.out.println("=======================");
					System.out.println("1.���Ѵ� 2.��´� 3.��ȭ�� ���´�");
					System.out.println("=======================");
					System.out.print("1��,2��,3�� �� �ϳ��� �����ϼ���.>");
					select=s.nextInt();
					if(select==1) {
						System.out.print("���濡�� �Ͻð��� �ϴ� �޼����� �Է��ϼ���.");
						s.skip("\\\r\\\n"); // ������ �ִ� ���͹��� ��ŵ�ϰ� �� ������ �͸� ����ǵ���
											// => nextLine()���� �浹�� ���� ���ؼ� ���
						
						re_msg=s.nextLine();// next()�� ���� ��ﶧ���� ���� �����ؼ� nextLine()�����
						dcp.recVoice(re_msg);
					}else if(select==2) {
						System.out.println("������ �Ͻð��� �ϴ� �޼����� �Է��ϼ���.>");
						s.skip("\\\r\\\n");
						sa_msg=s.nextLine();
						dcp.senVoice(sa_msg);
					}else {
						dcp.callOff();
						break; // �ݺ��� ������ ����������
					}
				}
			}else if(num==4) {
				dcp.dmbOn(channel);
			}else if(num==5) {
				dcp.channelChange();
			}else if(num==6) {
				dcp.dmbOff();
			}else {
				System.out.println("�ٽ� �Է��ϼ���.");
			}
		}
		

	}

}
