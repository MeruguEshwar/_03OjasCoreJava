package _12MethodOverRiding;

class CentralGovt{
	public void tax(){
		System.out.println("Central Govt Tax");
	}
}

class StateGovt extends CentralGovt{
	public void tax(){
		System.out.println("Central Govt Tax + State Govt Tax");
	}
}
public class OverRidingExample {
	
	public static void main(String[] args) {
	
		CentralGovt cg = new StateGovt();
		cg.tax();
	}

}
