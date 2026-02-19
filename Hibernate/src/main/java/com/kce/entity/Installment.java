package com.kce.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "INSTALLMENT_TBL")
public class Installment {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "inst_seq")
    @SequenceGenerator(name = "inst_seq", sequenceName = "INSTALLMENT_SEQ", allocationSize = 1)
    private Long installmentID;

    private Long loanID;
    private Double dueAmount;
    private String status;

    @ManyToOne
    @JoinColumn(name = "loanID", insertable = false, updatable = false)
    private Loan loan;

   
    public Long getInstallmentID() {
    	
    	return installmentID; 
    	}
    public Long getLoanID() { 
    	
    	return loanID;
    	}
    public void setLoanID(Long loanID) {
    	
    	this.loanID = loanID;
    	}
    public Double getDueAmount() { 
    	
    	return dueAmount; 
    	}
    public void setDueAmount(Double dueAmount) { 
    	
    	this.dueAmount = dueAmount;
    	}
    public String getStatus() { 
    	
    	return status; 
    	}
    public void setStatus(String status) {
    	
    	this.status = status; 
    	}
    public Loan getLoan() { 
    	
    	return loan;
    	}
}
