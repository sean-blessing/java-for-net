import java.util.Scanner;

public class MethodsApp {

	public static void main(String[] args) {
		// prompt user for 2 #s
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter an integer: ");
		// exception handling
		int i1 = 0;
		try {
			i1 = sc.nextInt();
		}
		catch (Exception e) {
			System.out.println("i1 needs to be numeric");
			sc.next();
		}
		
		System.out.println("Enter another integer: ");
		// data validation
		int i2 = 0;
		if (sc.hasNextInt()) {
			i2 = sc.nextInt();
		}
		else {
			System.out.println("i2 needs to be numeric");
		}
		
		int sum = sumIt(i1, i2);
		
		// print result
		System.out.println("Result = "+sum);

	}

	private static int sumIt(int i1, int i2) {
		// sum those #s
		int sum = i1 + i2;
		return sum;
	}

}
