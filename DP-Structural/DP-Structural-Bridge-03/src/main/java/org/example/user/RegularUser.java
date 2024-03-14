package org.example.user;

import org.example.social.SocialMediaPlatForm;

public class RegularUser extends User {

    public RegularUser(SocialMediaPlatForm socialMediaPlatForm) {
        super(socialMediaPlatForm);
    }

    @Override
  public   void post(String content) {
        socialMediaPlatForm.login("","");
        System.out.println(content);
    }
}
