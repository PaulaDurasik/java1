
public class Sroda {

	public static void main(String[] args) {
		int[] tab = { 1, 3, 5, 7, 8, -3 };
		int[] tabTwo = { 13, 3, 14, -3, 15, 176 };
		int search = -5;
		
		
		Zad0 z0 = new Zad0();
		Zad1 z1 = new Zad1();
		Zad2 z2 = new Zad2();
	
		/* wywolanie 0 zadania */
		//System.out.println( z0.indexOf(tab, search) );
		
		/* wywolanie 1 zadania */
		//System.out.println( z1.checkForDuplicatesOtherWay(tab, tabTwo) );
		
		/* wywolanie 2 zadania */
		//z2.showDuplicateNumbers(tab, tabTwo);
		//z2.showNotDuplicateNumbers(tab, tabTwo);
		
		
		
		/*
		String myVar = "pa wel czesc";
		String[] myVarArray = myVar.split(" ");
		for(int i = 0; i < myVarArray.length; i++) {
			System.out.println(i + " | " + 
						myVarArray[i].substring(0, 1));
		}
		myVar = myVar.replace(" ", "_");
		System.out.println(myVar);
		*/
		/*
		String myStr = "oksymoron";
		Zad3 z3 = new Zad3();
		System.out.println(z3.replaceCharacter(myStr));
		*/
		/*
		Zad4 z4 = new Zad4();
		z4.printNumbersByLength("mis koala hasa w lesie", 3);
		
		Zad5 z5 = new Zad5();
		System.out.println(z5.changeCharacters("pawe³"));
		Zad6 z6 = new Zad6();
		System.out.println(z6.reverseWord("Plik"));
		Zad7 z7 = new Zad7();
		z7.printNumbersNotDividedBy(20);
		
		
		Zad8 z8 = new Zad8();
		z8.printAdressess("Algorytmiczna", 4);
		
		
		Zad9 z9 = new Zad9();
		System.out.println(z9.isPalindrome("kobyla ma maly bok"));
		
		Zad10 z10 = new Zad10();
		
		z10.printPrimeNumbers(15);
		*/
		Zad11 z11 = new Zad11();
		z11.translateNumber(111); 
		
		Zad12 z12 = new Zad12();
		System.out.println(z12.countEars(7));
	}

}
