package com.arraydemo;

import java.util.Scanner;

public class DescendingArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Take any size of Array");
		int size = sc.nextInt();
		System.out.println("Enter any elements in Array : ");
		int[] arr = new int[size];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		int temp = 0;
		for (int i = 0; i < arr.length; i++) {
			for (int j = i+1; j < arr.length; j++) {
				if(arr[i]<arr[j]) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		System.out.println("Descending Array");
		for (int j2 = 0; j2 < arr.length; j2++) {
			System.out.print(arr[j2]+" ");
		}
	}
}
