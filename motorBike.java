package first;
import java.util.Scanner;
abstract class motorBike {
	public static void main(String a[]) {
		Bike b=new Bike();
		b.brake();
		}

		abstract void brake();
		}

        class Bike extends motorBike {
		Scanner sc=new Scanner(System.in);
		int velocity;
		void brake() {
		System.out.println("enter the velocity");
		velocity=sc.nextInt();
		if (velocity==0) {
		System.out.println("break applied");
		}
		else {
		System.out.println("bike moves");
		}
		}
		
}
