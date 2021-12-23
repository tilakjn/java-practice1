package first;

import java.util.ArrayList;

public class list5 {

	public static void main(String[] args) {
		ArrayList<studentt> list=new ArrayList<>();
		 studentt s1=new studentt("tilak",100,100,100);
		 studentt s2=new studentt("xyz",100,100,100);
		 list.add(s1);
		 list.add(s2);
		 
		 for(studentt x:list) {
			 System.out.println(x.name+" "+x.m1+" "+x.m2+" "+x.m3);
		 }
	}

}

class studentt{
	String name;
	int m1,m2,m3;
	public studentt(String name, int m1, int m2, int m3) {
		super();
		this.name = name;
		this.m1 = m1;
		this.m2 = m2;
		this.m3 = m3;
	}
	
	
}