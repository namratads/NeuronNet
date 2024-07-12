package com.arraydemo;

import java.util.Scanner;

public class RemoveDupInUnsortArrayWithoutCollection {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Take any size for Array");
	int size = sc.nextInt();
	int[] arr = new int[size];
	System.out.println("Enter elements in Array");
	for (int i = 0; i < arr.length; i++) {
		arr[i]=sc.nextInt();
	}
	System.out.println("Sort Array");
	int temp = 0;
	for (int i = 0; i < arr.length; i++) {
        for (int j = i+1; j < arr.length; j++) {
			if(arr[i]>arr[j]) {
				temp=arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
			}
		}
        System.out.print(arr[i]+" ");
	}
	System.out.println();
	int j = 0;
	 for (int i = 0; i < arr.length-1; i++) {
		   if(arr[i] != arr[i+1]) {
			   arr[j]=arr[i];
			   j++;
		   }
		}
      arr[j] = arr[arr.length-1];
      System.out.println("Duplecate remove Array");
      for (int k = 0; k <j+1; k++) {
      	System.out.print(arr[k]+" ");
      }}
}
