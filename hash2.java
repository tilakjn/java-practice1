package first;

import java.util.HashMap;
import java.util.Map;

public class hash2 {

	public static void main(String[] args) {
	
		HashMap<String,String> map=new HashMap<>();
		
		map.put("colo1", "red");
		map.put("colo2", "blue");
		map.put("colo3","green");
		
		for(Map.Entry<String, String> m:map.entrySet()) {
			System.out.println("key: "+m.getKey()+" and value: "+m.getValue());
		}
	}

}
