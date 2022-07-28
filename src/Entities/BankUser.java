package Entities;

public class BankUser {
  private int id;
  private int  userId;
  private int bankId;
public BankUser() {
	super();
	// TODO Auto-generated constructor stub
}
public BankUser(int id, int userId, int bankId) {
	super();
	this.id = id;
	this.userId = userId;
	this.bankId = bankId;
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
public int getBankId() {
	return bankId;
}
public void setBankId(int bankId) {
	this.bankId = bankId;
}

  
  
}
