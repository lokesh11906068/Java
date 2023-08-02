package com.oops.abstart;

public class BankMain {
	public static void main(String[] args) {
		Bank bank=new Branch1();	
		bank.admin();
		bank.carLoan();
		bank.eduLoan();
		bank.HouseLoan();
		
		Branch1 branch1=(Branch1) bank;
		branch1.staffDetails();
		
		bank=new SubBranch();
		bank.eduLoan();
		bank.HouseLoan();
		
		SubBranch subBranch=(SubBranch) bank;
		subBranch.loanType();
		subBranch.subpay();
		
		Branch2 branch2=(Branch2) bank;
		branch2.loanType();
		
	}
}
