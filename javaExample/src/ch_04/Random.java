package ch_04;
// Math.random
public class Random {
	public static void main(String[] args) {
		// 1~10 범위의 임의의 정수를 얻는 식
		int random = (int)(Math.random()*10)+1;
		
		System.out.println(random);
	}
}
