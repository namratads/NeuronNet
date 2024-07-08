package com.starpattern;

import java.util.Scanner;

public class NumberTraingle {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("Take any number for line");
		int num = sc.nextInt();
		for (int i = 1; i <=num; i++) {
			int n = 1;
			for (int j = num-i; j>0; j--) {
				System.out.print(" ");
			}
			for (int j = 1; j <=i; j++) {
				System.out.print(n+" ");
				n++;
			}
			System.out.println();
		}
	}
}
