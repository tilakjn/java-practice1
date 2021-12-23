package first;

public class structure3 {

	public static void main(String[] args) {
		area a=new area(6);
		area a2=new area(6,6);
		area a3=new area(6.52,6.52);
		System.out.println(a.s);
		System.out.println(a2.s1);
		System.out.println(a3.s2);
		

	}

}
class area{
	int s,s1;
	double s2;
	area(int x){
	this.s=x*x;
	}
	area(int x,int y){
		this.s1=x*y;
	}
	
	public area(double d, double e) {
		this.s2=3.14*d*e;
	}
	
}
