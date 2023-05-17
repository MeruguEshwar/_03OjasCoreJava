package _22RegularExpressions;

import java.util.Scanner;
import java.util.regex.Pattern;

public class RegularExpreesion {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in); 
		System.out.println("enter the string"); 
		String strinOne=sc.next();
		
		System.out.println("enter the Pattern"); 
		String stringTwo=sc.next();
		
		System.out.println(Pattern.matches(stringTwo,strinOne));
	}
}
