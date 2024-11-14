package com.yash.trainingsys.model;

public class Training {
	private long id;
	private String name;
	private String requesterName;
	
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
	public String getRequesterName() {
		return requesterName;
	}
	public void setRequesterName(String requesterName) {
		this.requesterName = requesterName;
	}
	@Override
	public String toString() {
		return "Training [id=" + id + ", name=" + name + ", requesterName=" + requesterName + "]";
	}
	
	

}
