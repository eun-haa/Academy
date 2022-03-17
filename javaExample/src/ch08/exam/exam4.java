package ch08.exam;

public class exam4 {
	public static void main(String[] args) {

	}
	
	
	
	void method() throws InvalidNumberException, NotANumberException{
		try {
			method();
		}catch(Exception e) {
			
		}catch(NotANumberException e){
			
		}
	}
	
	class NumberException extends RuntimeException{}
	class InvalidNumberException extends NumberException{}
	class NotANumberException extends NumberException{}
	
}
