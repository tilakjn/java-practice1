package first;

public class inter {

	public static void main(String[] args) {
		B b=new B();
		b.meth1();
		b.meth2();

	}

}
interface A{
	 void meth1();
	 void meth2();
}
class B implements A{

	@Override
	public void meth1() {
		System.out.println("method1");
		
	}

	@Override
	public void meth2() {
		System.out.println("method2");
	}
	
}