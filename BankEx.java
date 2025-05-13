package banking;
import java.util.Scanner;

public class BankEx {
	static double balance = 0;
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int option = 0; 
		while (option !=4) {
			System.out.println("Welcome to the Bank of java");
			System.out.println("1.check Balance");
			System.out.println("2.Deposit");
			System.out.println("3.withdraw");
			System.out.println("4.Exit");
			System.out.println("Enter an option:");
			option = sc.nextInt();
			
			switch (option) {
			case 1:
				checkBalance1();
				break;
			
			case 2:
				deposit();
				break;
			case 3:
				withdraw1();
				break;
			case 4:
				exit();
				break;
			default:
				System.out.println("Invalid option. Try again.");
				break;
			}
		}
		
	
		
	}

	public static void checkBalance1() {
		System.out.println("Your current balance is $" + balance);
	}
	public static void deposit() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the amount to deposit: $");
		double amount = sc.nextDouble();
		balance += amount;
		System.out.print("$" + amount + " has been deposited to Your account.");
		checkBalance1();
		
	}
	public static void withdraw1() {
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the amount to withdraw: $");
			double amount = sc.nextDouble();
			if (amount > balance) {
			
				System.out.println("Insufficient funds.");
			} else {
				balance -= amount;
				System.out.println("$" + amount + " has been withdrawn from your account.");
			}
			checkBalance1();
			
		
	}
 
	public static void exit() {
		System.out.println("Thank you for banking with us. Have a great day!");
	}
}
			
		

	
			
		
