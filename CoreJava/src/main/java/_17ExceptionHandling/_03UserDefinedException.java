package _17ExceptionHandling;

import java.util.Scanner;
class TayotaException extends RuntimeException{
	TayotaException(String msg){
		super(msg);
	}
}
public class _03UserDefinedException {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Your age:");
		int age = sc.nextInt();
		if(age<18) {
			throw new TayotaException("You have to wait some more time...");
		}
	}

}
