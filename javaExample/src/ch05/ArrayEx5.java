package ch05;
// 배열의 복사
public class ArrayEx5 {

	public static void main(String[] args) {
		// 원본 데이터
		int[] oldNumber = {1,2,3,4,5};
		
		// 복사본 데이터
		int[] newNumber = new int[10];
		
		
		// 1.for문 써서 복사하기
		for(int i=0; i<oldNumber.length; i++) {
			newNumber[i]=oldNumber[i];
		}
		
		// for을 풀어서 쓴다면?
//		newNumber[0]=oldNumber[0];
//		newNumber[1]=oldNumber[1];
//		newNumber[2]=oldNumber[2];
//		newNumber[3]=oldNumber[3];
//		newNumber[4]=oldNumber[4];
		// 이렇게 길어지기때문에 for문을 써서 코드를 줄여주는 것!
		
		
		// 2.함수 사용하기
		//System.arraycopy(
		// 1)원본데이터, 
		// 2)원본데이터 어디서부터복사, 
		// 3)복사본데이터, 
		// 4)복사본데이터 어디서부터 붙여넣기, 
		// 5)원본데이터 어디서 까지 복사)
		
		System.arraycopy(oldNumber, 0, newNumber, 0, oldNumber.length);
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
