package org.example.arabic;

import org.example.translator.LanguageTranslator;

public class ArabicTranslateAdapter implements LanguageTranslator {
    private final ArabicTranslate arabicTranslate;

    public ArabicTranslateAdapter(ArabicTranslate arabicTranslate) {
        this.arabicTranslate = arabicTranslate;
    }

    @Override
    public void translator(String text) {
        arabicTranslate.translatorEnglishToArabic(text);
    }
}
