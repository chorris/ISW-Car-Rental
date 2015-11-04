package businesslogic;

public class Reservation {
	private String id;
	private String pickupDate;
	private String returnDate;
	private String rentalMode;
	private Customer customer;
	private BranchOffice return_place;
	private BranchOffice pickup_place;
	private Pickup pickup;
	private Category category;
	
	public Reservation(String id, String pickupDate,String returnDate,String rentalMode,
			Customer customer,BranchOffice retPlace,BranchOffice pickupPlace,Category category){
		setPickupDate(pickupDate);
		setReturnDate(returnDate);
		setRentalMode(rentalMode);
		setCustomer(customer);
		setRetPlace(retPlace);
		setPickupPlace(pickupPlace);
		setCategory(category);
	}
	
	//GETTERS & SETTERS

	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}

	public String getPickupDate() {
		return pickupDate;
	}

	public void setPickupDate(String pickupDate) {
		this.pickupDate = pickupDate;
	}

	public String getReturnDate() {
		return returnDate;
	}

	public void setReturnDate(String returnDate) {
		this.returnDate = returnDate;
	}

	public String getRentalMode() {
		return rentalMode;
	}

	public void setRentalMode(String rentalMode) {
		this.rentalMode = rentalMode;
	}
	
	/*customer*/
	public void setCustomer(Customer customer){
		this.customer=customer;
	}
	public Customer geCustomer(){
		return this.customer;
	}
	
	/*branchOffice*/
	public void setRetPlace(BranchOffice returnP){
		this.return_place=returnP;
	}
	public BranchOffice geRetPlace(){
		return this.return_place;
	}
	public void setPickupPlace(BranchOffice pickup){
		this.pickup_place=pickup;
	}
	public BranchOffice getPickupPlace(){
		return this.pickup_place;
	}
	
	/*pickup*/
	public void setPickup(Pickup pickup){
		this.pickup=pickup;
	}
	public Pickup gePickup(){
		return this.pickup;
	}
	
	/*category*/
	public void setCategory(Category category){
		this.category=category;
	}
	public Category geCategory(){
		return this.category;
	}

}
