package com.example.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table
public class AjayModel {
@Id
private String id;
private String name;
private String address;
public AjayModel(String id, String name, String address) {
	super();
	this.id = id;
	this.name = name;
	this.address = address;
}
public AjayModel() {
	
}
public String getId() {
	return id;
}
public void setId(String id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getAddress() {
	return address;
}
public void setAddress(String address) {
	this.address = address;
}

}
