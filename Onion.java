package meal2;

public class Onion extends Food {
	
  public Onion () {
    this.weight = 110 + ranGen.nextInt(40);
    this.calories = (int)(this.weight*0.4);
  }
  
  public void getRoasted() {
	  this.calories = this.calories + 56;
  }
  
  public void getFried() {
	  this.calories = this.calories*2;
  }
  
  public String toString() {
    return "// Onion - " + this.calories + " calories & " +this.weight+" grams" ;
  }
}
