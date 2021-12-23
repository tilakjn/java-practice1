package first;

public class change {
	static int i=90;
	void changeVariable() {
		
		i=100;
	}

	public static void main(String[] args) {
		change obj1=new change();
		change obj2=new change();
		change obj3=new change();
		
		obj1.changeVariable();
		System.out.println(obj1.i);
		System.out.println(obj2.i);
		System.out.println(obj3.i);
		
		
	}

}
