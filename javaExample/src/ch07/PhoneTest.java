package ch07;

import java.util.Scanner;

public class PhoneTest {

	public static void main(String[] args) {
		// Ű���忡 �Է��ϴ� �ɷ� �ٲ��־�� �ϴϱ� Scanner �������
		Scanner s = new Scanner(System.in);
		
		System.out.println("�𵨸��� �Է��ϼ���.>");
		String model=s.next();    // �� �Է¹ޱ�
		
		System.out.println("������ �Է��ϼ���.>");
		String color=s.next();    // ���� �Է¹ޱ�
		
		System.out.println("ä���� �Է��ϼ���.>");
		int channel=s.nextInt();  // ä�� �Է¹ޱ�
		
		int menu=0;
		int select=0;
		String re_msg="";
		String sa_msg="";
		
		// DmbCellPhone�� �������� �ƴ� Ű���忡 �Է¹޴� ������
		DmbCellPhone dcp = new DmbCellPhone(model,color,channel);
		
		System.out.println("�� : " + dcp.model);
		System.out.println("���� : " + dcp.color);
		System.out.println("ä�� : " + dcp.channel);
		
		
		System.out.println("=====================================================");
		System.out.println("1.���� �� 2.���� �� 3.��ȭ�ޱ� 4.DMB �ѱ� 5.DMBä�� �ٲٱ� 6.DMB ����");
		System.out.println("=====================================================");
		
		
		// �ݺ�
		while(true) {// true�� ���ѹݺ�, ���ѹݺ��� ������ ������ false or break�� ����
			System.out.println("�Ͻð��� �ϴ� ����� �����ϼ���.>");
			menu=s.nextInt(); // ������ ���� ���������� ������൵ ��
			// 1���� �����ϸ�
			// ���� ��
			// 2���� �����ϸ�
			// ���� ��
			// 3���� �����ϸ�
			// ��ȭ �ޱ�
			// 4���� �����ϸ� 
			// DMB �ѱ�
			// 5���� �����ϸ� 
			// DMB ä�� �ٲٱ�
			// 6���� �����ϸ�
			// DMB ����
			if(menu==1) {
				System.out.println(dcp.PowerOn());
			}else if(menu==2) {
				System.out.println(dcp.PowerOff());
				break; // �ݺ��� �����ؾ���(2�� ������)
			}else if(menu==3) {//3�� ��ȭ�ޱ� �ɼ�
				System.out.println("=======================");
				System.out.println("1.���Ѵ� 2.��´� 3.��ȭ�� ���´�");
				System.out.println("=======================");
				
				// �� �ٸ� �ݺ���
				 while(true) {
					 System.out.println("1��, 2��, 3�� �� �ϳ��� �����ϼ���.>");
					 select=s.nextInt(); // �����ϸ� �ۿ��� ���������� �������ֱ�(int select = 0;)
					 
					 if(select==1) {
						 System.out.println("���濡�� �Ͻð��� �ϴ� �޼����� �Է��ϼ���.>");
						 s.skip("\\r\\n");    // "\\r\\n" ���Ͽ� �ɸ��� ���� ��ŵ�϶�
						                      // return, enter���� �Ѿ�� ���� ��ŵ�϶�� ��
						                      // nextLine()���� �浹�� ���� ����
						 re_msg=s.nextLine(); // �� next()�� �ƴ� nextLine()�̾�� �ϴ°�?
						                      // ���� �������� �Ѿ���ؼ� nextLine()
						                      // next()�� ��ﶧ���� ���� ������
						 System.out.println("�� : "+dcp.ReceiveVoice(re_msg));
						  
					 }else if(select==2) {
						 System.out.println("���濡�� �Ͻð��� �ϴ� �޼����� �Է��ϼ���.>");
						 s.skip("\\r\\n");
						 sa_msg=s.nextLine();
						 System.out.println("���� : "+dcp.SendVoice(sa_msg));
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
		
		
//		System.out.println(dcp.PowerOn()); // ������ ȣ���� ���� ���� ���� �ش�
//		System.out.println(dcp.Bell());
//		System.out.println("�� : "+dcp.ReceiveVoice("��������"));
//		System.out.println("���� : "+dcp.SendVoice("�ȳ��ϼ���. ���� ���ڹ��Դϴ�."));
//		System.out.println("�� : "+dcp.ReceiveVoice("��~ �� �ݰ����ϴ�."));
//		System.out.println(dcp.CallOff());
//		System.out.println(dcp.DmbOn());
//		System.out.println(dcp.ChangeChannel(12));
//		// �����ϱ�! ChangeChannel �Լ��� �Ű�����(int Channel) �ʼ�
//		
//		System.out.println(dcp.DmbOff());
		
		

	}

}
