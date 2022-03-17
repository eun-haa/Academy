package ch06;
// default는 따로 키워드가 있는게 아니라, 그냥 쓰면 default임
public class Default {// 맨 앞의 public을 지우면 default class가 됨!
	
	String one; // 앞에 public 키워드를 붙임으로서 
	String getOne() {// 다른 패키지에 있는 Default 파일에 접근 가능
		one="one";
		return one;
	}
}
