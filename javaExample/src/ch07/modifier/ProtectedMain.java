package ch07.modifier;

import ch06.Protected;

public class ProtectedMain extends Protected{

	public static void main(String[] args) {
		ProtectedMain p = new ProtectedMain();
		p.one="two";
		p.getOne();

	}
}
