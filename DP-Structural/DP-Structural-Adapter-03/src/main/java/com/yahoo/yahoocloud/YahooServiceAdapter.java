package com.yahoo.yahoocloud;

import com.yahoo.YahooServiceUpload;
import com.yahoo.uploading.ServiceUploading;

public class YahooServiceAdapter implements ServiceUploading {
    private final YahooServiceUpload yahooService;

    public YahooServiceAdapter(YahooServiceUpload yahooService) {
        this.yahooService = yahooService;
    }

    @Override
    public void serviceUploading(String upload) {
yahooService.yahooServiceUpload(upload);
    }
}
