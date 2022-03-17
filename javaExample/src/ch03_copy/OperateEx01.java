package ch03_copy;
// 증감연산자 예제
public class OperateEx01 {

	public static void main(String[] args) {
		/*
		 * 같은 타입일때는 한줄로 표현 가능
		 * int i=5;
		 * int j=0;
		 * */
		int i=5, j=0; 
		
		j=i++; // 후위형, i에 있는 값을 j 변수에 저장시킨 뒤 i값이 증가
			   // 즉 i에는 5가 저장되고, j에는 6이 저장
		System.out.println("후위형 = i : " +i+ " j : " +j);
		
		i=5;   // 다시 i에 5 저장, 
		j=0;
		
		j=++i; // 전위형, 먼저 i값 증가 시키고 j에 저장
		       // 즉 i=6, j=6
		System.out.println("전위형 = i : " +i+ " j : " +j);

	}

}
