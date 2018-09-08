package com.gunjan;

/**
 * This billing strategy uses a simple bank account.
 *
 * @author Christian Bauer
 */
public class BankAccount extends BillingDetails {

    private String account;
    private String bankname;
    private String swift;

    public BankAccount() {

    }

    public BankAccount(String owner, String account, String bankname,
                       String swift) {
        super(owner);
        this.account = account;
        this.bankname = bankname;
        this.swift = swift;
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public String getBankname() {
        return bankname;
    }

    public void setBankname(String bankname) {
        this.bankname = bankname;
    }

    public String getSwift() {
        return swift;
    }

    public void setSwift(String swift) {
        this.swift = swift;
    }

    @Override
    public String toString() {
        return "BankAccount [account=" + account + ", bankname=" + bankname
                + ", swift=" + swift + ", getOwner()=" + getOwner() + "]";
    }

}
