package businesslogic;

import java.util.ArrayList;
import java.util.List;

public final class VehicleRental {
	private String id;
	private List<Customer> list_customers;
	private List<Reservation> list_reservations;
	private List<Category> list_categories;
	private List<BranchOffice> list_branchOffices;
	private static VehicleRental INSTANCE = new VehicleRental();	
	
	private VehicleRental(){
		//setId(id);
		list_customers=new ArrayList<Customer>();
		list_reservations=new ArrayList<Reservation>();
		list_categories=new ArrayList<Category>();
		list_branchOffices=new ArrayList<BranchOffice>();
	}
	
	public static VehicleRental getVehicleRental(){
		return INSTANCE;
	}
	
	public List<Reservation> listBranchReservations(String id){
		return getBranchOffice(id).getList_pickupPlace();
	}
	
	public void createReservation(String id, String pickupDate,String returnDate,String rentalMode,
			Customer customer,BranchOffice retPlace,BranchOffice pickupPlace,Category category){
		
	}
	
	public void createReservation(String id, String pickupDate,String returnDate,String rentalMode,
			String retPlace,String pickupPlace,String category){
		
		Customer cst = getCustomer(id);
		BranchOffice returnOffice = getBranchOffice(retPlace);
		BranchOffice pickupOffice = getBranchOffice(pickupPlace);
		Category ctg = getCategory(category);
		
		id = "" + list_reservations.size();
		
		Reservation rsv = new Reservation(id, pickupDate, returnDate, rentalMode, 
				cst, returnOffice, pickupOffice,ctg);
		
		addReservation(rsv);
	}
	
	public void registerCustomer(){
		// STILL NEED TO COMPLETE IT
	}
	
	public void systemLoad(){
		BranchOffice bo1 = new BranchOffice("1", "Camino de Vera s/n");
		BranchOffice bo2 = new BranchOffice("2", "Archiduque Carlos, 3");

		list_branchOffices.add(bo1);
		list_branchOffices.add(bo2);

		Category cat1 = new Category("sedan", 45, 23, 0.75, 50.25, 43.23);
		Category cat2 = new Category("economy", 48, 27, 0.85, 75.25, 55.23);
		cat2.setUpperCategory(cat1);
		
		list_categories.add(cat1);
		list_categories.add(cat2);
        }
	
	//GETTERS & SETTERS
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public List<Customer> getList_customers() {
		return list_customers;
	}

	public void setList_customers(List<Customer> list_customers) {
		this.list_customers = list_customers;
	}
	
	public Customer getCustomer(String id) {
		for (Customer cst: list_customers)
			if(id.equals(cst.getId()))
					return cst;
		return null;
	}

	public List<Reservation> getList_reservations() {
		return list_reservations;
	}

	public void setList_reservations(List<Reservation> list_reservations) {
		this.list_reservations = list_reservations;
	}
	
	public void addReservation(Reservation r) {
		this.list_reservations.add(r);
	}

	public List<Category> getList_categories() {
		return list_categories;
	}

	public void setList_categories(List<Category> list_categories) {
		this.list_categories = list_categories;
	}
	
	public Category getCategory(String id) {
		for(Category ctg: list_categories)
			if(id.equals(ctg.getId()))
				return ctg;
		return null;
	}

	public List<BranchOffice> getList_branchOffices() {
		return list_branchOffices;
	}

	public void setList_branchOffices(List<BranchOffice> list_branchOffices) {
		this.list_branchOffices = list_branchOffices;
	}
	
	public BranchOffice getBranchOffice(String id){
		for(BranchOffice bcf: list_branchOffices)
			if(id.equals(bcf.getId()))
				return bcf;
		return null;
	}
}
