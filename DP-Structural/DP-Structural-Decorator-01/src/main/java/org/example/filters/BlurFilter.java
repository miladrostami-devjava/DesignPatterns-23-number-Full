package org.example.filters;

import org.example.ImageProcessor;
import org.example.decorator.ImageFilterDecorator;

public class BlurFilter extends ImageFilterDecorator {

    public BlurFilter(ImageProcessor wrapperProcessor) {
        super(wrapperProcessor);
    }

    @Override
    public void processImage(String image) {
        applyBlurFilter();
        super.processImage(image);
    }

    private void applyBlurFilter(){
        System.out.println("process applying blur filter...");


    }

}
