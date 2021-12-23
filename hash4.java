package first;

import java.util.HashMap;
import java.util.Map;

public class hash4 {

	public static void main(String[] args) {
		
		HashMap<String,books1> map=new HashMap<>();
		books1 b1=new books1("hhh",123,150);
		books1 b2=new books1("ydty",153,200);
		map.put("book11",b1);
		map.put("book12",b2);
		
		for(Map.Entry<String,books1> n:map.entrySet()) {
			System.out.println("key: "+n.getKey()+" and value: "+n.getValue().bname+" "+n.getValue().id+" "+n.getValue().price);
		}
	}

}
class books1{
	String bname;
	Integer id,price;
	public books1(String bname, Integer id, Integer price) {
		super();
		this.bname = bname;
		this.id = id;
		this.price = price;
	}
	
	
	}
	
