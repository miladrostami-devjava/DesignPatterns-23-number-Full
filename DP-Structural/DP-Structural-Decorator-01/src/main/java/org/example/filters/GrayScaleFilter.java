package org.example.filters;

import org.example.ImageProcessor;
import org.example.decorator.ImageFilterDecorator;

public class GrayScaleFilter extends ImageFilterDecorator {

    public GrayScaleFilter(ImageProcessor wrapperProcessor) {
        super(wrapperProcessor);
    }

    @Override
    public void processImage(String image) {
        applyGrayScaleFilter();
        super.processImage(image);
    }

    private void applyGrayScaleFilter(){
        System.out.println("process applying gray scale...");
    }
}
