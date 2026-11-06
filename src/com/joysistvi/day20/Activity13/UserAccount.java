package com.joysistvi.day20.Activity13;

public class UserAccount {

    private String firstName;
    private String middleName;
    private String lastName;
    private String address;
    private String email;
    private String password;



    public String getFirstName() {
        return firstName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getAddress() {
        return address;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }


    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }


    public void setLastName(String lastName) {
        this.lastName = lastName;
    }



    public void setAddress(String address) {
        this.address = address;
    }



    public String getEmail() {
        return email;
    }

    public boolean setEmail(String email) {

        if (email == null) {
            return false;
        }

        String pattern = "^[A-Za-z0-9._%+-]+@[A-Za-z0-9-]+(\\.[A-Za-z0-9-]+)*\\.[A-Za-z]{2,}$";

        if (email.matches(pattern)) {
            this.email = email;
            return true;
        }

        return false;
    }


    // STEP 4: PASSWORD

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }


    // STEP 5: FULL NAME

    public String getFullName() {

        if (middleName == null || middleName.isEmpty()) {
            return firstName + " " + lastName;
        }

        return firstName + " " + middleName + " " + lastName;
    }
}