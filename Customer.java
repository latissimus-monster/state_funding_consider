package Kosta.bank2;

public class Customer {
	String Id;
	String name;
	Account account;

	public Customer() {
	}

	public Customer(String id, String name, Account account) {
		super();
		Id = id;
		this.name = name;
		this.account = account;
		}

	public String getId() {
		return Id;
	}

	public void setID(String id) {
		Id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Account getAccount() {
		return account;
	}

	public void setAccount(Account account) {
		this.account = account;
	}
}
