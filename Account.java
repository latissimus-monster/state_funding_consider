package Kosta.bank2;

public class Account {
	String Id;
	long balance;
	
	public Account() {}
	
	public Account(String id, long balance) {
		super();
		Id = id;
		this.balance = balance;
	}

	public String getID() {
		return Id;
	}

	public void setID(String id) {
		Id = id;
	}

	public long getBalance() {
		return balance;
	}

	public void setBalance(long balance) {
		this.balance = balance;
	}

	public boolean withdraw(long balance) {
		if(this.balance < balance) {
		return false;
	} else {
		this.balance -= balance;
		return true;
	}
	
	
}

	public void deposit(long amount) {
		this.balance += amount;
	}
}
