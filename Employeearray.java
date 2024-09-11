package com.collection;

public class Employeearray {
	
	private String Employename;
	private int Employeid;
	
	
	public String getEmployename() {
		return Employename;
	}
	public void setEmployename(String employename) {
		Employename = employename;
	}
	public int getEmployeid() {
		return Employeid;
	}
	public void setEmployeid(int employeid) {
		Employeid = employeid;
	}
	
	
	public Employeearray() {
		// TODO Auto-generated constructor stub
	}
	
	
	public Employeearray(String employename, int employeid) {
		super();
		Employename = employename;
		Employeid = employeid;
	}
	
	
	@Override
	public String toString() {
		return "Employeearray [Employename=" + Employename + ", Employeid=" + Employeid + "]";
	}
	
	
	

}
