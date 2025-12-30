package tnsprojects;

public class Continue {

	public static void main(String[] args) {
		for (int k = 7; k < 20; k++)
		{
		// Odd are skipped
		if (k%3 != 0)
		continue;
		// Even  are printed
		System.out.print(k + " ");
		}
	}
}

