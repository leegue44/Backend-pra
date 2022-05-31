package Dogshout;

public class Dog {
	private String name;
	private String type;
	public String getname() {
		return name;
	}
	public void setname(String name) {
		this.name=name;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type=type;
	}
	public String showDoginfo() {
		return name + "," +type;
	}
}
