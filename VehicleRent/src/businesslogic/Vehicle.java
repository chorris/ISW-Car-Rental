package businesslogic;

import java.util.ArrayList;
import java.util.List;

public class Vehicle {
	private String plateNo;
	private double kms;
	private BranchOffice branchOffice;
	private Category category;
	private List<Pickup> list_pickups;
	
	public Vehicle(String plateNo,int kms,Category categ){
		setPlateNo(plateNo);
		setKms(kms);
		setCategory(categ);
		list_pickups=new ArrayList<Pickup>();
	}
	
	//GETTERS & SETTERS
	public String getPlateNo() {
		return plateNo;
	}

	public void setPlateNo(String plateNo) {
		this.plateNo = plateNo;
	}

	public double getKms() {
		return kms;
	}

	public void setKms(double kms) {
		this.kms = kms;
	}

	public BranchOffice getBranchOffice() {
		return branchOffice;
	}

	public void setBranchOffice(BranchOffice branchOffice) {
		this.branchOffice = branchOffice;
	}

	public Category getCategory() {
		return category;
	}

	public void setCategory(Category category) {
		this.category = category;
	}

	/*pickup*/
	public List<Pickup> getList_pickups() {
		return list_pickups;
	}
	public Pickup getPickup(String id){
		for(Pickup p:list_pickups)
			if(id.equals(p.getId()))
				return p;
		return null;
	}
	public void addPickup(Pickup p) {
		this.list_pickups.add(p);
	}
	public void rmvPickup(Pickup p) {
		this.list_pickups.remove(p);
	}

}
