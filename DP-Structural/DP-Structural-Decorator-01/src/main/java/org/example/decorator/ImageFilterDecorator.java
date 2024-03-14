package org.example.decorator;

import org.example.ImageProcessor;

public abstract class ImageFilterDecorator implements ImageProcessor {
    private final ImageProcessor wrapperProcessor;

    public ImageFilterDecorator(ImageProcessor wrapperProcessor) {
        this.wrapperProcessor = wrapperProcessor;
    }

    @Override
    public void processImage(String image) {
        wrapperProcessor.processImage(image);
    }
}
