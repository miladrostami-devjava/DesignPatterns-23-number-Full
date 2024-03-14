package org.example.video;

import org.example.enums.CodecType;
import org.example.models.VideoFiles;

public class VideoEncoder {
    public VideoFiles encodeVideo(VideoFiles videoFiles,CodecType type){
        System.out.println("Encoding video ...." + type);
        //todo: process converting algorithm
        return new VideoFiles();
    }
}
