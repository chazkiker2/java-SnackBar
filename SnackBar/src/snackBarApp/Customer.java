package snackBarApp;

public class Customer {
	private satic int maxId = 0;

	private int id;
	private String name;
	private double cash;

	public Customer(String name, double cash) {
		id = ++maxId;
		this.name = name;
		this.cash = cash;
	}

	public int getId()
	{
		return id;
	}

	public String getName()
	{
		return name;
	}

	public void setName(String name)
	{
		this.name = name;
	}

	public void addCash(double amount) {
		cash += amount;
	}

	public double getCash() {
		return cash;
	}

	public void buySnacks(double cost) {
		cash -= total;
	}
}