package meal;

import java.util.Random;

public class Onion extends Food{//??

    private Calorie cal;
    private int weight;
    private static Random ranGen = new Random();
	
	public Onion () {
		this.weight = 110 + ranGen.nextInt(40);
		Calorie oniCal = new Calorie((int)(this.weight*0.4));
		this.cal = oniCal;
	}
	
	public int getCal() {
		return this.cal.getValue();
	}
	
	public int getWeight() {
		return this.weight;
	}
	
	public void getRoasted() {
		this.cal.setValue(this.cal.getValue()+56);
	}
	
	public void getFried() {
		this.cal.setValue(this.cal.getValue()*2);
	}
	
	public String toString() {
		return "// Onion - " + this.cal.getValue() + " calories & " +this.getWeight()+" grams" ;
	}

}
