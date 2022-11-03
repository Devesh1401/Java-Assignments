package hashmap;

import java.util.HashMap;
import java.util.Map;



public class AccMapEx {

	public static void main(String[] args) {

		Map<Account,Double> map = new HashMap<Account,Double>();
		
		map.put(new Account("Liam", 101, 50000),50000.0);
		map.put(new Account("Alaistair", 110, 10000),10000.0);
		map.put(new Account("Ian", 103, 50000),50000.0);
		map.put(new Account("Ben", 200, 50000),50000.0);
		map.put(new Account("Ben", 200, 50000),50000.0);

		System.out.println(map);
		
		System.out.println(map.get(new Account("Ben", 200, 50000)));
		
	}

}
