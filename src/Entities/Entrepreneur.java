package Entities;

public class Entrepreneur extends Applicant {
 private int entrepreneurId;
 private String firtName;
 private String lastName;
public Entrepreneur() {
	super();
	// TODO Auto-generated constructor stub
}
public Entrepreneur(int id, String firtName, String lastName) {
	super();
	this.entrepreneurId = id;
	this.firtName = firtName;
	this.lastName = lastName;
}
public int getId() {
	return entrepreneurId;
}
public void setId(int id) {
	this.entrepreneurId = id;
}
public String getFirtName() {
	return firtName;
}
public void setFirtName(String firtName) {
	this.firtName = firtName;
}
public String getLastName() {
	return lastName;
}
public void setLastName(String lastName) {
	this.lastName = lastName;
}
 
}
