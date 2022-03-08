package city;

import java.util.Scanner;

public class Metro {
	private Building[][] builds;
	//streets are horizontal and avenues are vertical
	public Metro(int streets, int avenues) {
		builds = new Building[streets][avenues];
	}
	
	public void open(Building b, int str, int avn) {
		builds[str][avn]=b;
	}
	
	public void close(int str, int avn) {
		builds[str][avn]=null;
	}
	
	public String toString() {
		String list = "";
		for(int i=0; i<builds.length; i++) {
			for(int j=0; j<builds[i].length; j++) {
				list+=builds[i][j]+"  ";
			}
			list+="\n";
		}
		return list;
	}
	
	public static void main(String[] args) {
		System.out.println(new Metro(4,2));
	}
}
