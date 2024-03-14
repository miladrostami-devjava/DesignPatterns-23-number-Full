package com.yahoo.googlecloud;

import com.yahoo.GoogleService;
import com.yahoo.uploading.ServiceUploading;

public class GoogleServiceAdapter implements ServiceUploading {
    private final GoogleService googleService;

    public GoogleServiceAdapter(GoogleService googleService) {
        this.googleService = googleService;
    }

    @Override
    public void serviceUploading(String upload) {
googleService.googleServiceUpload(upload);
    }
}
