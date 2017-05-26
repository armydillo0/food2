package meal2;

public class Tomato extends Food {
  
  public Tomato () {
    this.weight = 123 + ranGen.nextInt(59);
    this.calories = (int)(this.weight*0.18);
  }
  
  public void makeSauce() {
	  this.calories +=50;
  }
  
  public String toString() {
    return "// Tomato - " + this.calories + " calories & " +this.weight+" grams" ;
  }
  
}
