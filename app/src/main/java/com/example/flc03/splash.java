package com.example.flc03;

import android.os.Handler;
import android.view.View;
import android.view.ViewTreeObserver;

public class splash {
    static boolean isready=false;
    public static void start(View content){
        content.getViewTreeObserver().addOnPreDrawListener(new ViewTreeObserver.OnPreDrawListener() {
            @Override
            public boolean onPreDraw() {
                if(isready){
                    content.getViewTreeObserver().removeOnPreDrawListener(this);
                }
                dismissSplashScreen();
                return false;
            }
        });
    }

    private static void dismissSplashScreen() {
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                isready=true;
            }
        },1000);
    }
}
