package com.syntax.class8;

public class HW1Clock {

	public static void main(String[] args) {
		for(int hour1=0; hour1<=2; hour1++) {
			for(int hour2=0; hour2<=9; hour2++) {
				if(hour1==2 && hour2==4) {
					break;
				}
				for(int minute1=0; minute1<=5; minute1++) {
					for(int minute2=0; minute2<=9; minute2++) {
						System.out.println(hour1+""+hour2+":"+minute1+""+minute2);
					}
				}
			}
		}

	}

}
