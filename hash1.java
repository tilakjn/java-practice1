package first;

import java.util.HashMap;
import java.util.Map;

public class hash1 {

	public static void main(String[] args) {
		HashMap<Integer,String> map=new HashMap<>();
		map.put(1,"Tilak");
		map.put(2,"abc");
		map.put(3, "xyz");
		map.put(4, "pqr");
	
		for(Map.Entry<Integer,String> m:map.entrySet()) {
			System.out.println("key: "+m.getKey()+" and value: "+m.getValue());
			
		}

	}

}
