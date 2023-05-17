package _04Arrays;

import java.util.Scanner;

public class _09RemoveDuplicates {

	public static void main(String[] args) {

		System.out.println("Enter the array size");
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();

		System.out.println("Enter the array ele are:");
		int arr[] = new int[size];
		for (int i = 0; i < size; i++) {
			arr[i] = sc.nextInt();
		}

		for (int a : arr) {
			System.out.println(a);
		}

		int temp;
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if(arr[i]>arr[j]) {
					temp  =  arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
					
				}
			}
		}
		
		System.out.println("After Sort the arrays is:");
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
		
		int nani=0;
		for(int i=1;i<arr.length-13
				;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]==arr[j]) {
					nani = arr[i];
					System.out.println("duplicate ele"+nani);
				}
			}
		}
		
		
		
	}

}
