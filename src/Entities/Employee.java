package Entities;

public class Employee extends User {
private int id;
private String name;
private String centerId;
private String registrationNumber;
public Employee() {
	super();
	// TODO Auto-generated constructor stub
}
public Employee(int id, String password, String userName) {
	super(id, password, userName);
	// TODO Auto-generated constructor stub
}
public Employee(int id, String name, String centerId, String registrationNumber) {
	super();
	this.id = id;
	this.name = name;
	this.centerId = centerId;
	this.registrationNumber = registrationNumber;
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getCenterId() {
	return centerId;
}
public void setCenterId(String centerId) {
	this.centerId = centerId;
}
public String getRegistrationNumber() {
	return registrationNumber;
}
public void setRegistrationNumber(String registrationNumber) {
	this.registrationNumber = registrationNumber;
}

}
