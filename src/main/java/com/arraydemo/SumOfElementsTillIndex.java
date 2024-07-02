package com.arraydemo;

import java.util.Scanner;

public class SumOfElementsTillIndex {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Take any size ");
		int size = sc.nextInt();
		System.out.println("Enter Elements in Array");
		int[] arr = new int[size];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println("Take any Index of Array");
		int index = sc.nextInt();
		int sum = 0;
		for (int i = 0; i <=index; i++) {
			sum += arr[i];
		}
		System.out.println("Sum of Elements till Index : "+sum);
	}
}
