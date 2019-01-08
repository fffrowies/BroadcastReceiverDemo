package com.fffrowies.broadcastreceiverdemo;

import android.content.Intent;
import android.content.IntentFilter;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = MainActivity.class.getSimpleName();

    private MyFirstReceiver myFirstReceiver;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        myFirstReceiver = new MyFirstReceiver();
    }

    @Override
    protected void onResume() {
        super.onResume();

        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.intent.action.AIRPLANE_MODE");
        // intentFilter.addAction(Intent.ACTION_AIRPLANE_MODE_CHANGED);

        registerReceiver(myFirstReceiver, intentFilter);
    }

    @Override
    protected void onPause() {
        super.onPause();

        unregisterReceiver(myFirstReceiver);
    }
}
