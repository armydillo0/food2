package meal;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public abstract class Food {
 
  public static int sumCal(ArrayList<Food> list) {
    int calories = 0;
    for ( Food yumyum : list) {
      if (yumyum instanceof Tomato) {
        Tomato a = (Tomato) yumyum;
        calories += a.getCal();
      }
      if (yumyum instanceof Onion) {
        Onion a = (Onion) yumyum;
        calories += a.getCal();
      }
    }
    return calories;
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
  }
  
  System.out.println("How many onions will you add?");
  int numOni = scan.nextInt();
  if (numOni > 0) {
    System.out.println("Would you like them roasted or fried? Or would you prefer them raw?");
    String oniResponse = scan.next();
    scan.close();
    String oniResD = oniResponse.toLowerCase();
     for (int i = 0; i < numOni; i++) {
       Onion oni = new Onion();
       if (oniResD.contains("roa")) oni.getRoasted();
       else if (oniResD.contains("fri")) oni.getFried();        
       foodList.add(oni);
     }
  }
  System.out.println();
  System.out.println("LIST of INGREDIENTS:");
  System.out.println(foodList);
  System.out.println();
  System.out.println("TOTAL CALORIES in meal : " + sumCal(foodList) +" enjoy ;)");

 }

}
