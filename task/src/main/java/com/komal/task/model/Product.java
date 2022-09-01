package com.komal.task.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity  
  
@Table  
public class Product {
	@Id  
	@Column 
private int id;
	@Column 
private String pname;
	@Column 
private String type;
	@Column 
private String category;
	@Column 
private int price;
public Product(int id, String pname, String type, String category, int price) {
	super();
	this.id = id;
	this.pname = pname;
	this.type = type;
	this.category = category;
	this.price = price;
}
public Product() {
	super();
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getPname() {
	return pname;
}
public void setPname(String pname) {
	this.pname = pname;
}
public String getType() {
	return type;
}
public void setType(String type) {
	this.type = type;
}
public String getCategory() {
	return category;
}
public void setCategory(String category) {
	this.category = category;
}
public int getPrice() {
	return price;
}
public void setPrice(int price) {
	this.price = price;
}

}
