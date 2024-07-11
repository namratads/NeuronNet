package com.arraydemo;

import java.util.Scanner;

public class ArrayArguInMethod {

	public int add(int[] x) {
		int result = 0;
		for (int i = 0; i < x.length; i++) {
			result = result+x[i];
		}
		return result;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Take any size for Array");
		int size = sc.nextInt();
		int[] arr = new int[size];
		System.out.println("Enter elements in Array");
		for (int i = 0; i < arr.length; i++) {
			arr[i]=sc.nextInt();
		}
		ArrayArguInMethod a = new ArrayArguInMethod();
		System.out.println(a.add(arr));
	}
}
