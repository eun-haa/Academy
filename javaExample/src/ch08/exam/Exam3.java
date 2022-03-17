package ch08.exam;

public class Exam3 {
	void add(int a, int b) throws InvalidNumberException, NotANumberException{}
	
	class NumberException extends Exception{}
	class InValidNumberException extends NumberException{}
	class NotANumberException extends NumberException{}
	
	void add(int a, int b) throws InvalidNumberException, NotANumberException{}
	void add(int a, int b) throws InvalidNumberException { }
	void add(int a, int b) throws NotANumberException { }
	void add(int a, int b) throws Exception { }
	void add(int a, int b) throws NumberException { }
	
		
	}
}
