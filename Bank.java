package city;

class Account{
	private String name;
	private int id;
	private double balance;
	private final double rate = 0.07;
	public Account(String name, int id) {
		this.name = name;
		this.id = id;
		balance = 0;
	}
	
	public void zeroBalance() {
		balance = 0;
	}
	
	public void deposit(double amount) {
		balance+=amount;
	}
	
	public void withdraw(double amount) {
		if(balance-amount>0) 
			balance-=amount;
	}
	
	public String getName() {
		return name;
	}
	
	public int getID() {
		return id;
	}
	
	public double getInterest(int time) {
		balance+=balance*(1+rate)*time;
		return balance*rate*time;
	}
	
	public String toString() {
		return "Name: "+getName()+"\nID: "+getID();
	}
}

public class Bank extends Building{
	private Account[] accounts;
	
	public Bank(int h, double a, boolean w, String n, int acc) {
		super(h,a,w,"Bank",n);
		accounts = new Account[acc];
	}
	
	public void occupy(int spot, Account a) {
		if(accounts[spot]==null)
			accounts[spot] = a;
	}
	
	public void leave(int spot) {
		accounts[spot] = null;
	}
	
	public Account getAccount(int s) {
		return accounts[s];
	}
	
	public String toString() {
		String accts = "";
		for(int i=0; i<accounts.length; i++) {
			accts+=accounts[i]+"  ";
		}
		return "Height: "+getHeight()+"\nTotal Area: "+getArea()+"\nBuilding Has Windows: "+getHasWindows()+"\nStore Type: "+getType()+"\nName of Store: "+getName()+"\nAccounts: "+accts;
	}
	
	public static void main(String[] args) {
		Bank bank = new Bank(1233,45.24,false,"Bank of Uganda",4);
		System.out.println(bank);
	}
}
