package com.project1;

public class Employe {
	
	private String ename;
	private int esal;
	private String eadd;
	private String email;
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public int getEsal() {
		return esal;
	}
	public void setEsal(int esal) {
		this.esal = esal;
	}
	public String getEadd() {
		return eadd;
	}
	public void setEadd(String eadd) {
		this.eadd = eadd;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	public Employe() {
		// TODO Auto-generated constructor stub
	}
	public Employe(String ename, int esal, String eadd, String email) {
		super();
		this.ename = ename;
		this.esal = esal;
		this.eadd = eadd;
		this.email = email;
	}
	@Override
	public String toString() {
		return "Employe [ename=" + ename + ", esal=" + esal + ", eadd=" + eadd + ", email=" + email + "]";
	}
	
	

}
