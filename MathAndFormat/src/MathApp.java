import java.text.NumberFormat;

public class MathApp {

	public static void main(String[] args) {
		// demo rounding
		double d1 = 55.335;
		double d2 = (double)Math.round(d1*100)/100;
		
		System.out.println(d2);
		
		
		// demo max
		
		System.out.println(Math.max(44,66));
		
		// demo format - currency
		System.out.println(d1);
		NumberFormat currency = NumberFormat.getCurrencyInstance();
		System.out.println(currency.format(d1));
		
		// demo format - pct
		double d = .877;
		NumberFormat pct = NumberFormat.getPercentInstance();
		pct.setMinimumFractionDigits(1);
		System.out.println(pct.format(d));

	}

}
