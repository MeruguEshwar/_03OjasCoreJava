package _17ExceptionHandling;
class EshwarException extends RuntimeException{
	EshwarException(String msg){
		super(msg);
	}
}
public class _04Assignment1 {
	
	public static void Airthematic() {
		//System.out.println(10/0);
		throw new EshwarException("Eshwar Airthematic Exception ");
	}
	

	public static void NullPointer() {
//		String s1 = null;
//		System.out.println(s1.length());
		throw new EshwarException("Eshwar Null Pointer Exception ");
	}
	
	public static void IndexOutOfBound() {
		int ar[] = {10,20,30,40,50};
		System.out.println(ar[7]);
		throw new EshwarException("Eshwar Array Index Out Of Bound Exception ");

	}
	
	
	public static void main(String[] args) {
		try {
			
			try {
				System.out.println(10/0);
			}catch(Exception e) {
				System.out.println(e.toString());
			}
			System.out.println(10/0);
		}catch(ArithmeticException e) {
			System.out.println("Exception caught");
			e.printStackTrace();
		}catch(Exception a) {
			System.out.println(a.getMessage());
		}finally {
			System.out.println("Final block Irrespective of Exceptions it will excute");
		}
		System.out.println("Normal Flow");
		
		_04Assignment1 obj = new _04Assignment1();
		obj.IndexOutOfBound();
		obj.NullPointer();
		
		//obj.nani();
	}
}
