package com.starpattern;

import java.util.Scanner;

public class CharacterTrainglePattern {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("Take any number for line");
		int num = sc.nextInt();
//		System.out.println("Enter any Character");
//		char ch = sc.next().charAt(0);
		for (int i = 1; i <=num; i++) {
			char ch = 'a';
			for (int j = num-i; j>0; j--) {
				System.out.print(" ");
			}
			for (int j = 1; j <=i; j++) {
				System.out.print(ch+" ");
				ch++;
			}
			System.out.println();
		}
	}
}
