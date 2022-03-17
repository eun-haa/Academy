package ch_04;
// 반복문
public class For {

	public static void main(String[] args) {
		// Hello World라는 문자열을 10번 출력하세요.(for문)
		// for(초기값 ; 조건식; 증감식){반복할 문장}
//		for(int i=1; i<=10; i++) {
//			System.out.println("Hello World");
//		}
		
		// for문 - 1부터 10까지 정수 더하기
//		int sum=0;
//		int i=0;
//		for(i=1; i<11; i++) {
//			sum=sum+i; // sum+=i
//		}
//		System.out.println(i-1+"까지의 합 : " +sum);//int i가 지역변수라 인식 X, 오류
//		
		// while
		// 초기값
		// while(조건식){
		// 중감식
		// 반복할 문장
		// }
//		int i=11;
//		while(i<11) {
//			i++;
//			System.out.println("Hello World");
//		}
		
		// do-while
//		int i=11;
//		do {
//			i++;
//			System.out.println("Hello World");
//		}while(i<11);
		
		
		
		// 중첩 for를 이용하여 2단부터 9단까지 구구단.
//		for(int i=2; i<10; i++) {
//			for(int j=1; j<10; j++) {
//				System.out.println(i + " X " + j + " = " + i*j);
//			}
//		}
		
		
		
		// break
//		int sum=0;
//		int i=0;
//		
//		while(true) {//while문의 조건식이 true이면, 무한 루프
//			if(sum>100) {
//				break;
//			}
//			i++;
//			sum+=i;
//			
//			
//		}
//		System.out.println("i = " +i);
//		System.out.println("sum = "+sum);
		
		
		
		// continue
//		for(int i=0; i<10; i++) {
//			if(i%3==0) { //3의 배수인 부분만 빼고 반복(결과값 보여줌)
//				continue;
//			}
//			System.out.println(i);
//		}
		
		
		// 이름 붙은 반복문
		// 이름이 없다면?
		for(int i=2; i<10; i++) {
			for(int j=1; j<10; j++) {
				System.out.println(i + " X " + j + " = " + i*j);
				break; // j 반복문 멈춤(제일 가까이에 있는 반복문을 멈추게함)
			}
			break; // i 반복문 멈춤
		} // 각각 멈추게 하려면 두개의 브레이크가 필요함
		
		
		// 이름을 붙여주면?
		Loop1:for(int i=2; i<10; i++) {
			for(int j=1; j<10; j++) {
				//System.out.println(i + " X " + j + " = " + i*j);
				if(j==5) {
					//break; // 2~9단 모두 5번까지만 나옴
					//break Loop1; // 2단의 5번까지만 나옴(Loop1에 break)
					continue; // j에 대한 continue, 각 단의 5번만 빼고 반복
					          //(대신 sysout이 if 뒤에 있어야함)
					//continue Loop1;
				}
				//System.out.println(i + " X " + j + " = " + i*j);
			}
		}
		
		
		
		
		
		
		
		
	}

}
