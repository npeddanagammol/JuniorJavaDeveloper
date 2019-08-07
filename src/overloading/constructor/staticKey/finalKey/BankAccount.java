package overloading.constructor.staticKey.finalKey;

public class BankAccount {
	// Blue print of an bank account >> what does an bank account going to have?

	String accountNumber;
	static final String routingNumber = "911231";
	String name;
	String ssn;
	String accountType;
	double balance = 0;

	// Constructor

	BankAccount() {
		System.out.println("ACCOUNT CREATED");
	}

	BankAccount(String accountType) {
		System.out.println("Your " + accountType + " created");
	}

	BankAccount(String accountType, int initDeposit) {
		System.out.println("Your " + accountType + "'s Initial balance is: $" + initDeposit);
		String msg = null;
		if (initDeposit < 1000) {
			msg = "ERROR: Minimum deposit must be at least $1000";
		} else {
			msg = "Thanks for your initial deposit of $" + initDeposit;
		}
		System.out.println(msg);
		balance = balance + initDeposit;

	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSsn() {
		return ssn;
	}

	public void setSsn(String ssn) {
		this.ssn = ssn;
	}

	public void deposit(double amount) {
		
		balance = balance + amount;
		showActivity("DEPOSIT",amount);

	}

	void withdraw(double amount) {
		balance = balance - amount;
		showActivity("WITHDRAW",amount);
	}

	void checkBalance() {
		System.out.println("Balance is: $" + balance);

	}

	void getStatus() {

	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return " Name: " + name + "\n Account Type: " + accountType + "\n Account Number: " + accountNumber + "\n SSN: "
				+ ssn;
	}
	
	private void showActivity(String activity, double amount) {
		System.out.println("YOUR RECENT TRANSACTION IS : "+activity+" OF AMOUNT $"+amount);
		System.out.println("YOUR NEW BALANCE IS : $"+ balance);
	}

}
