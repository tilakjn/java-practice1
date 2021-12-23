package first;

public class student {
	String name;
	int rollno;
	void setName(String x) {
		name=x;
	}
	void setRollno(int y) {
		rollno=y;
	}
	String getName() {
		return name;
	}
	int getRollno() {
		return rollno;
	}

	public static void main(String[] args) {
		student s=new student();
		
		s.setName("Tilak");
		s.setRollno(113);
		System.out.println(s.getName());
		System.out.println(s.getRollno());
		
		

	}

}
