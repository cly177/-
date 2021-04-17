package com.wtu;

public class Student {
	private String sId;
	private String sName;
	
	public Student() {
		
	}

	public String getsId() {
		return sId;
	}

	public void setsId(String sId) {
		this.sId = sId;
	}

	public String getSname() {
		return sName;
	}

	public void setsName(String sname) {
		sName = sname;
	}

	@Override
	public String toString() {
		return "[" + sId + " " + sName + "]";
	}
	
	
}
