package meal2;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.*;

// The blender i put stuff inside
// and it tells me how many calories! Great!
public class Blender {
	
	
  public static int sumCal(ArrayList<Food> list) {
    int calories = 0;
    for ( Food yumyum : list) {
    	calories += yumyum.getCal();
    }return calories;
  }
  
  public static int sumWeight(ArrayList<Food> list) {
	  int weight = 0;
	  for (Food yopyop : list) {
		  weight += yopyop.getWeight();
	  }return weight;
  }

  public static void main (String[] args) {
	System.out.println("Before we begin, please note to respond to questions with single word answers. Thank you.");

    ArrayList <Food> foodList = new ArrayList <Food> ();
    Map <String, Integer> foodIndex = new HashMap <String, Integer> ();
    
    Scanner scan = new Scanner(System.in);
    System.out.println("How many tomatoes will you add?");
    int numTom = scan.nextInt();
    Integer intTom = new Integer(numTom);
    if (numTom >= 0) {
      if (numTom != 0) {
    	  System.out.println("Are you making tomato sauce?");
    	  String sauceResponse = scan.next();
    	  String sauceResD = sauceResponse.toLowerCase(); 
          for (int i = 0; i < numTom; i++) {
            Tomato tom = new Tomato();
              if (sauceResD.contains("y")) tom.makeSauce();
            foodList.add(tom);
          }
      }foodIndex.put("Tomato", intTom);
    }
    else {
    	System.out.println("ur input ;(");
    	foodIndex.put("Tomato", 0);
    }
    
    System.out.println("How many onions will you add?");
    int numOni = scan.nextInt();
    Integer intOni = new Integer(numOni);
    
    if (numOni >= 0) {
    	if (numOni != 0) {
    		System.out.println("Would you like them roasted or fried? Or would you prefer them raw?");
            String oniResponse = scan.next();
            String oniResD = oniResponse.toLowerCase();
            for (int i = 0; i < numOni; i++) {
              Onion oni = new Onion();
              if (oniResD.contains("roa")) oni.getRoasted();
              else if (oniResD.contains("fri")) oni.getFried();        
              foodList.add(oni);
            }
        }foodIndex.put("Onion", intOni);
    }
    else {
    	System.out.println("come on now");
    	foodIndex.put("Onion", 0);
    }
    
    System.out.println("How many carrots will you add?");
    int numCar = scan.nextInt();
    Integer intCar = new Integer(numCar);
    if (numCar >= 0) {
    	if (numCar != 0) {
    		System.out.println("Would you like your carrots buttered and salted?");
    	    String carResponse = scan.next();
    	    String carResD = carResponse.toLowerCase();
    	    for (int i =0; i < numCar; i++) {
    	    	Carrot car = new Carrot();
    		    if (carResD.contains("y")) {
    			  car.makeButtered();
    			  car.getSalted();
    		    }foodList.add(car);
    	    }
    	}foodIndex.put("Carrot", intCar);
    }
    else {
    	System.out.println("ur mean");
    	foodIndex.put("Carrot", 0);
    }scan.close();
    
    System.out.println();
    System.out.println("LIST of INGREDIENTS:");
    System.out.println(foodIndex);
    System.out.println(foodList);
    System.out.println();
    System.out.println("TOTAL GRAMS in meal : "+ sumWeight(foodList));
    System.out.println("TOTAL kCALORIES in meal : " + sumCal(foodList) +" enjoy ;)");

  }
}
