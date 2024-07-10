package com.arraydemo;

import java.util.Scanner;

public class PrimeMethod {

	public boolean isPrime(int number) {
		int count = 1;
		for (int i = 2; i <number ; i++) {
			if(number%i==0) {
				count++;
			}
		}
		if(count>2) {
			return false;
		}else {
			return true;
		}
	}
	public static void main(String[] args) {
		PrimeMethod m = new PrimeMethod();
		Scanner sc = new Scanner(System.in);
		System.out.println("Take any number");
		int num = sc.nextInt();
		System.out.println(m.isPrime(num));
	}
}
