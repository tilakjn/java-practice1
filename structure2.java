package first;

public class structure2 {

	public static void main(String[] args) {
		car c=new car("tata",12);
		System.out.println(c.getDetails());
	}

}
class car{
	String brandname;
	int price;
	car(String x,int y){
		brandname=x;
		price=y;
		
	}
	String getDetails(){
		return brandname+" "+price;
	}
}