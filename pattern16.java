import java.util.*;
public class pattern16 {
	public static void printPattern(int n)
	{
		int i, j, k;

		// outer loop to handle rows
		for (i = 1; i <= n; i++) {
		
			// inner loop to print spaces.
			for (j = i; j < n; j++) {
				System.out.print(" ");
			}
		
			for (k = 1; k <= (2 * i - 1); k++) {
				// printing stars.
				if (k == 1 || i == n || k == (2 * i - 1)) {
					System.out.print("*");
				}
				// printing spaces.
				else {
					System.out.print(" ");
				}
			}

			System.out.println("");
		}
	}
	public static void main(String args[])
	{
		int n = 6;
		printPattern(n);
	}
}