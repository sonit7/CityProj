package city;

import java.util.ArrayList;

public class Bakery extends Building{
	private ArrayList<Treat> desserts;
	
	public Bakery(int h, double a, boolean w, String n) {
		super(h,a,w,"Bakery",n);
		desserts = new ArrayList<Treat>();
	}
	
	public String toString() {
		String res = "";
		for(int i=0; i<desserts.size(); i++) {
			res+=desserts.get(i);
		}
		return "Height: "+getHeight()+"\nTotal Area: "+getArea()+"\nBuilding Has Windows: "+getHasWindows()+"\n"+res;
	}
}
class Treat{
	private String name;
	private int size;
	private String color;
	
	public Treat(String n, int s, String c) {
		name = n;
		size = s;
		color = c;
	}
	
	public String getName() {
		return name;
	}
	
	public int getSize() {
		return size;
	}
	
	public String getColor() {
		return color;
	}
	
	public String toString() {
		return "Name: "+this.getName()+"\nSize: "+this.getSize()+"\nColor: "+this.getColor();
	}
}

