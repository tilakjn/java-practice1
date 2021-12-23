package first;

import java.util.ArrayList;

public class list4 {

	public static void main(String[] args) {
       ArrayList<res> li=new ArrayList<>();
        res r1=new res("java",9);
		li.add(r1);
		res r2=new res("android",9);
		li.add(r2);
		
		for(res x:li) {
			System.out.println(x.subject+" "+x.marks);
		
		}
		System.out.println(li.isEmpty());	
		li.remove(1);
		for(res x:li) {
			System.out.println(x.subject+" "+x.marks);
		
		}
	}
}

class res{
	String subject;
	int marks;
	public res(String subject, int marks) {
		//super();
		this.subject = subject;
		this.marks = marks;
	}
	
}