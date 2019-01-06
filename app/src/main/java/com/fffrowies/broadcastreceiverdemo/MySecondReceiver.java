package com.fffrowies.broadcastreceiverdemo;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;
import android.widget.Toast;

public class MySecondReceiver extends BroadcastReceiver {

    private static final String TAG = MySecondReceiver.class.getSimpleName();

    @Override
    public void onReceive(Context context, Intent intent) {

        Log.i(TAG, "Hello from 2nd Receiver");
        Toast.makeText(context, "Hello from 2nd Receiver", Toast.LENGTH_LONG).show();

    }
}
