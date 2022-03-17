package ch08;

import java.io.File;

public class ExceptionThrows {

	public static void main(String[] args) {
		try {
			File f = createFile(args[0]);
			System.out.println(f.getName()+"������ ���������� �����Ǿ����ϴ�.");
		}catch(Exception e){
			System.out.println(e.getMessage() + "�ٽ� �Է����ּ���.");
		}

	}//main end
	static File createFile(String fileName) throws Exception {
		if(fileName==null || fileName.equals("")) {
			throw new Exception("�����̸��� ��ȿ���� �ʽ��ϴ�.");
		}
		File f = new File(fileName);
		createNewFile(f);
		return f;
	}// createFile end
	static void createNewFile(File f) {
		try {
			f.createNewFile();
		}catch(Exception e) {}
	}
	


}
