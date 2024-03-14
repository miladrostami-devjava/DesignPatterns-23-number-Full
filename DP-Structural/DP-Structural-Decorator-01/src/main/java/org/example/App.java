package org.example;

import org.example.filters.BlurFilter;
import org.example.filters.GrayScaleFilter;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
//        ImageProcessor basicImageProcessor =
//                new BasicImageProcessor();
//ImageProcessor imageProcessor =
//        new GrayScaleFilter(basicImageProcessor);
//        imageProcessor.processImage("image.jpg");
        ImageProcessor basicImageProcessor =
              new BlurFilter
                      (new GrayScaleFilter
                              (new BasicImageProcessor()));
        basicImageProcessor.processImage("image.jpg");

    }
}
