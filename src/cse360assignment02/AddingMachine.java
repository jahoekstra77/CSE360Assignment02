package cse360assignment02;

/**
 * Class that performs elementary arithmetic, adding or subtracting from a local
 * variable. The operations are stored for return as a string.
 * @author Jake Hoekstra
 *
 */
public class AddingMachine {
	private int total;
	private String operations;
	
	/**
	 * Default Constructor, initializes the total local variable to 0 and the 
	 * string variable to a string of 0
	 */
	public AddingMachine () {
		total = 0;  		// not needed - included for clarity
		operations = "0";
	}
	
	/**
	 * Gets the local variable 
	 * @return int total local variable
	 */
	public int getTotal () {
		return total;
	}
	
	/**
	 * Adds the input value to the total local variable and stores it in the
	 * string
	 * @param value value to be added and stored in the local string
	 */
	public void add (int value) {
		total += value;
		operations += " + " + value;
	}
	
	/**
	 * Subtracts the input value to the total local variable and stores it in 
	 * the string
	 * @param value value to be subtracted and stored in the local string
	 */
	public void subtract (int value) {
		total -= value;
		operations += " - " + value;
	}
	
	/**
	 * Returns the history of operations performed on the total local variable 
	 * in string form
	 * @return String string of operations performed
	 */
	public String toString () {
		return operations;
	}
	
	/**
	 * Clears the local variable and string to 0
	 */
	public void clear() {
		total = 0;
		operations = "0";
	}
}
