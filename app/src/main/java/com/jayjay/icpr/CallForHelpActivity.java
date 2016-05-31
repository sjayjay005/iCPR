package com.jayjay.icpr;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;

/**
 * This is the main activity
 * This connects everything together on the application
 */

public class CallForHelpActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_call_for_help);

        ImageButton fb_button = (ImageButton) findViewById(R.id.call_doctor);
        fb_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent viewIntent =
                        new Intent("android.intent.action.VIEW",
                                Uri.parse("https://encrypt.carecross.co.za/CareCross/ExtProviderSearch.aspx?searchtype=oa&practype=GP&province=GT"));
                startActivity(viewIntent);
            }
        });


    }




}
