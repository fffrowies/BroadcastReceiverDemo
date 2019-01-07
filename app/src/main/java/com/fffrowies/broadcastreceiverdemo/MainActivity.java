package com.fffrowies.broadcastreceiverdemo;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = MainActivity.class.getSimpleName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void sendBroadcastMessage(View view) {
//        Intent intent = new Intent(this, MyFirstReceiver.class);
        Intent intent = new Intent("my.custom.action.name");

        intent.putExtra("name", "Fernando Rowies");
        intent.putExtra("age", 10);

        sendBroadcast(intent);

//        Toast.makeText(this, "After Sending Broadcast", Toast.LENGTH_LONG).show();
    }

    public void broadcastToInnerReceiver(View view) {
//        Intent intent = new Intent(this, MyThirdReceiverInner.class);
        Intent intent = new Intent("my.custom.anotheraction.name");

        Bundle bundle = new Bundle();
        bundle.putString("name", "Ferchuline Bowiers");
        bundle.putInt("age", 14);
        intent.putExtras(bundle);

        sendBroadcast(intent);
    }

    public static class MyThirdReceiverInner extends BroadcastReceiver {

        private static final String TAG = MyThirdReceiverInner.class.getSimpleName();

        @Override
        public void onReceive(Context context, Intent intent) {

            String name = intent.getStringExtra("name");
            int age = intent.getIntExtra("age", 0);
            Log.i(TAG, "Name: " + name + ", Age: " + age);

            Log.i(TAG, "Hello from 3rd Receiver");
            Toast.makeText(context, "Hello from 3rd Receiver", Toast.LENGTH_LONG).show();
        }
    }
}
