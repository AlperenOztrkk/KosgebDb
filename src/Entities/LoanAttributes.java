package Entities;

import java.util.ArrayList;
import java.util.List;

public class LoanAttributes {
 private int id;
 private  int loanId;
 private List<Integer> attributeId=new ArrayList<>();
public LoanAttributes() {
	super();
	// TODO Auto-generated constructor stub
}
public LoanAttributes(int id, int loanId,int... attributeIds ) {
	super();
	this.id = id;
	this.loanId = loanId;
	for( int attributeId : attributeIds) {
		this.attributeId.add(attributeId);
	}
	
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public int getLoanId() {
	return loanId;
}
public void setLoanId(int loanId) {
	this.loanId = loanId;
}
public List<Integer> getAttributeId() {
	return attributeId;
}
public void setAttributeId(int attributeId) {
	this.attributeId.add(attributeId);
}
 
 
}
