package first;

public class change2 {
	int i=90;
	void changeVariable() {
		
		i=100;
	}

	public static void main(String[] args) {
		change2 obj1=new change2();
		change2 obj2=new change2();
		change2 obj3=new change2();
		
		obj1.changeVariable();
		System.out.println(obj1.i);
		System.out.println(obj2.i);
		System.out.println(obj3.i);
		
	}


}
