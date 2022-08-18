package basic.exceptions;

import java.io.FileNotFoundException;

public class ThrowCheckedException {

	public static void main(String[] args) {
		m();
	}
	
	static void m() {
		throw new FileNotFoundException();
	}

}
/*
We need to handle checked exception either by catching it, or 
throwing it by using throws keyword. (When thrown, exception must be handled in calling environment)
*/