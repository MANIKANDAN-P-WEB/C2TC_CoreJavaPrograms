package tnsprojects;

public class DecisionMaking {
	public static void main(String[] args) {
		int x = 6, y = 9;
		int a = 10;
		int b = 21;

		if (x >= y) {
			System.out.println("true");
		} else {
			System.out.println("false");
		}

		if (!(a < b) || (a == b)) {
			System.out.println("Condition is TRUE");
		} else

		{
			System.out.println("Condition is FALSE");
		}
	}
}
