package basic;

class OrderOfExecutionInRPParent {

	int x = 10;
	{
		System.out.println("Parent NSB" + " X:" + x);
	}

	OrderOfExecutionInRPParent() {
		System.out.println("Parent Constructor");
		x = 5;
	}
}

public class OrderOfExecutionInRP extends OrderOfExecutionInRPParent {

	int x = 100;
	int y = 20;

	{
		System.out.println("Child X:" + x + "  Y:" + y);
	}

	OrderOfExecutionInRP() {
		System.out.println("Child Constructor");

		y = 6;
	}

	public static void main(String[] args) {
		OrderOfExecutionInRPParent obj = new OrderOfExecutionInRP();
		// OrderOfExecutionInRP obj = new OrderOfExecutionInRP();
		System.out.println("Main Method");
		System.out.println("Main X:" + obj.x);
		// System.out.println("Main y:"+obj.y);
	}
}
