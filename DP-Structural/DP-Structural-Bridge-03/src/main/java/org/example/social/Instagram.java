package org.example.social;

public class Instagram implements SocialMediaPlatForm{
    @Override
    public void login(String username, String password) {
        System.out.println("logging in Instagram!!! ");
    }
}
