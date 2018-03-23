package com.example.hamdamare.quatras;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class CategoriesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_categories);
    }

    //navigates to the technology page
    public void technology(View view) {
        Intent intent = new Intent(this, GroceryActivity.class);
        startActivity(intent);

    }


    //navigates to the food activity
    public void food(View view) {
        Intent intent = new Intent(this, GroceryActivity.class);
        startActivity(intent);

    }




    public void entertainment(View view) {
        Intent intent = new Intent(this, GroceryActivity.class);
        startActivity(intent);

    }

    public void grocery(View view) {
        Intent intent = new Intent(this, GroceryActivity.class);
        startActivity(intent);
    }


    public void clothing(View view) {
        Intent intent = new Intent(this, GroceryActivity.class);
        startActivity(intent);

    }

    public void beauty(View view) {
        Intent intent = new Intent(this, GroceryActivity.class);
        startActivity(intent);

    }

}
