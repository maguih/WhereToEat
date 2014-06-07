package com.example.wheretoeat;

public class Food {
	private String ID;
	private String place;
	private String name;
	private double grade;
	
	public Food(String id, String p, String n) {
		ID = id;
		place = p;
		name = n;
	}
	public String getID() {
		return ID;
	}
	public String getPlace() {
		return place;
	}
	public String getName() {
		return name;
	}
	public double getGrade() {
		return grade;
	}
	public void setPlace(String p) {
		place = p;
	}
	public void setName(String n) {
		name = n;
	}
	public void setGrade(double g) {
		grade = g;
	}
}
