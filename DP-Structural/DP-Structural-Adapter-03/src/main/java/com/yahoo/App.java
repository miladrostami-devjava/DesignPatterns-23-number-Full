package com.yahoo;

import com.yahoo.googlecloud.GoogleServiceAdapter;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
GoogleService googleService = new GoogleService();
        GoogleServiceAdapter googleServiceAdapter
                = new GoogleServiceAdapter(googleService);
        googleServiceAdapter.serviceUploading("google uploaded");

    }
}
