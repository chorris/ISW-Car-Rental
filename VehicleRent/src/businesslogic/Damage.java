package businesslogic;

public class Damage {
	private String id;
	private String zone;
	private String description;
	
	
	public Damage(String id, String zone, String description) {
		setId(id);
		setDescription(description);
		setZone(zone);
	}
	
	//GETTERS & SETTERS	
	
	public String getId() {
		return id;
	}
	
	public void setId(String id) {
		this.id = id;
	}
	
	public String getZone() {
		return zone;
	}

	public void setZone(String zone) {
		this.zone = zone;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

}
