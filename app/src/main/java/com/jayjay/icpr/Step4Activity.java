package com.jayjay.icpr;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

/**
 * The Fourth step when peforming cpr
 * The activity is simple with
 * The next and previous buttons are large enough for a quick click
 */

public class Step4Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_step4);


        findViewById(R.id.step_4_next_button).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Step4Activity.this, Step5Activity.class));
                finish();
            }
        });

        findViewById(R.id.step_4_previous_button).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Step4Activity.this, Step3Activity.class));
                finish();
            }
        });

    }
}
