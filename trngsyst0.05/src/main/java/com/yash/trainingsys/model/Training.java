package com.yash.trainingsys.model;

public class Training {
	private long id;
	private String name;
	private String rname;
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public String getRname() {
		return rname;
	}
	public void setRname(String rname) {
		this.rname = rname;
	}
	@Override
	public String toString() {
		return "Training [id=" + id + ", name=" + name + ", requesterName=" + rname + "]";
	}
	
	

}
