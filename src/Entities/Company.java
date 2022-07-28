package Entities;

public class Company  extends Applicant{
  private int id;
  private int applicantId;
  private String title;
public Company() {
	super();
	// TODO Auto-generated constructor stub
}
public Company(int id, int applicantId, String title) {
	super();
	this.id = id;
	this.applicantId = applicantId;
	this.title = title;
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.applicantId = id;
}
public int getApplicantId() {
	return applicantId;
}
public void setApplicantId(int applicantId) {
	this.applicantId = applicantId;
}
public String getTitle() {
	return title;
}
public void setTitle(String title) {
	this.title = title;
}
  
}
