package com.joysistvi.day21.Activity14;

public class UserAccount {

    // ---------- PART 1: Fields (private) ----------
    private String firstName;
    private String middleName;
    private String lastName;
    private String address;
    private String email;
    private String password;

    // ---------- PART 2: Constructor (NEW) ----------
    public UserAccount(String firstName, String middleName, String lastName,
                       String address, String email, String password) {
        this.firstName = firstName;     // no rules, assign directly
        this.middleName = middleName;
        this.lastName = lastName;
        this.address = address;
        this.setEmail(email);           // has rules, so use the setter
        this.setPassword(password);     // has rules, so use the setter
    }

    // ---------- PART 3: Getters and setters ----------
    public String getFirstName() { return firstName; }
    public void setFirstName(String firstName) { this.firstName = firstName; }

    public String getMiddleName() { return middleName; }
    public void setMiddleName(String middleName) { this.middleName = middleName; }

    public String getLastName() { return lastName; }
    public void setLastName(String lastName) { this.lastName = lastName; }

    public String getAddress() { return address; }
    public void setAddress(String address) { this.address = address; }

    public String getEmail() { return email; }
    public String getPassword() { return password; }

    // Email rule: needs one @, text before it, and a dot with text after the @.
    public void setEmail(String email) {
        int at = email.indexOf('@');
        int dot = email.lastIndexOf('.');
        boolean valid = at > 0
                && at == email.lastIndexOf('@')
                && dot > at + 1
                && dot < email.length() - 1
                && !email.contains(" ");

        if (valid) {
            this.email = email;
        } else {
            System.out.println("Invalid email format.");   // email stays null
        }
    }

    // Password rules: 8+ characters, one uppercase, one lowercase, one digit.
    public void setPassword(String password) {
        boolean hasUpper = false, hasLower = false, hasDigit = false;
        for (char c : password.toCharArray()) {
            if (Character.isUpperCase(c)) hasUpper = true;
            if (Character.isLowerCase(c)) hasLower = true;
            if (Character.isDigit(c)) hasDigit = true;
        }

        if (password.length() < 8) {
            System.out.println("Invalid password: must be at least 8 characters.");
        } else if (!hasUpper) {
            System.out.println("Invalid password: needs an uppercase letter.");
        } else if (!hasLower) {
            System.out.println("Invalid password: needs a lowercase letter.");
        } else if (!hasDigit) {
            System.out.println("Invalid password: needs a digit.");
        } else {
            this.password = password;
        }
    }

    // ---------- PART 4: toString (NEW) ----------
    // The password is left out on purpose: printing it would expose
    // a secret on screens, logs, and anywhere the object is displayed.
    @Override
    public String toString() {
        return "=== Account Details ===\n"
                + "Full Name: " + firstName + " " + middleName + " " + lastName + "\n"
                + "Email: " + email + "\n"
                + "Address: " + address;
    }
}