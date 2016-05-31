package com.ulbora.hosted.toast;

import android.webkit.JavascriptInterface;
import android.content.Context;
import android.widget.Toast;
import android.app.Application;


/**
 * Created by ken Williamson on 5/30/16.
 */

public class HostedToast extends Application{
    Context context;
    public HostedToast(Context context){
        this.context = context;
    }
    @JavascriptInterface
    public void showToast(String message) {
        int duration = Toast.LENGTH_LONG;
        Toast toast = Toast.makeText(this.context, message, duration);
        toast.show();
    }
}
