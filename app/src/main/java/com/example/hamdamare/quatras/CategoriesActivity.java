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
    public void technology() {
        Button tech = findViewById(R.id.techBtn);
        tech.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),TechnologyActivity.class);
                startActivity(intent);

            }
        });

    }


    //navigates to the food activity
    public void food() {
        Button food = findViewById(R.id.foodBtn);
        food.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),FoodActivity.class);
                startActivity(intent);
            }
        });

    }




    public void entertainment() {
        Button entertainment = findViewById(R.id.entertainmentBtn);
        entertainment.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),EntertainmentActivity.class);
                startActivity(intent);
            }
        });

    }

    public void grocery() {
        Button grocery = findViewById(R.id.groceryBtn);
        grocery.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),GroceryActivity.class);
                startActivity(intent);

            }
        });

    }

    public void clothing() {
        Button clothing = findViewById(R.id.clothingBtn);
        clothing.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(getApplicationContext(),ClothingActivity.class);
                startActivity(intent);

            }
        });

    }

    public void beauty() {
        Button beauty = findViewById(R.id.beautyBtn);
        beauty.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),BeautyActivity.class);
                startActivity(intent);
            }
        });

    }



}
