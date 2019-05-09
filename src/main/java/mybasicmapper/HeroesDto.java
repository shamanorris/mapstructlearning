package mybasicmapper;

import java.util.Date;

public class HeroesDto {

	private String name;

	private Roles role;

	private Date releaseDt;

	private Double price;

	public HeroesDto() {
		super();
	}

	public HeroesDto(String name, Roles role, Date releaseDt, Double price) {
		super();
		this.name = name;
		this.role = role;
		this.releaseDt = releaseDt;
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Roles getRole() {
		return role;
	}

	public void setRole(Roles role) {
		this.role = role;
	}

	public Date getReleaseDt() {
		return releaseDt;
	}

	public void setReleaseDt(Date releaseDt) {
		this.releaseDt = releaseDt;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

}
