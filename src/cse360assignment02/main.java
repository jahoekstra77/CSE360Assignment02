package cse360assignment02;
import java.util.Random;

/**
 * Main method for testing the AddingMachine.java class
 * @author Jake Hoekstra
 */
public class main {

	public static void main(String[] args) {
		
		AddingMachine myCalculator = new AddingMachine();
		Random rand = new Random();
		
		// Add/Subtract random numbers to myCalculator
		for (int i = 0; i < 5; i++) {
			if (rand.nextInt(2) == 0) {
				myCalculator.add(rand.nextInt(15) + 1);
			} else {
				myCalculator.subtract(rand.nextInt(15) + 1);
			}
		}
		// Print out results
		System.out.println(myCalculator + " = " + myCalculator.getTotal());
		
		// Clear out myCalculator for another test
		myCalculator.clear();
		System.out.println(myCalculator + " = " + myCalculator.getTotal());
		for (int i = 0; i < 8; i++) {
			if (rand.nextInt(2) == 0) {
				myCalculator.add(rand.nextInt(15) + 1);
			} else {
				myCalculator.subtract(rand.nextInt(15) + 1);
			}
		}
		// Print out results
		System.out.println(myCalculator + " = " + myCalculator.getTotal());
	}

}
