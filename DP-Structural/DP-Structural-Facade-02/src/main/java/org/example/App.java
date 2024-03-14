package org.example;

import org.example.enums.CodecType;
import org.example.models.VideoFiles;
import org.example.video.VideoDecoder;
import org.example.video.VideoEncoder;
import org.example.video.VideoTranscoderFacade;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
String inputFilePath = "input.mov";
String outputFilePath = "output.mp4";

//        VideoEncoder videoEncoder = new VideoEncoder();
//        VideoDecoder videoDecoder = new VideoDecoder();
//        VideoFiles decoder = videoDecoder.decodeVideo(inputFilePath);
//        VideoFiles encodedVideoFile = videoEncoder.encodeVideo(decoder.toString());
//        save(encodedVideoFile);

        VideoTranscoderFacade convertor = new VideoTranscoderFacade();
        convertor.convertVideo(inputFilePath,outputFilePath, CodecType.MPEG4);

    }

}
