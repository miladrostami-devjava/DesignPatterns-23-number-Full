package org.example.user;

import org.example.social.SocialMediaPlatForm;

public class InfluencerUser extends User {
    public InfluencerUser(SocialMediaPlatForm socialMediaPlatForm) {
        super(socialMediaPlatForm);
    }

    @Override
   public void post(String content) {
        socialMediaPlatForm.login("","");

        System.out.println(content);
    }
}
