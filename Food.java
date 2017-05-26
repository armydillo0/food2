package meal2;

import java.util.Random;

public abstract class Food {
	protected int calories;
	protected int weight;
	protected String flavor;
	protected static Random ranGen = new Random();
	
	  public int getCal() {
		    return this.calories;
		  }
		  
	  public int getWeight() {
		    return this.weight;
		  }
	  
	  public abstract String toString();

}
