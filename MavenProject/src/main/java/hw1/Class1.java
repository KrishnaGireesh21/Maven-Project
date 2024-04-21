package hw1;
import java.util.Scanner;

	public class Class1 {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        Bank bank = new Bank();

	        System.out.println("Welcome to the ATM");
	        System.out.println("Please enter your PIN:");

	        int enteredPin = scanner.nextInt();

	        bank.setPin(enteredPin);

	        if (bank.validatePin()) {
	            System.out.println("PIN validated. You can proceed with the withdrawal.");
	            // Add withdrawal logic here
	        } else {
	            System.out.println("Invalid PIN. Please try again.");
	        }
	    }
	}

