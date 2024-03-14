package org.example;

import io.reactivex.Observable;
import io.reactivex.Observer;
import org.example.dp.StringObserver;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Observable<String> observable = Observable.just("springboot","developer");
        Observer<String> observer = new StringObserver();
observable.subscribe(observer);

    }
}
