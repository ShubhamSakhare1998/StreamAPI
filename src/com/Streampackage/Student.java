package com.Streampackage;

public class Student {
	
	  private int id;
	  private String name;
	  private String address;
	  private String clg;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getClg() {
		return clg;
	}
	public void setClg(String clg) {
		this.clg = clg;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", address=" + address + ", clg=" + clg + "]";
	}
	public Student(int id, String name, String address, String clg, String string) {
		
		this.id = id;
		this.name = name;
		this.address = address;
		this.clg = clg;
	}
	  
	 
}
