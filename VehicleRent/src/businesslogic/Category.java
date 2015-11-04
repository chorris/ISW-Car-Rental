package businesslogic;

import java.util.ArrayList;
import java.util.List;

public class Category {
	private String id;
	private double priceunlimitedMileage;
	private double priceFixedMileage;
	private double priceAdditionalKm;
	private double priceFullinsurance;
	private double pricePartialInsurance;
	private Category upperCategory;
	private List<Vehicle> list_vehicles;
	
	public Category(String id, double priceunlimitedMileage,double priceFixedMileage,
			double priceAdditionalKm,double priceFullinsurance,double pricePartialInsurance){
		setId(id);
		setPriceunlimitedMileage(priceunlimitedMileage);
		setPriceFixedMileage(priceFixedMileage);
		setPriceAdditionalKm(priceAdditionalKm);
		setPriceFullinsurance(priceFullinsurance);
		setPricePartialInsurance(pricePartialInsurance);
		list_vehicles=new ArrayList<Vehicle>();
	}
	
	//GETTERS & SETTERS

	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public double getPriceunlimitedMileage() {
		return priceunlimitedMileage;
	}
	public void setPriceunlimitedMileage(double priceunlimitedMileage) {
		this.priceunlimitedMileage = priceunlimitedMileage;
	}

	public double getPriceFixedMileage() {
		return priceFixedMileage;
	}

	public void setPriceFixedMileage(double priceFixedMileage) {
		this.priceFixedMileage = priceFixedMileage;
	}

	public double getPriceAdditionalKm() {
		return priceAdditionalKm;
	}

	public void setPriceAdditionalKm(double priceAdditionalKm) {
		this.priceAdditionalKm = priceAdditionalKm;
	}

	public double getPriceFullinsurance() {
		return priceFullinsurance;
	}

	public void setPriceFullinsurance(double priceFullinsurance) {
		this.priceFullinsurance = priceFullinsurance;
	}

	public double getPricePartialInsurance() {
		return pricePartialInsurance;
	}

	public void setPricePartialInsurance(double pricePartialInsurance) {
		this.pricePartialInsurance = pricePartialInsurance;
	}

	public Category getUpperCategory() {
		return upperCategory;
	}

	public void setUpperCategory(Category upperCategory) {
		this.upperCategory = upperCategory;
	}
	
	/*vehicle*/
	public List<Vehicle> getList_vehicles() {
		return list_vehicles;
	}
	public Vehicle getVehicle(String plateNo){
		for(Vehicle v: list_vehicles)
			if(plateNo.equals(v.getPlateNo()))
				return v;
		return null;
	}
	public void addVehicle(Vehicle v) {
		this.list_vehicles.add(v);
	}
	public void rmvVehicle(Vehicle v) {
		this.list_vehicles.remove(v);
	}
}
