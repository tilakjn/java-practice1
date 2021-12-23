package first;

public class inter2 {

	public static void main(String[] args) {
		vehicle v=new vehicle();
		System.out.println(v.canCarry(5));
		System.out.println(v.tuneUpCost());


	}

}
interface IVehicle{
	public double tuneUpCost();
	public boolean canCarry(int numPassengers);
}
class vehicle implements IVehicle{

	@Override
	public double tuneUpCost() {
		
		return 10000;
	}

	@Override
	public boolean canCarry(int numPassengers) {
		int x=numPassengers;
		if(x<=5) {
			return true;
		}
		else {
	    return false;
		}
	}
	
}