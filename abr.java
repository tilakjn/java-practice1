package first;

public class abr {
	

	public static void main(String[] args) {
		class Dog extends Animal{
			void makeSound() {
			System.out.println("dog will barks");
			}
			}

		Dog d=new Dog();
		d.eat();
		d.makeSound();

	}

}

abstract class Animal {
abstract void makeSound();
public void eat() {
System.out.println("Animals will eat"); 
}
}


