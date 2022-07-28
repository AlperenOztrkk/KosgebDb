package Entities;

public class Application  {
 private int id;
 private int applicantId;
 private int loanId;
public Application() {
	super();
	// TODO Auto-generated constructor stub
}
public Application(int id, int applicantId, int loanId) {
	super();
	this.id = id;
	this.applicantId = applicantId;
	this.loanId = loanId;
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
public int getLoanId() {
	return loanId;
}
public void setLoanId(int loanId) {
	this.loanId = loanId;
}
 
}
