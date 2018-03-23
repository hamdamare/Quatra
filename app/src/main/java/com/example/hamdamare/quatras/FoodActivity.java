package com.example.hamdamare.quatras;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class FoodActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_food);

    }
     public void openM (View view){
         Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www4.mcdonalds.ca/coupons/"));
         startActivity(browserIntent);

     }
    public void openB (View view) {
        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://burgerking.ca/offers"));
        startActivity(browserIntent);
    }
    public void openD (View view) {
        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.dairyqueen.com/ca-en/Promotions-CA/"));
        startActivity(browserIntent);
    }
    public void openF (View view) {
        Toast.makeText(FoodActivity.this, "15% Off With Valid Student ID At Participating Locations ", Toast.LENGTH_SHORT).show();
    }
    public void openS (View view) {
        Toast.makeText(FoodActivity.this, "10% Off With Valid Student ID At Participating Locations ", Toast.LENGTH_SHORT).show();
    }

}
