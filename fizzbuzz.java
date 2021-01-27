import java.util.Iterator;

public class Main {

	public static void main(String[] args) { //tulostaa laskettavat rivit
		
		int length = 30; //Tulostettavien rivien määrä
		long a = 0, b = 1, sum = 0; //kaksi muuttujaa ja niiden summan muuttujat määritettynä ennen for looppia
		
		for (int i = 0; i <= length ; i++) {
			sum = a + b; // muuttaa sum muuttujan arvoksi a:n ja b:n summan
			
			System.out.println(Getfizzbuzz(sum)); //Tulostetaan toisesta metodista kyseiselle luvulle saavutettu tulos
			a = b;
			b = sum;
		}
	}
	static String Getfizzbuzz(long value) { //Metodi, joka tarkistaa sum muuttujan arvon jakamalla sen 3:n ja 5:n kaa
		
		if (((value % 5) == 0) && ((value % 3) == 0)) //testaa onko valuen jaettavissa tasan sekä 5:n että 3:n kaa
			return "FizzBuzz";
		else if (((value % 5) == 0)) //testaa onko valuen jaettavissa tasan 5:n kaa
			return "Buzz";
		else if (((value % 3) == 0)) //testaa onko valuen jaettavissa tasan 3:n kaa
			return "Fizz";
		
		return value + ""; // Palauttaa valuen sekä siihen kuuluvan avainsanan jos sellainen pystytään määrittämään
	}
}
