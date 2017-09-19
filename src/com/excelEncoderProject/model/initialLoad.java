package com.excelEncoderProject.model;

public class initialLoad {

	public initialLoad() {
		super();
		// TODO Auto-generated constructor stub
	}
	public initialLoad(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	int id;
	String name;
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
}
