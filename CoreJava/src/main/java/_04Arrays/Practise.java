package _04Arrays;

import java.util.Scanner;

public class Practise {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the array size...");
		int size = sc.nextInt();
		
		System.out.println("Enter the array values....");
		int arr[] = new int[size];
		
		for(int i=0;i<size;i++) {
			arr[i] = sc.nextInt();
		}
		
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
		
		int temp=0;
		System.out.println("After Sorting of arrays..");
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]>arr[j]) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}				
			}
		}
		
		for(int a:arr) {
			System.out.println(a);
		}

	}

}
