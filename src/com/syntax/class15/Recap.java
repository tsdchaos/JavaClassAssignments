package com.syntax.class15;

public class Recap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="This is Lubo. Lubo is break manager.";
		System.out.println(str.replace("Lubo", "Sorbon"));
		System.out.println(str.replaceAll("Lubo",  "Sorbon"));
		String str2="khfsafhsdAKSFHJ213@&$*&%";
		System.out.println(str2.replaceAll("[^A-Za-z0-9]", ""));
		System.out.println(str2.replace("[^A-Za-z0-9]", "")); //replace method looks for whatever is in the "". It doesn't search a range. It is literal
		StringBuilder stringBuilder=new StringBuilder(); //SB is mutable and is easily modified
		for(int i=0; i<5; i++) { //always use SB when you have to change the value of a String variable
			stringBuilder.append(i); //use append with SB to add on to the StringBuilder
		}
		System.out.println(stringBuilder);
		//stringBuilder.compareTo(); //used similar to .equals() for String
		String str3="Me: Look it's not you it's me, I just have some thing i need to work out\r\n"
				+ "Eclipse: But we had good times didn't we? I can be better just tell me what i can do?\r\n"
				+ "Me: Please don't make this harder than it has to be, we are just moving in 2 different directions.\r\n"
				+ "Eclipse: Who is she? Does she treat u better than me?\r\n"
				+ "Me: She does what u do but more, She also does sting builder correctly (door closes, faint sound of steps walking away)";
		
		StringBuilder strBuilder=new StringBuilder(str3); //converts the String to a StringBuilder (now called strBuilder)
		strBuilder.reverse();
		System.out.println(strBuilder);
		
	}

}
