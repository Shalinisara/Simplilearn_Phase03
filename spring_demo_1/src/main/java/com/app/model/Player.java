package com.app.model;

import java.util.List;

public class Player {
	private int id;
	private String name;
	private int age;
	
	private Address permanentAddress;
	private List<Team> teamlist;
	public Player() {
		
	}
	public Player(int id, String name, int age, Address permanentAddress, List<Team> teamlist) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.permanentAddress = permanentAddress;
		this.teamlist = teamlist;
	}
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
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public Address getPermanentAddress() {
		return permanentAddress;
	}
	public void setPermanentAddress(Address permanentAddress) {
		this.permanentAddress = permanentAddress;
	}
	public List<Team> getTeamlist() {
		return teamlist;
	}
	public void setTeamlist(List<Team> teamlist) {
		this.teamlist = teamlist;
	}
	@Override
	public String toString() {
		return "Player [id=" + id + ", name=" + name + ", age=" + age + ", permanentAddress=" + permanentAddress
				+ ", teamlist=" + teamlist + "]";
	}
	
	
}
