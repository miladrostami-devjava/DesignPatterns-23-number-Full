package org.example;

import org.example.social.Instagram;
import org.example.social.SocialMediaPlatForm;
import org.example.social.Twitter;
import org.example.user.InfluencerUser;
import org.example.user.RegularUser;
import org.example.user.User;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        SocialMediaPlatForm instagram = new Instagram();
        User milad = new InfluencerUser(instagram);
        milad.post("content instagram ok!!!");

        new RegularUser( new Twitter()).post("content twitter ok!!!");

    }
}
