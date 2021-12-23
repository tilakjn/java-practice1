package first;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.ListIterator;

public class hash7 {

	public static void main(String[] args) {
		HashMap<Integer, String> hash_map = new HashMap<Integer, String>();
		ArrayList<Integer> al = new ArrayList<>();

		al.add(10);
		al.add(20);
		al.add(30);
		al.add(1);
		al.add(2);
		System.out.println(al);
		ListIterator i=al.listIterator();
		while(i.hasNext())
		{
		System.out.println(i.next());
		}
		while(i.hasPrevious()) {
		System.out.println(i.previous());
		}
	}

}
