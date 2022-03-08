package city;

public class Building {
	private int height;
	private double area;
	private boolean hasWindows;
	private String type;
	private String name;
	
	public Building(int h, double a, boolean w, String t, String n) {
		height = h;
		area = a;
		hasWindows = w;
		type = t;
		name = n;
	}
	
	public int getHeight() {
		return height;
	}
	
	public double getArea() {
		return area;
	}
	
	public boolean getHasWindows() {
		return hasWindows;
	}
	
	public String getType() {
		return type;
	}
	
	public String getName() {
		return name;
	}
	
	public String toString() {
		return "Height: "+getHeight()+"\nTotal Area: "+getArea()+"\nBuilding Has Windows: "+getHasWindows()+"\nStore Type: "+getType()+"\nName of Store: "+getName();
	}
}
