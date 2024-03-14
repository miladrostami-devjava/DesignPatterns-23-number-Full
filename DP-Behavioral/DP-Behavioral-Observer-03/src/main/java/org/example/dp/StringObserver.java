package org.example.dp;

import io.reactivex.Observer;
import io.reactivex.annotations.NonNull;
import io.reactivex.disposables.Disposable;

public class StringObserver implements Observer<String> {
    @Override
    public void onSubscribe(@NonNull Disposable disposable) {
        System.out.println("Observer Subscribed!");
    }

    @Override
    public void onNext(@NonNull String s) {
        System.out.println("Received " + s);
    }

    @Override
    public void onError(@NonNull Throwable throwable) {
        System.out.println("Error :" + throwable.getMessage());
    }

    @Override
    public void onComplete() {
        System.out.println("Stream completed");
    }
}
