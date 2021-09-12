package com.bridgelabz.logicalprograms;

public class PerfectNumber {
	public static void main(String[] args) {
		int Number=28;
		int SumOfFector=0;
		for(int i=1;i<Number;i++) {
			if(Number%i==0) {
				SumOfFector+=i;
			}
		}
		if(SumOfFector==Number) {
			System.out.println(Number+" is Perfect Number");
		}
		else {
			System.out.println(Number+" is not Perfect Number");
		}
	}
}
