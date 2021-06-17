package com.example.demo;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor

public class ProductRequestedBean {
	
	
	private String owner;
	private String requester;
	private String namerequester;
	private String product;
	private double price;
	private long objectid;
	private String daterequested;
	private String nameowner;
	private String idConversation;
	
	
	public String getOwner() {
		return owner;
	}
	public void setOwner(String owner) {
		this.owner = owner;
	}
	public String getRequester() {
		return requester;
	}
	public void setRequester(String requester) {
		this.requester = requester;
	}
	public String getNamerequester() {
		return namerequester;
	}
	public void setNamerequester(String namerequester) {
		this.namerequester = namerequester;
	}
	
	public String getProduct() {
		return product;
	}
	public void setProduct(String product) {
		this.product = product;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public long getObjectid() {
		return objectid;
	}
	public void setObjectid(long objectid) {
		this.objectid = objectid;
	}

	public String getDaterequested() {
		return daterequested;
	}
	public void setDaterequested(String daterequested) {
		this.daterequested = daterequested;
	}

	
	public String getNameowner() {
		return nameowner;
	}
	public void setNameowner(String nameowner) {
		this.nameowner = nameowner;
	}
	public String getIdConversation() {
		return idConversation;
	}
	public void setIdConversation(String idConversation) {
		this.idConversation = idConversation;
	}
	
	

}
