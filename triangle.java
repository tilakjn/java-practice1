package first;

public class triangle {

	public static void main(String[] args) {
		tri t=new tri();
		System.out.println(t.ar);
		System.out.println(t.per);
	}

}
class tri{
	double a=3,b=4,c=5,p,ar,per;
	tri(){
		p=(a+b+c)/2;
		ar=Math.sqrt(p*(p-a)*(p-b)*(p-c));
		per=a+b+c;
	
	}
}
