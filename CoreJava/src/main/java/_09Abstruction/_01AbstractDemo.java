package _09Abstruction;

abstract class bike{
	public void color() {
		System.out.println("Red Colour");
	}
	
	public abstract void run();//abstract method
}
class ActiveHonda extends bike{
	public void run() {
		System.out.println("Good At Hyderbad Roads...");
	}
}

class Fz extends bike{
	public void run() {
		System.out.println("Feel Like Sports Bike...");
	}
}
public class _01AbstractDemo {

	public static void main(String[] args) {
		
		//Static type of creating Objects
		ActiveHonda ah = new ActiveHonda();
		ah.run();
		
		//Static type of creating Objects
		Fz f = new Fz();
		f.run();
		
		//dynamic type of creating Objects
		bike b = new ActiveHonda();
		b.run();
		b.color();
		
		//dynamic type of creating Objects
		bike b1 = new Fz();
		b1.run();
		b1.color();
	}

}
