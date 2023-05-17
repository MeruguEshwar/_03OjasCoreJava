package arrayspractise;

import java.util.Scanner;

public class Demo {
	
	static Scanner sc = new Scanner(System.in);
	static int size; 
	static int arr[];
	
	public static void arrfill() {
		System.out.println("Enter array size..");
		size = sc.nextInt();
		arr = new int[size];
		System.out.println("Enter array ele..");
		for(int i=0;i<arr.length;i++) {
			arr[i] = sc.nextInt();
		}
		for(int a:arr) {
			System.out.println("Array ele are:"+a);
		}
	}

	public static void sum() {
		int sum=0;
		for(int b:arr) {
			sum += b;
		}
		System.out.println("Array of sum is:"+sum);
	}
	
//	public static void average() {
//		int avg=0;
//		for(int b:arr) {
//			avg += b;
//		}
//		System.out.println("Array of sum is:"+avg);
//	}

	public static void main(String[] args) {
		arrfill();
		sum();
		
	}
}
