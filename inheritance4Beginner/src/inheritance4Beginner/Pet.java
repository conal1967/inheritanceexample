package inheritance4Beginner;

public class Pet {
		
	private int petID;
	private String name;
	private String fName;
	private String lName;
	private String eirCode;
	private String houseNo;
	private String dob;
	private boolean licenceRequired;
	private double purchasePrice;
	private double sellingPrice;
	
	

	/**
	 * 
	 */
	public Pet() {
		super();
	}



	/**
	 * @param petID
	 * @param name
	 * @param dob
	 * @param licenceRequired
	 * @param purchasePrice
	 */
	public Pet(int petID, String name, String dob, boolean licenceRequired, double purchasePrice) {
		super();
		this.petID = petID;
		this.name = name;
		this.dob = dob;
		this.licenceRequired = licenceRequired;
		this.purchasePrice = purchasePrice;
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
	public Pet(int petID, String name, String fName, String lName, String eirCode, String houseNo, String dob,
			boolean licenceRequired, double purchasePrice, double sellingPrice) {
		super();
		this.petID = petID;
		this.name = name;
		this.fName = fName;
		this.lName = lName;
		this.eirCode = eirCode;
		this.houseNo = houseNo;
		this.dob = dob;
		this.licenceRequired = licenceRequired;
		this.purchasePrice = purchasePrice;
		this.sellingPrice = sellingPrice;
	}



	public int getPetID() {
		return petID;
	}



	public void setPetID(int petID) {
		this.petID = petID;
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public String getfName() {
		return fName;
	}



	public void setfName(String fName) {
		this.fName = fName;
	}



	public String getlName() {
		return lName;
	}



	public void setlName(String lName) {
		this.lName = lName;
	}



	public String getEirCode() {
		return eirCode;
	}



	public void setEirCode(String eirCode) {
		this.eirCode = eirCode;
	}



	public String getHouseNo() {
		return houseNo;
	}



	public void setHouseNo(String houseNo) {
		this.houseNo = houseNo;
	}



	public String getDob() {
		return dob;
	}



	public void setDob(String dob) {
		this.dob = dob;
	}



	public boolean isLicenceRequired() {
		return licenceRequired;
	}



	public void setLicenceRequired(boolean licenceRequired) {
		this.licenceRequired = licenceRequired;
	}



	public double getPurchasePrice() {
		return purchasePrice;
	}



	public void setPurchasePrice(double purchasePrice) {
		this.purchasePrice = purchasePrice;
	}



	public double getSellingPrice() {
		return sellingPrice;
	}



	public void setSellingPrice(double sellingPrice) {
		this.sellingPrice = sellingPrice;
	}



	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((dob == null) ? 0 : dob.hashCode());
		result = prime * result + ((eirCode == null) ? 0 : eirCode.hashCode());
		result = prime * result + ((fName == null) ? 0 : fName.hashCode());
		result = prime * result + ((houseNo == null) ? 0 : houseNo.hashCode());
		result = prime * result + ((lName == null) ? 0 : lName.hashCode());
		result = prime * result + (licenceRequired ? 1231 : 1237);
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + petID;
		long temp;
		temp = Double.doubleToLongBits(purchasePrice);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(sellingPrice);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		return result;
	}



	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Pet other = (Pet) obj;
		if (dob == null) {
			if (other.dob != null)
				return false;
		} else if (!dob.equals(other.dob))
			return false;
		if (eirCode == null) {
			if (other.eirCode != null)
				return false;
		} else if (!eirCode.equals(other.eirCode))
			return false;
		if (fName == null) {
			if (other.fName != null)
				return false;
		} else if (!fName.equals(other.fName))
			return false;
		if (houseNo == null) {
			if (other.houseNo != null)
				return false;
		} else if (!houseNo.equals(other.houseNo))
			return false;
		if (lName == null) {
			if (other.lName != null)
				return false;
		} else if (!lName.equals(other.lName))
			return false;
		if (licenceRequired != other.licenceRequired)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (petID != other.petID)
			return false;
		if (Double.doubleToLongBits(purchasePrice) != Double.doubleToLongBits(other.purchasePrice))
			return false;
		if (Double.doubleToLongBits(sellingPrice) != Double.doubleToLongBits(other.sellingPrice))
			return false;
		return true;
	}
 protected String feedingInstructions1()
 {
 return " Feed me Seymour ";
	 
 }


	@Override
	public String toString() {
		return "Pet [petID=" + petID + ", name=" + name + ", fName=" + fName + ", lName=" + lName + ", eirCode="
				+ eirCode + ", houseNo=" + houseNo + ", dob=" + dob + ", licenceRequired=" + licenceRequired
				+ ", purchasePrice=" + purchasePrice + ", sellingPrice=" + sellingPrice + "]";
	}



	public String feedingInstructions()
	{
		return "Feed Me Seymour ";
	}
	
	

}
