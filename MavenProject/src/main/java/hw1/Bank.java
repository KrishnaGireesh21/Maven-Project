package hw1;

public class Bank 
	{
	    private int[] validPins = {1001, 1234, 1212};
	    private int pin;

	    // Method to set PIN
	    public void setPin(int pin) {
	        this.pin = pin;
	    }

	    // Method to validate PIN
	    public boolean validatePin() {
	        for (int validPin : validPins) {
	            if (validPin == pin) {
	                return true;
	            }
	        }
	        return false;
	    }
	}


