package businesslogic;

import java.util.ArrayList;
import java.util.List;

public class BranchOffice {
	private String id;
	private String address;
	private List<Vehicle> list_vehicles;
	private List<Employee> list_employees;
	private List<Reservation> list_pickupPlace;
	private List<Reservation> list_returnPlace;
	
	public BranchOffice(String id, String addr){
		setId(id);
		setAddress(addr);
		list_vehicles=new ArrayList<Vehicle>();
		list_employees=new ArrayList<Employee>();
		list_pickupPlace=new ArrayList<Reservation>();
		list_returnPlace=new ArrayList<Reservation>();
	}

	//GETTERS & SETTERS
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
	
	/*vehicle*/
	public List<Vehicle> getList_vehicles() {
		return list_vehicles;
	}
	public Vehicle getVehicle(String plateNo){
		for(Vehicle veh: list_vehicles)
			if(plateNo.equals(veh.getPlateNo()))
				return veh;
		return null;
	}	
	public void addVehicle(Vehicle v) {
		this.list_vehicles.add(v);
	}	
	public void rmvVehicle(Vehicle veh){
		list_vehicles.remove(veh);
	}
	
	/*employee*/
	public List<Employee> getList_employees() {
		return list_employees;
	}
	public Employee getEmployee(String id){
		for(Employee emp:list_employees)
			if(id.equals(emp.getId()))
				return emp;
		return null;						
	}
	public void addEmployee(Employee e) {
		this.list_employees.add(e);
	}
	public void rmvEmployee(Employee e){
		list_employees.remove(e);
	}
	
	/*pickupPlace*/
	public List<Reservation> getList_pickupPlace() {
		return list_pickupPlace;
	}
	public Reservation getPickupPlace(String id){
		for(Reservation res:list_pickupPlace)
			if(id.equals(res.getId()))
				return res;
		return null;
	}
	public void addPickupPlace(Reservation pickupPlace) {
		this.list_pickupPlace.add(pickupPlace);
	}
	public void rmvPickupPlace(Reservation pickupPlace) {
		this.list_pickupPlace.remove(pickupPlace);
	}	
	
	/*returnPlace*/
	public List<Reservation> getList_returnPlace() {
		return list_returnPlace;
	}
	public Reservation getReturnPlace(String id){
		for(Reservation r:list_returnPlace)
			if(id.equals(r.getId()))
				return r;
		return null;
	}
	public void addReturnPlace(Reservation returnPlace) {
		this.list_returnPlace.add(returnPlace);
	}
	public void rmvReturnPlace(Reservation returnPlace) {
		this.list_returnPlace.remove(returnPlace);
	}
	

}
