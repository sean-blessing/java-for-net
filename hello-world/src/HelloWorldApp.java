import java.util.Scanner;

public class HelloWorldApp {

	public static void main(String[] args) {
		// This is a one line comment
		
		/*
		 * This
		 * is a 
		 * block
		 * comment
		 */
		
		/**
		 * This is a Javadoc comment
		 */
		System.out.println("Hello World!");
		System.out.println("another line");
		
		System.out.print("a");
		System.out.print("a");
		System.out.print("a");
		System.out.print("a");
		
		int a = 0;
		String title = "Hello World";
		
		System.out.println(a+title);
		System.out.println();
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a string");
		String aStr = sc.nextLine();
		System.out.println("You entered: "+aStr);
		
		System.out.print("Enter a nbr");
		int i = sc.nextInt();
		System.out.println("You entered: "+i);
		int sum = 5 +i;
		System.out.println(sum);
		
		System.out.println("Enter a double:");
		double d = sc.nextDouble();
		System.out.println(d);
		
		sum = (int)d + i;
		System.out.println(sum);
		

	}

}
