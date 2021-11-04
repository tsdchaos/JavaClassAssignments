package com.syntax.class11;

public class DogTester {

	public static void main(String[] args) {
		dog alansDog=new dog(); 
		/*when you write the name of the class with no import statement
		* If it exists in the same package, you do not need to import it
		* if there is no import statement, java will check the package and searc for classes
		* with the class name
		*/
		// the variables also get transferred with the class
		alansDog.name="Jake";
		alansDog.breed="Labrador";
		alansDog.color="Black";
		alansDog.height=2.5;
		alansDog.age=10;
		alansDog.gender='M';
		System.out.println("My dogs name is "+alansDog.name);
		System.out.println("His breed is "+alansDog.breed);
		System.out.println("He is a "+alansDog.color+" dog");
		System.out.println("He is "+alansDog.height+" feet tall");
		System.out.println("He is "+alansDog.age+" years old");
		System.out.println("His gender is "+alansDog.gender);
		
		dog jacksDog = new dog(); 
		jacksDog.name="Elwood";
		jacksDog.breed="Husky";
		jacksDog.color="White";
		jacksDog.height=3.75;
		jacksDog.age=8;
		jacksDog.gender='M';
		System.out.println("My dogs name is "+jacksDog.name);
		System.out.println("His breed is "+jacksDog.breed);
		System.out.println("He is a "+jacksDog.color+" dog");
		System.out.println("He is "+jacksDog.height+" feet tall");
		System.out.println("He is "+jacksDog.age+" years old");
		System.out.println("His gender is "+jacksDog.gender);
	}

}
