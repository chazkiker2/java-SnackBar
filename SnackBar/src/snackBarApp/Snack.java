package snackBarApp;

public class Snack {

	private static int maxId = 0;

	private int id;
	private String name;
	private int quantity;
	private double cost;
	private int machineId;

	/**
	 * Construct a Snack object
	 * @param name name of snack
	 * @param quantity number of snack items
	 * @param cost cost of snack per item
	 * @param machineId vending machine id
	 */
	public Snack(String name, int quantity, double cost, int machineId) {
		this.id = ++maxId;
		this.name = name;
		this.quantity = quantity;
		this.cost = cost;
		this.machineId = machineId;
	}

	/**
	 * getter method for name property
	 * @return
	 */
	public String getName() {
		return name;
	}
	/**
	 * seter method for name property
	 * @param name the name of the snack
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * getter method for id property (read only, no setter)
	 * @return snack id
	 */
	public int getId() {
		return id;
	}
	/**
	 * getter method for cost property
	 * @return cost of snack
	 */
	public double getCost()
	{
		return cost;
	}
	/**
	 * setter method for cost property
	 * @param cost the cost to set
	 */
	public void setCost(double cost)
	{
		this.cost = cost;
	}

	/**
	 * get vending machine id
	 * @return vending machine id
	 */
	public int getMachineId()
	{
		return machineId;
	}

	/**
	 * set vending machine id
	 * @param machineId the id to set
	 */
	public void setMachineId(int machineId)
	{
		this.machineId = machineId;
	}

	/**
	 * get quantity available
	 */
	public getQuantity() {
		return quantity;
	}
	public int addQuantity(int amount) {
		quantity += amount;
	}

	/**
	 * buy snack given how many to purchase
	 * @param amount the amount (number) of snacks to purchase
	 * @return
	 */
	public double buySnacks(int amount) {
		quantity -= amount;
		return amount * cost;
	}

	/**
	 * get total cost given a quantity
	 * @param amount the amount of potential snacks
	 * @return total cost given amount
	 */
	public double getTotal(int amount) {
		return amount * cost;
	}


}