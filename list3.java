package first;

import java.util.ArrayList;

public class list3 {

	public static void main(String[] args) {
		
		ArrayList<Employee> list=new ArrayList<>();
		
		Employee e1=new Employee(111,"xyz");
		list.add(e1);
		list.add(new Employee(112,"abc"));
		Employee e2=new Employee(113,"pqr");
		list.add(e2);
		
		for(Employee x:list) {
			System.out.println(x.id+" "+x.name);
		}
		
	}

}

class Employee{
	int id;
	String name;
	public Employee(int id, String name) {
		//super();
		this.id = id;
		this.name = name;
	}
	
}