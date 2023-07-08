package in.ineuron.pptAssignmentJAVA_03;

import java.util.Scanner;

class BankAccount {
	private String accountHolderName;
	private double balance;

	public BankAccount(String accountHolderName) {
		this.accountHolderName = accountHolderName;
		this.balance = 0.0;
	}

	public String getAccountHolderName() {
		return accountHolderName;
	}

	public double getBalance() {
		return balance;
	}

	public void deposit(double amount) {
		balance += amount;
		System.out.println(amount + " deposited successfully.");
	}

	public void withdraw(double amount) {
		if (balance >= amount) {
			balance -= amount;
			System.out.println(amount + " withdrawn successfully.");
		} else {
			System.out.println("Insufficient balance.");
		}
	}
}

public class BankingSystem_1 {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter account holder name: ");
		String accountHolderName = scanner.nextLine();

		BankAccount account = new BankAccount(accountHolderName);

		System.out.println("Bank account created successfully!");
		System.out.println("Account holder name: " + account.getAccountHolderName());

		while (true) {
			System.out.println("\n1. Check Balance");
			System.out.println("2. Deposit");
			System.out.println("3. Withdraw");
			System.out.println("4. Exit");
			System.out.print("Enter your choice (1-4): ");
			int choice = scanner.nextInt();

			switch (choice) {
			case 1:
				System.out.println("Account balance: " + account.getBalance());
				break;
			case 2:
				System.out.print("Enter the amount to deposit: ");
				double depositAmount = scanner.nextDouble();
				account.deposit(depositAmount);
				break;
			case 3:
				System.out.print("Enter the amount to withdraw: ");
				double withdrawAmount = scanner.nextDouble();
				account.withdraw(withdrawAmount);
				break;
			case 4:
				System.out.println("Thank you for using the banking system.");
				System.exit(0);
			default:
				System.out.println("Invalid choice. Please enter a number from 1 to 4.");
			}
		}
	}
}
