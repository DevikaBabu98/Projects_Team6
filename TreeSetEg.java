package com.collections;

import java.util.Comparator;
import java.util.Iterator;
import java.util.TreeSet;

class Country{
	private String name;
	private double gdp;
	
	public Country(String name, double gdp) {
		super();
		this.name = name;
		this.gdp = gdp;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getGdp() {
		return gdp;
	}
	public void setGdp(double gdp) {
		this.gdp = gdp;
	}
	
	@Override
	public String toString() {
		return "Country [name = "+name+", gdp = "+gdp+ "]";
	}
	
}

public class TreeSetEg {

	public static void main(String[] args) {
		
		TreeSet<Country> tss=new TreeSet<Country>(new MyComparator());
		
		tss.add(new Country("name1",2345.4));
		tss.add(new Country("name2",3564.5));
		tss.add(new Country("name3",4675.8));
		tss.add(new Country("name4",3342.9));
		
		Iterator<Country> itrs=tss.iterator();
		
		for(;itrs.hasNext();) {
			System.out.println(itrs.next());
		}
		
	}

}

class MyComparator implements Comparator<Country>{
	
	@Override
	public int compare(Country ctry1,Country ctry2) {
		return (int)(ctry2.getGdp()-ctry1.getGdp());
	}
	
	
}
