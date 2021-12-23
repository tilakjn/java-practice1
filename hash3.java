package first;

import java.util.HashMap;
import java.util.Map;

public class hash3 {

	public static void main(String[] args) {
HashMap<String,Integer> map3=new HashMap<>();
		
		map3.put("colo1",30);
		map3.put("colo2", 60);
		map3.put("colo3",90);
		
		for(Map.Entry<String,Integer> n:map3.entrySet()) {
			System.out.println("key: "+n.getKey()+" and value: "+n.getValue());
		}

	}

}
