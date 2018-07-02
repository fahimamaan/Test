package java8;

public class Developer {

	
	private String name;
	private String address;
	public Developer(String name, String address) {
		super();
		this.name = name;
		this.address = address;
	}
	
	
	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getAddress() {
		return address;
	}


	public void setAddress(String address) {
		this.address = address;
	}


	@Override
	public String toString() {
		return "Developer [name=" + name + ", address=" + address + "]";
	}
	
}
