package _08Inheritance;

class A{
	public void m1() {
		System.out.println("This class from A and m1 method:");
	}
}

class B extends A{
	public void m2() {
		System.out.println("This class from B and m2 method:");
	}
}
public class _01InheritanceExapmle {
	public static void main(String[] args) {
		B obj = new B();
		obj.m1();
		obj.m2();
	}
}
