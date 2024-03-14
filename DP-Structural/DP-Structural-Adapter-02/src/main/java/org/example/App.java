package org.example;

import org.example.arabic.ArabicTranslate;
import org.example.arabic.ArabicTranslateAdapter;
import org.example.persian.PersianTranslate;
import org.example.persian.PersianTranslateAdapter;
import org.example.translator.LanguageTranslator;
import org.example.turkey.TurkeyTranslate;
import org.example.turkey.TurkeyTranslateAdapter;

import java.util.ArrayList;
import java.util.List;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        List<LanguageTranslator> languageTranslators = new ArrayList<>();
        languageTranslators.add(new PersianTranslateAdapter(new PersianTranslate()));
        languageTranslators.add(new TurkeyTranslateAdapter(new TurkeyTranslate()));
        languageTranslators.add(new ArabicTranslateAdapter(new ArabicTranslate()));
        languageTranslators.forEach(x-> x.translator("milad"));


    }
}
