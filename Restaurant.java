package city;

import java.util.ArrayList;

public class Restaurant extends Building{
	private Menu menu;
	private ArrayList<Table> tables;
	private ArrayList<Employee> employees;
	
	public Restaurant(int h, double a, boolean w, String n) {
		super(h,a,w,"Restaurant",n);
		menu = new Menu();
		tables = new ArrayList<Table>();
		employees = new ArrayList<Employee>();
	}
	
	public void addTable(Table t) {
		tables.add(t);
	}
	
	public void removeTable(Table t) {
		tables.remove(t);
	}
	
	public void fire(Employee e) {
		employees.remove(e);
	}
	
	public void hire(Employee e) {
		employees.add(e);
	}
}
class Table{
	private int seats;
	private int size;
	private ArrayList<Meal> meals;
	public Table(int seat, int siz) {
		seats = seat;
		size = siz;
		meals = new ArrayList<Meal>();
	}
	
	public int getSeats() {
		return seats;
	}
	
	public int size() {
		return size;
	}
	
	public void order(Meal m) {
		meals.add(m);
	}
	
	public void dispose(Meal m) {
		meals.remove(m);
	}
}
class Menu{
	private ArrayList<Meal> meals;
	
	public Menu() {
		meals = new ArrayList<Meal>();
	}
	
	public void addMeals(Meal m) {
		meals.add(m);
	}
	
	public void addMeals(int i, Meal m) {
		meals.add(i,m);
	}
	
	public void removeMeal(Meal m) {
		meals.remove(m);
	}
	
	public void removeMeal(int i) {
		meals.remove(i);
	}
	
	public String toString() {
		return meals+"";
	}
}
class Meal{
	private String name;
	private String color;
	private boolean isKids;
	private double cost;
	
	public Meal(String n, String c, boolean i) {
		name = n;
		color = c;
		isKids = i;
	}
	
	public String getName() {
		return name;
	}
	
	public String getColor() {
		return color;
	}
	
	public boolean getIsKids() {
		return isKids;
	}
	
	public double getCost() {
		cost = Math.random()*50;
		if(isKids) {
			cost/=2;
		}
		return cost;
	}
	public String toString() {
		return "Name: "+this.getName()+"\nColor: "+this.getColor()+"\nIs Kids Meal/Drink: "+this.getIsKids()+"\nCost of dish: "+this.getCost();
	}
}
class Appetizer extends Meal{
	public Appetizer(String n, String c, boolean i) {
		super(n,c,i);
	}
}
class Entree extends Meal{
	public Entree(String n, String c, boolean i) {
		super(n,c,i);
	}
}
class Dessert extends Meal{
	public Dessert(String n, String c, boolean i) {
		super(n,c,i);
	}
}
class Drink extends Meal{
	public Drink(String n, String c, boolean i) {
		super(n,c,i);
	}
}
class Employee{
	private String name;
	private int rate;
	private int workHours;
	
	public Employee(String name, int rate, int workHours) {
		this.name = name;
		this.rate = rate;
		this.workHours = workHours;
	}
	
	public double salary() {
		return rate*(workHours);
	}
	
	public String toString() {
		return "Employee Name: "+this.getName()+"\nRate: "+this.getRate()+"\nCurrent work hours: "+this.getHours();
	}

	public int getRate() {
		return rate;
	}

	public String getName() {
		return name;
	}
	
	public int getHours() {
		return workHours;
	}
}
class Chef extends Employee{
	public Chef(String name, int rate, int workHours) {
		super(name, rate, workHours);
	}
}
class Server extends Employee{
	public Server(String name, int rate, int workHours) {
		super(name, rate, workHours);
	}
}