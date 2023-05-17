package _15InnerClases;

public class _04StaticCls {
	static int data = 10;
	static class InnerCls{
		public static void m1() {
			System.out.println("Hello");
		}
	}
	
	public static void main(String[] argv) {
		InnerCls.m1();
	}
}
