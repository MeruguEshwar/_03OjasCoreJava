package _11MethodOverLoading;

public class OverLoadingExample {
	public int add(int i,int j) {
		return i+j;
	}
	
	public int add(int i,int j,int k) {
		return i+j+k;
	}
	
	public static void main(String[] args) {
		OverLoadingExample ole = new OverLoadingExample();
		
		System.out.println("Reffers to first add Method="+ole.add(10,20));
		System.out.println("Reffers to Second add Method="+ole.add(10,20,30));
	}
}
