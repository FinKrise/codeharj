package fizzbuzz;

import java.util.Iterator;

public class fizzbuzz {

	public static void main(String[] args) { //tulostaa laskettavat rivit
		
		int length = 30; //Tulostettavien rivien m‰‰r‰
		long a = 0, b = 1, sum = 0; //kaksi muuttujaa ja niiden summa m‰‰ritettyn‰ ennen for looppia
		
		for (int i = 0; i <= length ; i++) {
			sum = a + b; // muuttaa sum muuttujan arvoksi a:n ja b:n summan
			
			System.out.println(Getfizzbuzz(sum));
			a = b;
			b = sum;
		}
	}
	static String Getfizzbuzz(long value) { //Tarkistaa sum muuttujan arvon jakamalla sen 3 ja 5:n kaa
		
		if (((value % 5) == 0) && ((value % 3) == 0)) //testaa onko valuen jaettavissa tasan sek‰ 5:n ett‰ 3:n kaa
			return "FizzBuzz";
		else if (((value % 5) == 0)) //testaa onko valuen jaettavissa tasan 5:n kaa
			return "Buzz";
		else if (((value % 3) == 0)) //testaa onko valuen jaettavissa tasan 3:n kaa
			return "Fizz";
		
		return value + ""; // Palauttaa valuen sek‰ siihen kuuluvan jakoj‰‰nnˆksen avainsanan
	}
}