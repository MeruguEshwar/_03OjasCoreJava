package _01BasicPrograms;
import java.util.Scanner;

public class _18Farenhit {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter farenhit:");
		double f=sc.nextDouble();
		
		double res = (f-32)*5/9;
		
		System.out.println(res);
	}

}
