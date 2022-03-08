package city;

import java.util.ArrayList;

public class College extends Building{
	private Room[][] r;
	
	public College(int h, double a, boolean w, String n, int numRooms, int numFloors) {
		super(h,a,w,"College","University of Sharkmount");
		r = new Room[numRooms][numFloors];
	}
	
	public String getRooms() {
		String res = "";
		for(int i=0; i<r.length; i++) {
			res+=r[i]+"\n";
		}
		return res;
	}
	
	public int totalStudents() {
		int sum = 0;
		for(int i=0; i<r.length; i++) {
			for(int j=0; j<r[i].length; j++) {
				sum+=r[i][j].getStudents();
			}
		}
		return sum;
	}
	
	public void insertRoom(Room r, int spot, int floor) {
		this.r[spot][floor] = r;
	}
	
	public void removeRoom(int spot, int floor) {
		r[spot][floor] = null;
	}
	
	public String toString() {
		return "Height: "+getHeight()+"\nTotal Area: "+getArea()+"\nBuilding Has Windows: "+getHasWindows()+"\nStore Type: "+getType()+"\nName of Store: "+getName()+"\nRooms: "+getRooms()+"\nTotal Students: "+totalStudents();
	}
}
class Room{
	private ArrayList<Objects> obj;
	private double area;
	private int numStudents;
	
	public Room(double area, int numObjects, int ns) {
		this.area = area;
		obj = new ArrayList<Objects>(numObjects);
		numStudents = ns;
	}
	
	public String getObjects(){
		String res = "";
		for(int i=0; i<obj.size(); i++) {
			res+=obj.get(i)+"\n";
		}
		return res;
	}
	
	public double getArea() {
		return area;
	}
	
	public void enter() {
		numStudents++;
	}
	
	public void leave() {
		numStudents--;
	}
	
	public int getStudents() {
		return numStudents;
	}
	
	public String toString() {
		return "Area: "+this.getArea()+"Number of objects: "+this.getObjects();
	}
}
class Objects{
	private String name;
	private int size;
	
	public Objects(String n, int s) {
		name = n;
		size = s;
	}
	
	public String getName() {
		return name;
	}
	
	public int getSize() {
		return size;
	}
	
	public String toString() {
		return "Name: "+this.getName()+"\nSize: "+this.getSize();
	}
}
class Classroom extends Room{
	public Classroom(double a, int numObjects, int s) {
		super(a,numObjects,s);
	}
}
class Cafe extends Room{
	private ArrayList<Drink> drinks;
	private ArrayList<Food> food;
	public Cafe(double a, int numObjects, int s) {
		super(a,numObjects,s);
		drinks = new ArrayList<Drink>();
		food = new ArrayList<Food>();
	}
	
	public String getDrinks() {
		String res = "";
		for(int i=0; i<drinks.size(); i++) {
			res+=drinks.get(i);
		}
		return res;
	}
	
	public String getFood() {
		String res = "";
		for(int i=0; i<food.size(); i++) {
			res+=food.get(i);
		}
		return res;
	}
	
	class Drink{
		private String color;
		private String name;
		private int size;
		
		public Drink(String c, int s, String n) {
			color = c;
			size = s;
			name = n;
		}
		
		public String getName() {
			return name;
		}
		
		public String getColor() {
			return color;
		}
		
		public int getSize() {
			return size;
		}
		
		public String toString() {
			return "Name: "+this.getName()+"\nColor: "+this.getColor()+"\nSize: "+this.getSize();
		}
	}
	
	class Food{
		private String name;
		private int size;
		private String region;
		
		public Food(String c, int s, String r) {
			name = c;
			size = s;
			region = r;
		}
		
		public String getName() {
			return name;
		}
		
		public int getSize() {
			return size;
		}
		
		public String getRegion() {
			return region;
		}
		
		public String toString() {
			return "Name: "+this.getName()+"\nSize: "+this.getSize()+"\nRegion: "+this.getRegion();
		}
	}
}
class Dorm extends Room{
	public Dorm(double a, int numObjects, int s) {
		super(a,numObjects,s);
	}
}


