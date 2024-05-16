/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author tungl
 */
public class Author {
    private String authorId;
    private String authorLastname;
    private String authorFirstname;
    private String phone;
    private String address;
    private String city;
    private String state;
    private String zip;
    private boolean contract;

    public Author() {
    }

    public Author(String authorId, String authorLastname, String authorFirstname, String phone, String address, String city, String state, String zip, boolean contract) {
        this.authorId = authorId;
        this.authorLastname = authorLastname;
        this.authorFirstname = authorFirstname;
        this.phone = phone;
        this.address = address;
        this.city = city;
        this.state = state;
        this.zip = zip;
        this.contract = contract;
    }

    public String getAuthorId() {
        return authorId;
    }

    public void setAuthorId(String authorId) {
        this.authorId = authorId;
    }

    public String getAuthorLastname() {
        return authorLastname;
    }

    public void setAuthorLastname(String authorLastname) {
        this.authorLastname = authorLastname;
    }

    public String getAuthorFirstname() {
        return authorFirstname;
    }

    public void setAuthorFirstname(String authorFirstname) {
        this.authorFirstname = authorFirstname;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getZip() {
        return zip;
    }

    public void setZip(String zip) {
        this.zip = zip;
    }

    public boolean isContract() {
        return contract;
    }

    public void setContract(boolean contract) {
        this.contract = contract;
    }

    @Override
    public String toString() {
        return "Author{" + "authorId=" + authorId + ", authorLastname=" + authorLastname + ", authorFirstname=" + authorFirstname + ", phone=" + phone + ", address=" + address + ", city=" + city + ", state=" + state + ", zip=" + zip + ", contract=" + contract + '}';
    }
}
