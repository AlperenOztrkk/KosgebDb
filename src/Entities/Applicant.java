package Entities;

public class Applicant extends User {
 private int id;
 private int userId;
 
 
public Applicant() {
	super();
	// TODO Auto-generated constructor stub
}
public Applicant(Applicant applicant) {
	this.id=applicant.getId();
	this.userId=applicant.getId();
	
}

public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public int getUserId() {
	return userId;
}
public void setUserId(int userId) {
	this.userId = userId;
}
 
}
