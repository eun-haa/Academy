package javaExample;
// 생성자 - 2번 문제
public class Song {
	String title;
	String singer;
	int year;
	String country;
	
	void show(int year, String country, String singer, String title) {
		System.out.println(year + "년");
		System.out.println(country + "국적의 ");
		System.out.println(singer + "가 부른 ");
		System.out.println(title);
	}
}
