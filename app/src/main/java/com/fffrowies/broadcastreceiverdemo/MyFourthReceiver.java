package com.fffrowies.broadcastreceiverdemo;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

public class MyFourthReceiver extends BroadcastReceiver {

    private static final String TAG = MyFourthReceiver.class.getSimpleName();

    @Override
    public void onReceive(Context context, Intent intent) {

        if (isOrderedBroadcast()) {
            int initCode = getResultCode();
            String initData = getResultData();
            Bundle initBundle = getResultExtras(true);
            String title = initBundle.getString("title");

            Log.i(TAG, "Code: " + initCode + ", Data: " + initData + ", Bundle: " + title);

            Log.i(TAG, "Hello from 4th Receiver");
            Toast.makeText(context, "Hello from 4th Receiver", Toast.LENGTH_LONG).show();
        }
    }
}
