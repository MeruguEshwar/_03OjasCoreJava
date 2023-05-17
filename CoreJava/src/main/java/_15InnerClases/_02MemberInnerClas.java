package _15InnerClases;

public class _02MemberInnerClas {
	private int data=10;
	class Inner{
		public void add() {
			System.out.println("Add Method is called and value is:"+data);
		}
	}
	
	public void show() {
		Inner in = new Inner();
		in.add();
	}
	public static void main(String[] args) {
		_02MemberInnerClas mi = new _02MemberInnerClas();
		mi.show();
		System.out.println("Main method is called:");
	}

}
