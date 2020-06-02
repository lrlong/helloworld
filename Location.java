public class Location {
	private String street;
	private String city;
	private String state;
	private int zip;
	
	public Location(String street, String city, String state, int zip) {
		this.street = street;
		this.city = city;
		this.state = state;
		this.zip = zip;
	}
	
	public String getStreet() {
		return street;
	}
	
	public String getCity() {
		return city;
	}
	
	public String getState() {
		return state;
	}
	
	public int getZip() {
		return zip;
	}
	
	@Override
	public String toString() {
		return String.format("Address: %s; %s, %s %s", street, city, state, zip);
	}
}
