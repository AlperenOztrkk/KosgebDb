package Entities;

public class BlackList {
 private int id;
 private int applicantId;
public BlackList() {
	super();
	// TODO Auto-generated constructor stub
}
public BlackList(int id, int applicantId) {
	super();
	this.id = id;
	this.applicantId = applicantId;
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public int getApplicantId() {
	return applicantId;
}
public void setApplicantId(int applicantId) {
	this.applicantId = applicantId;
}
 
} 
