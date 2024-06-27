package com.ts;

import java.util.Scanner;

public class specificNumInArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Take any size of Array");
		int size = sc.nextInt();
		int count = 0;
		int[] arr = new int[size];
		System.out.println("Take any number");
		int num = sc.nextInt();
		for (int i = 0; i <arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
		for (int i = 0; i < arr.length;i ++) {
			if(arr[i]==num) {
				count++;
			}
		}
		System.out.println(num+" Occured "+count+" times ");
	}
}
