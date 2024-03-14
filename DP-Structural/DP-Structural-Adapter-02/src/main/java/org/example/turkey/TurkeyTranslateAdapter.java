package org.example.turkey;

import org.example.translator.LanguageTranslator;

public class TurkeyTranslateAdapter implements LanguageTranslator {
    private final TurkeyTranslate turkeyTranslate;

    public TurkeyTranslateAdapter(TurkeyTranslate turkeyTranslate) {
        this.turkeyTranslate = turkeyTranslate;
    }


    @Override
    public void translator(String text) {
        turkeyTranslate.translatorEnglishToTurkey(text);
    }
}
