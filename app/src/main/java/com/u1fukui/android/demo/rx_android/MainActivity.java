package com.u1fukui.android.demo.rx_android;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import rx.Observable;
import rx.functions.Action1;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = MainActivity.class.getSimpleName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_activity);

        helloRx();
    }

    /**
     * https://github.com/ReactiveX/RxJava/wiki/How-To-Use-RxJava
     */
    private void helloRx() {
        String[] names = {"Ben", "George"};
        Observable.from(names).subscribe(new Action1<String>() {
            @Override
            public void call(String s) {
                Log.d(TAG, "Hello! " + s);
            }
        });
    }
}
