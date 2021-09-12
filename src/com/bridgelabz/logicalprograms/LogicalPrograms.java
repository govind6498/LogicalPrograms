package com.bridgelabz.logicalprograms;

public class LogicalPrograms {
	public static void main(String[] args) {
		int Number=10;
		int PreviousNumber=0;
		int NextNumber=1;
		for(int i=0;i<Number;i++) {
			System.out.print(PreviousNumber+" ");
			NextNumber=NextNumber+PreviousNumber;
			PreviousNumber=NextNumber-PreviousNumber;		
		}

	}
}
