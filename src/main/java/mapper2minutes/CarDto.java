package mapper2minutes;

public class CarDto {

	private String make;
	private int seatCount;
	private String type;

	// constructor, getters, setters etc.
	public CarDto() {
		super();
	}

	public CarDto(String make, int seatCount, String type) {
		super();
		this.make = make;
		this.seatCount = seatCount;
		this.type = type;
	}

	public String getMake() {
		return make;
	}

	public void setMake(String make) {
		this.make = make;
	}

	public int getSeatCount() {
		return seatCount;
	}

	public void setSeatCount(int seatCount) {
		this.seatCount = seatCount;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}
}