package snackBarApp;

public class VendingMachine {
	private static int maxId = 0;
	private int id;
	private String name;

	/**
	 * constructor — construct a VendingMachine instance
	 * @param name the name of the vendming machine
	 */
	public VendingMachine(String name) {
		id = ++maxId;
		this.name = name;
	}

	/**
	 * get id
	 * @return id
	 */
	public int getId() {
		return id;
	}

	/**
	 * set name
	 * @param name name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * get name
	 * @return name
	 */
	public String getName() {
		return name;
	}
}