package _15InnerClases;

public class _03MethodInner {
	
	public void  methodInnercls() {
		class nani{
			public void m1() {
				System.out.println("Method Inner cls..");
			}
		}
		nani na = new nani();
		na.m1();
	}
	
	public static void main(String[] args) {
		_03MethodInner met = new _03MethodInner();
		met.methodInnercls();
	}

}
