package com.capgemini.go.entities;

import javax.persistence.*;

@Entity
@Table(name = "addresses")
public class AddressDTO {

    @Id
    private String addressId;
    
	public String getAddressId() {
		return addressId;
	}
	public void setAddressId(String addressId) {
		this.addressId = addressId;
	}
	
	private String retailerId;
	
	public String getRetailerId() {
		return retailerId;
	}
	public void setRetailerId(String retailerId) {
		this.retailerId = retailerId;
	}
	
    private String buildingNo;

	public String getBuildingNo() {
		return buildingNo;
	}
	public void setBuildingNo(String buildingNo) {
		this.buildingNo = buildingNo;
	}
    private String city;

	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
    private String state;

	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
    private String field;

	public String getField() {
		return field;
	}
	public void setField(String field) {
		this.field = field;
	}
    private String zip;

	public String getZip() {
		return zip;
	}
	public void setZip(String zip) {
		this.zip = zip;
	}
}
