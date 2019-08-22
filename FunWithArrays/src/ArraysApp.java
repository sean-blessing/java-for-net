import java.util.Arrays;

public class ArraysApp {

	public static void main(String[] args) {
		String[] names = new String[3];
		names[0] = "Jesse";
		names[1] = "Briana";
		names[2] = "Titus";
		
		for (int i=0; i<names.length; i++) {
			System.out.println(names[i]);
		}
		
		Arrays.sort(names);

		for (String n : names) {
			System.out.println(n);
		}


		
		

	}

}
