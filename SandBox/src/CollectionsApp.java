import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CollectionsApp {

	public static void main(String[] args) {
		
		ArrayList<String> codes1 = new ArrayList<String>();
		ArrayList<String> codes2 = new ArrayList<>();
		List<String> codes3 = new ArrayList<>();
		
		codes3.add("java");
		codes3.add(".net");
		codes3.add("andr");
		
		codes3.remove("andr");
		
		List<Integer> nbrs = new ArrayList<>();
		nbrs.add(1);
		
		Map<String,Product> productMap = new HashMap<>();
		
		Product p1 = new Product(".net", "Murach's .Net Programming", 55.0);
		productMap.put(p1.getCode(), p1);
		Product p2 = new Product("java", "Murach's Java Programming", 57.5);
		productMap.put(p1.getCode(), p1);
		Product p3 = new Product("andr", "Murach's Android Programming", 54.5);
		productMap.put(p1.getCode(), p1);
		
		productMap.remove("andr");
		
	}

}
