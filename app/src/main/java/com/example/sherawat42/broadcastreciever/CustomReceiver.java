package com.example.sherawat42.broadcastreciever;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;

import static com.example.sherawat42.broadcastreciever.MainActivity.ACTION_CUSTOM_BROADCAST;

public class CustomReceiver extends BroadcastReceiver {

    @Override
    public void onReceive(Context context, Intent intent) {
        String intentAction = intent.getAction();
        String toast_message="";

        switch(intentAction){
            case Intent.ACTION_POWER_CONNECTED:
                toast_message = "Power Connected. Oh yeah!! :)";
                break;
            case Intent.ACTION_POWER_DISCONNECTED:
                toast_message = "Human why u remove charge :(";
                break;
            case MainActivity.ACTION_CUSTOM_BROADCAST:
                toast_message = "Custom broadcast received";

        }
        Toast.makeText(context, toast_message, Toast.LENGTH_SHORT).show();
    }
}
