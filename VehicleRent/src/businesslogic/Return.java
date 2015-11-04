package businesslogic;

import java.util.ArrayList;
import java.util.List;

public class Return {
	private String id;
	private String date;
	private double costCharged;
	private boolean ischarged;
	private double kms;
	private String gasLevel;
	private Pickup pickup;
	private Employee employee;
	private List<Damage> list_damages;
	
	public Return(String id, String date, double costCharged,boolean ischarged,
			double kms, String gasLevel, Pickup pickup,Employee employee){
		setId(id);
		setDate(date);
		setCostCharged(costCharged);
		setIscharged(ischarged);
		setGasLevel(gasLevel);
		setPickup(pickup);
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

	public double getCostCharged() {
		return costCharged;
	}

	public void setCostCharged(double costCharged) {
		this.costCharged = costCharged;
	}

	public boolean isIscharged() {
		return ischarged;
	}

	public void setIscharged(boolean ischarged) {
		this.ischarged = ischarged;
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

	public Pickup getPickup() {
		return pickup;
	}

	public void setPickup(Pickup pickup) {
		this.pickup = pickup;
	}

	public Employee getEmployee() {
		return employee;
	}

	public void setEmployee(Employee employee) {
		this.employee = employee;
	}
	
	/*damage*/
	public List<Damage> getList_damages() {
		return list_damages;
	}
	public Damage getDamage(String id){
		for(Damage d:list_damages)
			if(id.equals(d.getId()))
				return d;
		return null;
	}
	public void addDamage(Damage d) {
		this.list_damages.add(d);
	}
	public void rmvDamage(Damage d) {
		this.list_damages.remove(d);
	}

}
