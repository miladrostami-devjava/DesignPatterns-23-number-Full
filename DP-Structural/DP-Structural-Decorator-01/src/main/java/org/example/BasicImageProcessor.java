package org.example;

public class BasicImageProcessor implements ImageProcessor{
    @Override
    public void processImage(String image) {
        System.out.println("image processor :" + image);
    }
}
