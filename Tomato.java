package meal;

import java.util.Random;

public class Tomato extends Food{//?

	private Calorie cal;
	private int weight;
	private static Random ranGen = new Random();
	
	public Tomato () {
		this.weight = 123 + ranGen.nextInt(59);
		Calorie tomCal = new Calorie((int)(this.weight*0.18));
		this.cal = tomCal;
	}
	
	public int getCal() {
		return this.cal.getValue();
	}
	
	public int getWeight() {
		return this.weight;
	}
	
	public void makeSauce() {
		this.cal.setValue(this.cal.getValue()+50);
	}
	
	public String toString() {
		return "// Tomato - " + this.cal.getValue() + " calories & " +this.getWeight()+" grams" ;
	}
	
}
