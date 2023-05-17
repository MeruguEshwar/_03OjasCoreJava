package _17ExceptionHandling;
//finally block
//Irrespective code that can be excute the final block
public class _02FinallyBLock {
	public static void main(String[] args) {
		try {
			System.out.println("Frt Line");
			System.out.println(10/0);
			System.out.println();
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			System.out.println("Finally block...");
		}System.out.println("Normal Statment....");
	}
}
