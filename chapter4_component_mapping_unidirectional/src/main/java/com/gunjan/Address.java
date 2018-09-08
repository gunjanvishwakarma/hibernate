package com.gunjan;

public class Address {
    private User user;
    private String street;
    private String zipcode;
    private String city;

    /**
     * @return the street
     */
    public Address() {
    }

    public Address(String street, String zipcode, String city) {
        this.street = street;
        this.zipcode = zipcode;
        this.city = city;
    }

    public String getStreet() {
        return street;
    }

    /**
     * @param street the street to set
     */

    public void setStreet(String street) {
        this.street = street;
    }
/**
 * @return the id
 */

    /**
     * @return the zipcode
     */
    public String getZipcode() {
        return zipcode;
    }

    /**
     * @param zipcode the zipcode to set
     */
    public void setZipcode(String zipcode) {
        this.zipcode = zipcode;
    }

    /**
     * @return the city
     */
    public String getCity() {
        return city;
    }

    /**
     * @param city the city to set
     */
    public void setCity(String city) {
        this.city = city;
    }

    /**
     * @return the user
     */
    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

}
