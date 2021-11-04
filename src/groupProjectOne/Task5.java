package groupProjectOne;

public class Task5 {
	public static void main(String[] args) {
		
		String[] countries = { "Japan", "France", "Italy", "United States of America" };
		String capital = null;
		for (String coun : countries) {
			switch (coun) {
			case "Japan":
				capital = "Tokyo";
				break;
			case "France":
				capital = "Paris";
				break;
			case "Italy":
				capital = "Rome";
				break;
			case "United States of America":
				capital = "Washington D.C";
				break;
			default:
			}
			System.out.println(coun + "--->> " + capital);
		};
		System.out.println("---------------------------------------------------------------");
		
		
		for (int i=0;i<countries.length;i++) {
			
			
			switch (countries [i]) {
			case "Japan":
				capital = "Tokyo";
				break;
			case "France":
				capital = "Paris";
				break;
			case "Italy":
				capital = "Rome";
				break;
			case "United States of America":
				capital = "Washington D.C";
				break;
			default:
				
			}
			System.out.println(countries[i]+" = "+capital);
		}
	}
}
