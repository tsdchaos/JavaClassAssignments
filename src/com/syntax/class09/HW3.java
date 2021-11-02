package com.syntax.class09;
import java.util.Arrays;
public class HW3 {

	public static void main(String[] args) {
		double doubVal[] = {23.5, 65.1, 10.53, 9.43, 5.2, 19.54};
		System.out.println("Array printed in reverse order by position");
		for(int n=(doubVal.length)-1; n>=0; n--) {
			System.out.print(doubVal[n]+" ");
		}
		System.out.println();
		Arrays.sort(doubVal);
		System.out.println("Array printed in reverse order by value");
		for(int n=(doubVal.length)-1; n>=0; n--) {
			System.out.print(doubVal[n]+" ");
		}
		
	}

}
