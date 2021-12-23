package first;

import java.util.ArrayList;

public class list2 {

	public static void main(String[] args) {
		
		ArrayList<Integer> list=new ArrayList<>();
		list.add(10);
		list.add(20);
		
		for(Integer x:list) {
			System.out.println(x);
		}
	}

}
