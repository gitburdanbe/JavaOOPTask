package com.company;

public class User {

    private final String email;
    private String password;

    public User(String email, String password) {
        this.email = email;
        this.setPassword(password);
    }

    public String getEmail() { return email; }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {

        if (password.length()>= 8){ this.password = password; }

        else{
            throw new IllegalStateException("Password should be more than 8");
        }

    }
}
