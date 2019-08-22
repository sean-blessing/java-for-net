
public class SwitchApp {

	public static void main(String[] args) {
		int id = 1;
		
		switch(id) {
		case 1:
			System.out.println("1");
			//break;
		case 5:
			System.out.println("5");
			break;
		case 6:
			System.out.println("6");
			break;
		default:
			System.out.println("default");
			break;
		}
		
		//convert the numeric day of week to 'weekday' or 'weekend'
		String str = "";
		switch(id) {
		case 1:
		case 2:
		case 3:
		case 4:
		case 5:
			str = "weekday";
			break;
		case 6:
		case 7:
			str = "weekend";
			break;
		
		}
		System.out.println(str);

	}

}
