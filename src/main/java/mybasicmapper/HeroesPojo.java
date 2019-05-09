package mybasicmapper;

public class HeroesPojo {

	private String name;

	private String role;

	private String released;

	private String rpValue;

	public HeroesPojo() {
		super();
	}

	public HeroesPojo(String name, String role, String released, String rpValue) {
		super();
		this.name = name;
		this.role = role;
		this.released = released;
		this.rpValue = rpValue;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public String getReleased() {
		return released;
	}

	public void setReleased(String released) {
		this.released = released;
	}

	public String getRpValue() {
		return rpValue;
	}

	public void setRpValue(String rpValue) {
		this.rpValue = rpValue;
	}

}
