package net.redlinesoft.app.agelcollection;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.widget.LinearLayout;

import org.apache.cordova.*;
import com.google.ads.*;

public class MainActivity extends DroidGap {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        super.loadUrl("file:///android_asset/www/index.html");
        
        AdView adView = new AdView(this, AdSize.BANNER, "a1508204ae5ff36");      
        LinearLayout layout = super.root;
        layout.addView(adView);
        layout.setHorizontalGravity(android.view.Gravity.CENTER_HORIZONTAL);
        adView.loadAd(new AdRequest());
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        //getMenuInflater().inflate(R.menu.activity_main, menu);
        return true;
    }
}
