import java.util.Scanner;

public class ControlStmtApp {

	public static void main(String[] args) {
		String choice = "y";
		
		Scanner sc = new Scanner(System.in);
		
		
		while (choice.equalsIgnoreCase("y")) {
			System.out.println("In a while loop...");
			
			// do some cool business logic
			
			System.out.println("Continue??");
			choice = sc.next();
		}
		
		System.out.println("How many times?");
		int count = sc.nextInt();
		for (int i=0; i<= count; i++) {
			System.out.println("hello"+i);
		}
		
		if (count > 10) {
			System.out.println("> 10");
		}
		else if (count >20) {
			
		}
		else {
			
		}
		
		
		System.out.println("bye!");

	}

}
