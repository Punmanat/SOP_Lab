package com.patrick.lab.sop_lab;

public class HelloOb {

	private String fullname;
	private String lastname;
	
	public HelloOb(String fullname, String lastname) {
		super();
		this.fullname = fullname;
		this.lastname = lastname;
	}
	public String getFullname() {
		return fullname;
	}
	public void setFullname(String fullname) {
		this.fullname = fullname;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	@Override
	public String toString() {
		return "HelloOb [fullname=" + fullname + ", lastname=" + lastname + "]";
	}
	
	
	
}
