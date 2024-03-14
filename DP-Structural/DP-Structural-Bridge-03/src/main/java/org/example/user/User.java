package org.example.user;

import org.example.social.SocialMediaPlatForm;

public abstract class User {
    protected final SocialMediaPlatForm socialMediaPlatForm;

    public User(SocialMediaPlatForm socialMediaPlatForm) {
        this.socialMediaPlatForm = socialMediaPlatForm;
    }

   public abstract void post(String content);
}
