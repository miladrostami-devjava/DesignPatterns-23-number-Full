package org.example.video;

import org.example.enums.CodecType;
import org.example.models.VideoFiles;

public class VideoTranscoderFacade {
    private final VideoDecoder decoder;
    private final VideoEncoder encoder;


    public VideoTranscoderFacade() {
        decoder = new VideoDecoder();
        encoder = new VideoEncoder();
    }
    public void convertVideo(String input, String output, CodecType type){
        VideoFiles decodeVideo = decoder.decodeVideo(input);
        VideoFiles encodedVideo = encoder.encodeVideo(decodeVideo,type);
        saveVideoFile(encodedVideo,output);
    }

    private void saveVideoFile(VideoFiles encodedVideo, String output) {
        System.out.println("video converted to ..." + output);
    }
}
