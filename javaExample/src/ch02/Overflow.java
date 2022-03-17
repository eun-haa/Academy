package ch02;

public class Overflow {

	public static void main(String[] args) {
		// byte ≈∏¿‘¿∫ -128 ~ 127
		byte b=127;
		
		b=(byte)(b+2);
		
		System.out.println(b);

	}

}
