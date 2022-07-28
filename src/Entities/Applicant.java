package Entities;

public class Applicant extends User {
 private int applicantId;
 private int userId;
 
 
public Applicant() {
	super();
	// TODO Auto-generated constructor stub
}
public Applicant(Applicant applicant) {
	this.applicantId=applicant.getId();
	this.userId=applicant.getId();
	
}

public int getId() {
	return applicantId;
}
public void setId(int id) {
	this.applicantId = id;
}
public int getUserId() {
	return userId;
}
public void setUserId(int userId) {
	this.userId = userId;
}
 
}
