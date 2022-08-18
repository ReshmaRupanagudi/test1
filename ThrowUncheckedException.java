package basic.exceptions;

public class ThrowUncheckedException {

	public static void main(String[] args) {
		m();
	}
	
	static void m() {
		throw new NullPointerException();
	}

}
/*
We throw NullPointerException (unChecked exception) and 
didn’t handled it, no compilation error was thrown.
*/