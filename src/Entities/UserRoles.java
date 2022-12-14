package Entities;

import java.util.ArrayList;
import java.util.List;

public class UserRoles  extends Roles{
 private int id;
 private int userId;
 private List<Integer> roleId=new ArrayList<>();
public UserRoles() {
	super();
}
public UserRoles(int id, int userId,int... roleIds) {
	super();
	this.id = id;
	this.userId = userId;
	for(int roleId :roleIds) {
		this.roleId.add(roleId);
	}
	
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
public List<Integer> getRoleId() {
	return roleId;
}
public void setRoleId(List<Integer> roleId) {
	this.roleId = roleId;
}
 
 
}
