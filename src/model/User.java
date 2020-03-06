//progression 1
package model;

//user class
public class User
{
	//instance variables
	private String name;
	private String number;
	private int age ;
	private int height ;
	private int weight;
	private String country;
	
	
	//getter and setter
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getNumber() {
		return number;
	}
	public void setNumber(String number) {
		this.number = number;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	public int getWeight() {
		return weight;
	}
	public void setWeight(int weight) {
		this.weight = weight;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	
	
	
	//constructor
		public User(String name, String number, int age, int height, int weight, String country)
	{
			super();
			this.name = name;
			this.number = number;
			this.age = age;//
			this.height = height;
			this.weight = weight;
			this.country = country;
		}
	
	
	
}
