package _17ExceptionHandling;

public class _05Assignment1Part2 {
	public static void main(String[] args) {
		try {
			System.out.println(10/0);
		}finally {
			System.out.println("Final Block..");
		}
	}
}
