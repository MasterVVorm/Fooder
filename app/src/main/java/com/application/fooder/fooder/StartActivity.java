package com.application.fooder.fooder;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class StartActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start);
        Intent inten = new Intent(getApplication(), LoginActivity.class);
        startActivity(inten);
    }
}
