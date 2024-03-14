package org.example.facade;

import org.example.generatingTools.ExcelGenerator;
import org.example.generatingTools.PDFGenerator;
import org.example.generatingTools.WordGenerator;

public class DocumentGeneratorFacade {
    private final PDFGenerator pdfGenerator;
    private final WordGenerator wordGenerator;
    private final ExcelGenerator excelGenerator;

    public DocumentGeneratorFacade() {
        pdfGenerator = new PDFGenerator();
        wordGenerator = new WordGenerator();
        excelGenerator = new ExcelGenerator();
    }
    public void setPdfGenerator(String content){
        pdfGenerator.generate(content);
    }
    public void setWordGenerator(String content){
        wordGenerator.generate(content);
    }

    public void setExcelGenerator(String content){
        excelGenerator.generate(content);
    }




}
