package city;

public class Student {
	private String name;
	private int year;
	
	public Student(String name, int year) {
		this.name = name;
		this.year = year;
	}
	
	public String getName() {
		return name;
	}
	
	public int getYear() {
		return year;
	}
	
	public String toString() {
		return "Name: "+this.getName()+"\nYear: "+this.getYear();
	}
}
