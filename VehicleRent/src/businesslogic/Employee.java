package businesslogic;

public class Employee {
	private String id;
	private String name;
	private boolean administrator;
	
	public Employee(String id, String name, boolean admin){
		setId(id);
		setName(name);
		setAdministrator(admin);		
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

	public boolean getAdministrator() {
		return administrator;
	}

	public void setAdministrator(boolean administrator) {
		this.administrator = administrator;
	}
}
