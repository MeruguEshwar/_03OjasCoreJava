package _14Interfaceexamples;

interface FirstOne{
	public void m1();
}

interface Second{
	public void m2();
}


public class InterfaceExa {

	public void m1() {
		System.out.println("First Interface method m1:");
	}
	
	public void m2() {
		System.out.println("Second Interface method m2:");
	}
	public static void main(String[] args) {
		InterfaceExa obj = new InterfaceExa();
		obj.m1();
		obj.m2();
	}

}
