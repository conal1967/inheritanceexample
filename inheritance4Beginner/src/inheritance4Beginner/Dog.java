package inheritance4Beginner;

public class Dog extends Pet {

	/**
	 * 
	 */
	public Dog() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param petID
	 * @param name
	 * @param dob
	 * @param licenceRequired
	 * @param purchasePrice
	 */
	public Dog(int petID, String name, String dob, boolean licenceRequired, double purchasePrice) {
		super(petID, name, dob, licenceRequired, purchasePrice);
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param petID
	 * @param name
	 * @param fName
	 * @param lName
	 * @param eirCode
	 * @param houseNo
	 * @param dob
	 * @param licenceRequired
	 * @param purchasePrice
	 * @param sellingPrice
	 */
	public Dog(int petID, String name, String fName, String lName, String eirCode, String houseNo, String dob,
			boolean licenceRequired, double purchasePrice, double sellingPrice) {
		super(petID, name, fName, lName, eirCode, houseNo, dob, licenceRequired, purchasePrice, sellingPrice);
		// TODO Auto-generated constructor stub
	}
	

}
