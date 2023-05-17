package _21MultiThreading;

public class _01Test {

	public static void main(String[] args) {
		System.out.println(Thread.currentThread().getName());
		Thread.currentThread().setName("Pandu");
		System.out.println(Thread.currentThread().getName());
	}

}
