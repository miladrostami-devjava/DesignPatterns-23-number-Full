package org.example.video;

import org.example.enums.CodecType;
import org.example.models.VideoFiles;

public class VideoDecoder {
    public VideoFiles decodeVideo(String videoPath){
        System.out.println("Decoding video ..." + videoPath);
        //todo: process converting algorithm
        return new VideoFiles();
    }

}
