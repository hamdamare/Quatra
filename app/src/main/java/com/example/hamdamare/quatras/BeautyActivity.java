package com.example.hamdamare.quatras;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class BeautyActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_beauty);
    }

    public void sally(View view) {
        Toast.makeText(BeautyActivity.this, "Apply for a Sally's Beauty Student Card to get special deals sent to your email...", Toast.LENGTH_SHORT).show();
        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.sallybeauty.com/Sally-Beauty-Club-Cards-Student/clubCards_Student,default,pg.html"));
        startActivity(browserIntent);
    }
}
