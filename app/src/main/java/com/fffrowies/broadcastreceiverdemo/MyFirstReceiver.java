package com.fffrowies.broadcastreceiverdemo;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;
import android.widget.Toast;

public class MyFirstReceiver extends BroadcastReceiver {

    private static final String TAG = MyFirstReceiver.class.getSimpleName();

    @Override
    public void onReceive(Context context, Intent intent) {

        Log.i(TAG, "Hello from 1st Receiver, Thread Name: " + Thread.currentThread().getName());
        Toast.makeText(context, "Hello from 1st Receiver", Toast.LENGTH_LONG).show();

        // never perform long running tasks inside onReceive method of the BroadcastReceiver
        // (use services)
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}