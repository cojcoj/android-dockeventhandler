package com.learnerstechlab.dockeventhandler;

import android.os.Bundle;
import android.app.Activity;
import android.view.Window;
import android.widget.Toast;

public class MainActivity extends Activity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Toast.makeText(this, "Dock Mounted", Toast.LENGTH_LONG).show();
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_main);
    }
    
    @Override
    public void onStart() {
    	super.onStart();
    	finish();
    }
}
