package org.example.model;

public class User {
    private String email;
    private String mobile;
    private String token;

    public User(String email, String mobile, String token) {
        this.email = email;
        this.mobile = mobile;
        this.token = token;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }
}
