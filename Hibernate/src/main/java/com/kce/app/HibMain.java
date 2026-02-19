package com.kce.app;

import com.kce.entity.Borrower;
import com.kce.entity.Loan;
import com.kce.entity.Installment;
import com.kce.service.Service;
import java.sql.Date;

public class HibMain {

    private static Service service = new Service();

    public static void main(String[] args) {
        System.out.println("--- Microfinance Loan & Repayment Console ---");

        Borrower b = new Borrower();
        b.setFullName("Anitharani");
        b.setGender("FEMALE");
        b.setDateOfBirth(Date.valueOf("1999-05-10"));
        b.setVillageOrArea("Sunshine Village");
        b.setRiskCategory("LOW");
        b.setStatus("ACTIVE");

        System.out.println(service.addBorrower(b) ? "Borrower Registered" : "Borrower Registration Failed");

        Loan loan = new Loan();
        loan.setBorrowerID(b.getBorrowerID()); 
        loan.setPrincipalAmount(50000.0);
        loan.setInterestRate(7.5f);
        loan.setStatus("ACTIVE");

        System.out.println(service.addLoan(loan) ? "Loan Created" : "Loan Creation Failed");
        Installment inst = new Installment();
        inst.setLoanID(loan.getLoanID());
        inst.setDueAmount(5000.0);
        inst.setStatus("PENDING");

        System.out.println(service.addInstallment(inst) ? "Installment Added" : "Installment Addition Failed");
        System.out.println("\nAll operations completed!");
    }
}
