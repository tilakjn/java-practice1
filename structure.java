package first;

public class structure {

	public static void main(String[] args) {
	employee e=new employee("Tilak","113");
	System.out.println(e.getDetails());
	}

}
class employee{
	String name,id;
	employee(String x,String y){
		name=x;
		id=y;
		
	}
	String getDetails(){
		return name+" "+id;
	}
	
}
