package meal2;

import java.util.Scanner;
import java.util.ArrayList;

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

    ArrayList <Food> foodList = new ArrayList <Food> ();
      
    Scanner scan = new Scanner(System.in);
    System.out.println("How many tomatoes will you add?");
    int numTom = scan.nextInt();
    if (numTom > 0) {
      System.out.println("Are you making tomato sauce?");
      String sauceResponse = scan.next();
      String sauceResD = sauceResponse.toLowerCase();
      
      for (int i = 0; i < numTom; i++) {
      Tomato tom = new Tomato();
      if (sauceResD.contains("y")) tom.makeSauce();
      foodList.add(tom);
      }
    }else System.out.println("ur input ;(");

    System.out.println("How many onions will you add?");
    int numOni = scan.nextInt();
    if (numOni > 0) {
      System.out.println("Would you like them roasted or fried? Or would you prefer them raw?");
      String oniResponse = scan.next();
      String oniResD = oniResponse.toLowerCase();
        for (int i = 0; i < numOni; i++) {
          Onion oni = new Onion();
          if (oniResD.contains("roa")) oni.getRoasted();
          else if (oniResD.contains("fri")) oni.getFried();        
          foodList.add(oni);
        }
    }else System.out.println("come on now");
    
    System.out.println("How many carrots will you add?");
    int numCar = scan.nextInt();
    if (numCar > 0) {
    	System.out.println("Would you like your carrots buttered and salted?");
    	String carResponse = scan.next();
    	String carResD = carResponse.toLowerCase();
    	for (int i =0; i < numCar; i++) {
    		Carrot car = new Carrot();
    		if (carResD.contains("ye")) {
    			car.makeButtered();
    			car.getSalted();
    		}foodList.add(car);
    	}
    }scan.close();
    
    System.out.println();
    System.out.println("LIST of INGREDIENTS:");
    System.out.println(foodList);
    System.out.println();
    System.out.println("TOTAL GRAMS in meal : "+ sumWeight(foodList));
    System.out.println("TOTAL kCALORIES in meal : " + sumCal(foodList) +" enjoy ;)");

  }
}
