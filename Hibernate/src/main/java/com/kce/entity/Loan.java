package com.kce.entity;

import jakarta.persistence.*;
import java.util.List;

@Entity
@Table(name = "LOAN_TBL")
public class Loan {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "loan_seq")
    @SequenceGenerator(name = "loan_seq", sequenceName = "LOAN_SEQ", allocationSize = 1)
    private Long loanID;

    private Long borrowerID;
    private Double principalAmount;
    private Float interestRate;
    private String status;

    @ManyToOne
    @JoinColumn(name = "borrowerID", insertable = false, updatable = false)
    private Borrower borrower;

    @OneToMany(mappedBy = "loan", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Installment> installments;

   
    public Long getLoanID() { 
    	return loanID; }
    public Long getBorrowerID() { 
    	return borrowerID; 
    	}
    public void setBorrowerID(Long borrowerID) {
    	this.borrowerID = borrowerID;
    	}
    public Double getPrincipalAmount() { 
    	
    	return principalAmount; 
    	}
    public void setPrincipalAmount(Double principalAmount) {
    	
    	this.principalAmount = principalAmount; 
    	}
    public Float getInterestRate() { 
    	
    	return interestRate; 
    	}
    public void setInterestRate(Float interestRate) {
    	
    	this.interestRate = interestRate;
    	}
    public String getStatus() {
    	
    	return status; 
    	}
    public void setStatus(String status) {
    	
    	this.status = status; 
    	}
    public Borrower getBorrower() {
    	return borrower; 
    	}
    public List<Installment> getInstallments() {
    	return installments;
    	}
    public void setInstallments(List<Installment> installments) {
    	this.installments = installments; }
}
