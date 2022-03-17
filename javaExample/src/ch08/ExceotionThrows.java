package ch08;

import java.io.File;

public class ExceotionThrows {

	public static void main(String[] args) {
		// Command Line���� �Է¹��� ���� �̸����� ���� ������ �����Ѵ�.
		File f = createFile(args[0]);
		System.out.println(f.getName()+"������ ���������� �����Ǿ����ϴ�.");
	}// main ��
	static File createFile(String fileName) {
		try {
			if(fileName==null || fileName.equals("")) {
				throw new Exception("�����̸��� ��ȿ���� �ʽ��ϴ�.");
			}
		}catch(Exception e){
			// fileName�� �������� ���, ���� �̸��� '�������.txt'�� �Ѵ�
			fileName="�������.txt";
		}finally {
			File f = new File(fileName);// FileŬ������ ��ü�� �����
			createNewFile(f);
			return f;
		}

	}// createFile �޼ҵ� ��
	static void createNewFile(File f) {
		try {
			f.createNewFile();
		}catch(Exception e) {}
	}

}
