package businesslogic;

public class Customer {
	private String id;
	private String name;
	private String city;
	private String address;
	private String postalCode;
	private String dateDriverlicense;
	private String digitsCC;
	private String monthCC;
	private String yearCC;
	private int cvcCC;
	private String typeCC;
	
	public Customer(String id, String name,String city,String PC,String dateDrivinglicense,
			String digitsCC,String monthCC,String yearCC,int cvcCC,String typeCC){
		setId(id);
		setName(name);
		setCity(city);
		setPostalCode(PC);
		setDateDriverlicense(dateDrivinglicense);
		setDigitsCC(digitsCC);
		setMonthCC(monthCC);
		setYearCC(yearCC);
		setCvcCC(cvcCC);
		setTypeCC(typeCC);
	}
	
	//GETTERS & SETTERS
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPostalCode() {
		return postalCode;
	}

	public void setPostalCode(String postalCode) {
		this.postalCode = postalCode;
	}

	public String getDateDriverlicense() {
		return dateDriverlicense;
	}

	public void setDateDriverlicense(String dateDriverlicense) {
		this.dateDriverlicense = dateDriverlicense;
	}

	public String getDigitsCC() {
		return digitsCC;
	}

	public void setDigitsCC(String digitsCC) {
		this.digitsCC = digitsCC;
	}

	public String getMonthCC() {
		return monthCC;
	}

	public void setMonthCC(String monthCC) {
		this.monthCC = monthCC;
	}

	public String getYearCC() {
		return yearCC;
	}

	public void setYearCC(String yearCC) {
		this.yearCC = yearCC;
	}

	public int getCvcCC() {
		return cvcCC;
	}

	public void setCvcCC(int cvcCC) {
		this.cvcCC = cvcCC;
	}

	public String getTypeCC() {
		return typeCC;
	}

	public void setTypeCC(String typeCC) {
		this.typeCC = typeCC;
	}
	
}
