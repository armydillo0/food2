package meal;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public abstract class Food {
	//TOTALLY NOT DONE TOTALLY HAVE NO IDEA WHAT I'M DOING
	//WANT TO CREATE AN ARRAYLIST OF TYPE FOOD BUT I DON'T KNOW ANYTHING ABOUT INHERITANCE/BASE CLASSES/etc
    //I'M NOT DONE!!!! I'm like 65% done sorry PLZ Don't TOUCH
	//WAIT FOR ME I DIDN'T WRITE THE MOST IMPORTATANT METHOD YET WHICH IS THE CALORIE SUMMING ONE
	

	public static void main (String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("How many tomatoes will you add?");
		int numTom = scan.nextInt();
		System.out.println("How many onions will you add?");
		int numOni = scan.nextInt();
		scan.close();
		

		List<Food> foodList = new ArrayList<Food>();
		
		//creating tomatoes and onions as foods
		for (int i = 0; i < numTom; i++) {
			Tomato tom = new Tomato();
			foodList.add(tom);//???have to work out what gets roasted/fried/sauced 
		}for (int i = 0; i < numOni; i++) {
			Onion oni = new Onion();
			foodList.add(oni);
		}
		System.out.println(foodList);
		
		

		//pass list of food objects and give its calorie sum

	}

}

