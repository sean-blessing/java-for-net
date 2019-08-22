import java.time.LocalDate;
import java.time.LocalDateTime;

public class DateTime {

	public static void main(String[] args) {
		
		
		LocalDate currentDate = LocalDate.now();
		LocalDateTime currentDateTime = LocalDateTime.now();
		
		LocalDate halloween = LocalDate.of(2019, 10, 31);
		LocalDate christmas = LocalDate.of(2019, 12, 25);
		
		System.out.println(halloween.isBefore(christmas));

	}

}
