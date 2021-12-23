package first;

import java.util.HashMap;
import java.util.Map;

public class hash6 {

public static void main(String[] args) {
		
		HashMap<String,teacher> map=new HashMap<>();
		teacher b1=new teacher("abc",123,12);
		teacher b2=new teacher("xyz",153,11);
		map.put("teacher1",b1);
		map.put("teacher2",b2);
		
		for(Map.Entry<String,teacher> n:map.entrySet()) {
			System.out.println("key: "+n.getKey()+" and value: "+n.getValue().name+" "+n.getValue().id+" "+n.getValue().clas);
		}
		
		System.out.println(map.size());
		System.out.println(map.isEmpty());
		System.out.println(map.keySet());
		System.out.println(map.containsKey(b1));
		//System.out.println(map.get(b1 teacher1));
		map.replace("teacher1",b2);
		
		
		for(Map.Entry<String,teacher> n:map.entrySet()) {
			System.out.println("key: "+n.getKey()+" and value: "+n.getValue().name+" "+n.getValue().id+" "+n.getValue().clas);
		}
		
		map.remove("teacher1");
		for(Map.Entry<String,teacher> n:map.entrySet()) {
			System.out.println("key: "+n.getKey()+" and value: "+n.getValue().name+" "+n.getValue().id+" "+n.getValue().clas);
		}
		
		map.clear();
		System.out.println(map.isEmpty());
		
	}

}
class teacher{
	String name;
	Integer id,clas;
	public teacher(String name, Integer id, Integer clas) {
		super();
		this.name = name;
		this.id = id;
		this.clas = clas;
	}
	
	
	
	}
	