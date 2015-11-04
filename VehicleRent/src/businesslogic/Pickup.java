package businesslogic;

import java.util.ArrayList;
import java.util.List;

public class Pickup {
	private String id;
	private String date;
	private String insuranceModality;
	private double kms;
	private String gasLevel;
	private Return ret;
	private Reservation reservation;
	private Vehicle vehicle;
	private Employee employee;
	private List<Damage> list_damages;
	
	public Pickup(String id,String date,String insuranceModality,double kms,
			String gasLevel,Reservation reservation,Vehicle vehicle,Employee employee){
		setId(id);
		setDate(date);
		setInsuranceModality(insuranceModality);
		setKms(kms);
		setGasLevel(gasLevel);
		setReservation(reservation);
		setVehicle(vehicle);
		setEmployee(employee);
		list_damages=new ArrayList<Damage>();
	}
	
	//GETTERS & SETTERS
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public String getInsuranceModality() {
		return insuranceModality;
	}
	public void setInsuranceModality(String insuranceModality) {
		this.insuranceModality = insuranceModality;
	}
	public double getKms() {
		return kms;
	}
	public void setKms(double kms) {
		this.kms = kms;
	}
	public String getGasLevel() {
		return gasLevel;
	}
	public void setGasLevel(String gasLevel) {
		this.gasLevel = gasLevel;
	}
	
	public Return getRet() {
		return ret;
	}

	public void setRet(Return ret) {
		this.ret = ret;
	}

	public Reservation getReservation() {
		return reservation;
	}

	public void setReservation(Reservation reservation) {
		this.reservation = reservation;
	}

	public Vehicle getVehicle() {
		return vehicle;
	}

	public void setVehicle(Vehicle vehicle) {
		this.vehicle = vehicle;
	}

	public Employee getEmployee() {
		return employee;
	}

	public void setEmployee(Employee employee) {
		this.employee = employee;
	}

	/*damages*/
	public List<Damage> getList_damages() {
		return list_damages;
	}	
	public Damage getDamage(String id){
		for(Damage dmg:list_damages)
			if(id.equals(dmg.getId()))
				return dmg;
		return null;			
	}
	public void addDamages(Damage d) {
		this.list_damages.add(d);
	}
	public void rmvDamages(Damage d) {
		this.list_damages.remove(d);
	}
	
}
