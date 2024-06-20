package com.ts;

import java.util.Scanner;

public class ReverseWord {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Take any Sentence");
		String sentence = sc.nextLine();
		String[] strArr = sentence.split(" ");
		for (int i = 0; i < strArr.length; i++) {
             char[] chArr = strArr[i].toCharArray();
             for (int j =chArr.length-1; j>=0 ; j--) {
                  System.out.print(chArr[j]);
             }System.out.print(" ");
		}
	}
}
