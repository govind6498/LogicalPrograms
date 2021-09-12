package com.bridgelabz.logicalprograms;

public class PrimeNumber {
	public static void main(String[] args) {
		int Number=11;
		int count=0;
		if(Number>=2) {
			for(int i=2;i<Number;i++) {
				if(Number%2==0) {
					count++;
				}
			}
			if(count==0) {
				System.out.println(Number+" is Prime Number");
			}
			else {
				System.out.println(Number+" is Not Prime Number");
			}
		}
		else {
			System.out.println("Please Enter Number greater or equal to 2");
		}
	}
}
