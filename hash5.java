package first;

import java.util.HashMap;
import java.util.Map;

public class hash5 {

public static void main(String[] args) {
		
		HashMap<String,emp> map=new HashMap<>();
		emp b1=new emp("abc",25000,150);
		emp b2=new emp("xyz",30000,200);
		map.put("emp1",b1);
		map.put("emp2",b2);
		
		for(Map.Entry<String,emp> n:map.entrySet()) {
			System.out.println("key: "+n.getKey()+" and value: "+n.getValue().name+" "+n.getValue().salary+" "+n.getValue().id);
		}
	}

}
class emp{
	String name;
	Integer salary,id;
	public emp(String name, Integer salary, Integer id) {
		super();
		this.name = name;
		this.salary = salary;
		this.id = id;
	}
	
	
	
	}
	
