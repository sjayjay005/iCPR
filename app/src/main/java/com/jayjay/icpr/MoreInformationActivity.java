package com.jayjay.icpr;

import android.content.Intent;
import android.net.Uri;
import android.support.annotation.StringDef;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

/**
*This is the More information activity, basically if you want to know more about the creator
 * This is the link to the facebook page
 */

public class MoreInformationActivity extends AppCompatActivity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_more_information);
        ImageView fb_button = (ImageView)findViewById(R.id.facebook_link);
        fb_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent viewIntent =
                        new Intent("android.intent.action.VIEW",
                                Uri.parse("https://www.facebook.com/sjayjay005"));
                startActivity(viewIntent);
            }
        });

    }

}
