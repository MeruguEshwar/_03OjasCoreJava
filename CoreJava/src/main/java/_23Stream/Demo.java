package _23Stream;

import java.util.Scanner;

public class Demo {
		public static String values(int fnum,int lnum) {		
		String result = "";
		for (int i = fnum; i <= lnum; i++) {
			if (i % 2 == 0) {
				result += i + "," ;
			}
		}
		return result.substring(0,result.length()-1);
	}

	public static void main(String[] args) {
		int i, fnum, lnum;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter frt Num:");
		fnum = sc.nextInt();

		System.out.println("Enter Sec Num:");
		lnum = sc.nextInt();
		System.out.println(values(fnum,lnum));
	
	}

}
