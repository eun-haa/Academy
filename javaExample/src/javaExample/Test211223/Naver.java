package javaExample.Test211223;

public class Naver {
	// 변수 선언
	private String user_id;
	private String user_pw;
	private String user_name;
	private int user_birth;
	private String user_gender;
	private String user_mail;
	private int user_number;
	
	
	// 메서드
	public void setId(String id) {
		this.user_id=id;
	}
	public String getId() {
		return user_id;
	}
	
	public void setPw(String pw) {
		this.user_pw=pw;
	}
	public String getPw() {
		return user_pw;
	}
	
	public void setName(String name) {
		this.user_name=name;
	}
	public String getName() {
		return user_name;
	}
	
	public void setBirth(int birth) {
		this.user_birth=birth;
	}
	public int getBirth() {
		return user_birth;
	}
	
	public void setGender(String gender) {
		this.user_gender=gender;
	}
	public String getGender() {
		return user_gender;
	}
	
	public void setMail(String mail) {
		this.user_mail=mail;
	}
	public String getMail() {
		return user_mail;
	}
	
	public void setNumber(int number) {
		this.user_number=number;
	}
	public int getNumber() {
		return user_number;
	}
	
	public static void main(String[] args) {
		Naver n1 = new Naver();
		n1.setId("abcd");
		n1.setPw("a1234");
		n1.setName("정은하");
		n1.setBirth(19960820);
		n1.setGender("여자");
		n1.setMail("eunha@naver.com");
		n1.setNumber(01011112222);
	}

}
