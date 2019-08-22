package ui;

import business.Book;
import business.LineItem;
import business.Product;
import util.Console;

public class ProductManagerApp {

	public static void main(String[] args) {
		System.out.println("Welcome to the Product Manager App");
		
		Product p1 = new Product("java","Murach's Java Programming",59.50);
		Product p2 = new Product();
		p2.setCode(".net");
		p2.setDescription("Murach's .Net Programming");
		p2.setPrice(58.50);
		
		
		System.out.println("p1 code = "+p1.getCode());
		System.out.println("p2 description = "+p2.getDescription());
		System.out.println(p1);
		System.out.println(p2.toString());
		
		int q1 = Console.getInt("Enter a quantity:  ");
		System.out.println("quantity entered: "+q1);
		
		LineItem li = new LineItem(p1,q1);
		System.out.println("line item created... pdt = "+li.getProduct().getDescription());
		System.out.println("Bye!");
		
		Book b = new Book("andr", "Murach's Android Programming", 
				55, "Joel Murach");
		System.out.println(b);

	}

}
