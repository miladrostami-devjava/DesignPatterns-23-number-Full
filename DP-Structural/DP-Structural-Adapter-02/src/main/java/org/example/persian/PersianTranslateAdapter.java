package org.example.persian;

import org.example.translator.LanguageTranslator;

public class PersianTranslateAdapter implements LanguageTranslator {
    private final PersianTranslate persianTranslate;

    public PersianTranslateAdapter(PersianTranslate persianTranslate) {
        this.persianTranslate = persianTranslate;
    }

    @Override
    public void translator(String text) {
       persianTranslate.translatorEnglishToPersian(text);
    }
}
