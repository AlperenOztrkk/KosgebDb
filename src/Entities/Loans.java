package Entities;

public class Loans {
 private int id;
 private String loanName;
 private String startDate;
 
public Loans(int id, String loanName, String startDate) {
	super();
	this.id = id;
	this.loanName = loanName;
	this.startDate = startDate;
	
}
public Loans() {
	super();
	// TODO Auto-generated constructor stub
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getLoanName() {
	return loanName;
}
public void setLoanName(String loanName) {
	this.loanName = loanName;
}
public String getStartDate() {
	return startDate;
}
public void setStartDate(String startDate) {
	this.startDate = startDate;
}

 
}
