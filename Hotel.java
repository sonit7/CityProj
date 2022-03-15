package city;

import java.util.ArrayList;

public class Hotel extends Building{
	private Suite[][] rooms;
	
	public Hotel(int h, double a, boolean w, String n) {
		super(h,a,w,"Hotel",n);
	}
	
	public int getTotalPeople() {
		int total = 0;
		for(int r=0; r<rooms.length; r++) {
			for(int c=0; c<rooms[r].length; c++) {
				total+=rooms[r][c].getPersonCount();
			}
		}
		return total;
	}
	
}
class Suite{
	private ArrayList<Object> objects;
	private ArrayList<Person> visitor;

	public Suite() {
		objects = new ArrayList<Object>();
	}
	
	public int getPersonCount() {
		return visitor.size();
	}
	
	public void occupy() {
		Suite suit = new Suite();
	}
	
	public void leave() {
		Suite suit = null;
	}
	
	public void join(Person p) {
		visitor.add(p);
	}
	
	public void go(Person p) {
		visitor.remove(p);
	}
}
class Person{
	private String name;
	private int age;
	
	public Person(String n, int a) {
		name = n;
		age = a;
	}
	
	public String getName() {
		return name;
	}
	
	public int age() {
		return age;
	}
	
	public String toString() {
		return "Name: "+this.getName()+"\nAge: "+this.getAge();
	}
	
class Object{
	
}