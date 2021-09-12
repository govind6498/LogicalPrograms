package com.bridgelabz.logicalprograms;

public class Reverseanumber {
	public static void main(String[] args) {
		int Number=12301;
		int ReverseNumber=0;
		System.out.println("Before Reverse,Number is:"+Number);
		while(Number>0) {
			int remainder=Number%10;
			ReverseNumber=ReverseNumber*10+remainder;
			Number/=10;
		}
		System.out.println("After Reverse, Number is:"+ReverseNumber);
	}
}
