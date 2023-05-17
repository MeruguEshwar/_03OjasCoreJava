package _14Interfaceexamples;

interface first{
	public void m1();
	
	default void m3(){
		System.out.println("This method refers to m3:");
	}
	
	static void m4(){
		System.out.println("This method refers to m4:");
	}
}

public class Example {
	
	
	public static void main(String[] args) {
		first frt = new first() {
			public void m1() {
				System.out.println("This method is m1:");
			}
		};
	frt.m1();
	frt.m3();
	first.m4();
	}

}
