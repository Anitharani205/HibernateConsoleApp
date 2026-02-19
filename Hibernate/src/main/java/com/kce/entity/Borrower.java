package com.kce.entity;

import jakarta.persistence.*;
import java.sql.Date;
import java.util.List;

@Entity
@Table(name = "BORROWER_TBL")
public class Borrower {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "borrower_seq")
    @SequenceGenerator(name = "borrower_seq", sequenceName = "BORROWER_SEQ", allocationSize = 1)
    private Long borrowerID;

    private String fullName;
    private String gender;
    private Date dateOfBirth;
    private String villageOrArea;
    private String riskCategory;
    private String status;

    @OneToMany(mappedBy = "borrower", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Loan> loans;

  
    public Long getBorrowerID() { 
    	
    	return borrowerID; 
    	}
    public String getFullName() {
    	
    	return fullName; }
    public void setFullName(String fullName) { 
    	
    	this.fullName = fullName; }
    public String getGender() {
    	
    	return gender;
    	}
    public void setGender(String gender) {
    	
    	this.gender = gender;}
    public Date getDateOfBirth() {
    	return dateOfBirth;
    	}
    public void setDateOfBirth(Date dateOfBirth) {
    	this.dateOfBirth = dateOfBirth;
    	}
    public String getVillageOrArea() { 
    	return villageOrArea; 
    	}
    public void setVillageOrArea(String villageOrArea) { 
    	this.villageOrArea = villageOrArea; 
    	}
    public String getRiskCategory() {
    	return riskCategory; 
    	}
    public void setRiskCategory(String riskCategory) { 
    	this.riskCategory = riskCategory;
    	}
    public String getStatus() { 
    	return status; 
    	}
    public void setStatus(String status) {
    	this.status = status; 
    	}
    public List<Loan> getLoans() { 
    	return loans; 
    	}
    public void setLoans(List<Loan> loans) {
    	this.loans = loans; }
}
