package com.gunjan;

import java.util.Date;

public class User {
    private long id;
    private String lastName;
    private String userName;
    private String password;
    private String email;
    private int rank;
    private boolean isAdmin;
    private String homeStreet;
    private String homeZipCode;
    private Date dateCreated;

    public User() {

    }

    public User(String lastName, String userName, String password,
                String email, int rank, boolean isAdmin, String homeStreet,
                String homeZipCode, Date dateCreated) {
        this.lastName = lastName;
        this.userName = userName;
        this.password = password;
        this.email = email;
        this.rank = rank;
        this.isAdmin = isAdmin;
        this.homeStreet = homeStreet;
        this.homeZipCode = homeZipCode;
        this.dateCreated = dateCreated;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getRank() {
        return rank;
    }

    public void setRank(int rank) {
        this.rank = rank;
    }

    public boolean getIsAdmin() {
        return isAdmin;
    }

    public void setIsAdmin(boolean isAdmin) {
        this.isAdmin = isAdmin;
    }

    public String getHomeStreet() {
        return homeStreet;
    }

    public void setHomeStreet(String homeStreet) {
        this.homeStreet = homeStreet;
    }

    public String getHomeZipCode() {
        return homeZipCode;
    }

    public void setHomeZipCode(String homeZipCode) {
        this.homeZipCode = homeZipCode;
    }

    public Date getDateCreated() {
        return dateCreated;
    }

    public void setDateCreated(Date dateCreated) {
        this.dateCreated = dateCreated;
    }

    @Override
    public String toString() {
        return "User [id=" + id + ", lastName=" + lastName + ", userName="
                + userName + ", password=" + password + ", email=" + email
                + ", rank=" + rank + ", isAdmin=" + isAdmin + ", homeStreet="
                + homeStreet + ", homeZipCode=" + homeZipCode
                + ", dateCreated=" + dateCreated + "]";
    }

}