package com.example.hamdamare.quatras;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import java.util.concurrent.TimeUnit;

public class GroceryActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_grocery);
    }


    //prompts the user to the club monaco site
    public void bulkBarn(View view) throws InterruptedException {
        Toast.makeText(GroceryActivity.this, "Save 10% off your purchase on Wednesdays with valid student ID.....", Toast.LENGTH_SHORT).show();
        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.bulkbarn.ca/en/Deals/West-Region"));
        startActivity(browserIntent);
    }

    public void bmo(View view) throws InterruptedException {
        Toast.makeText(GroceryActivity.this, "The Bank of Montreal offers free banking and an SPC card to student members.....", Toast.LENGTH_SHORT).show();
    }

    public void globe(View view) {
        Toast.makeText(GroceryActivity.this, "College and university students get discounted subscription rates to the newspaper and online publications...", Toast.LENGTH_SHORT).show();
        Intent browserIntent = new Intent(Intent.ACTION_VIEW,Uri.parse("https://customer.globeandmail.ca/HD/Start.aspx?x_IsStudent=Y"));
        startActivity(browserIntent);
    }

    public void pc(View view) throws InterruptedException {
        Toast.makeText(GroceryActivity.this, "PC Financial offers free daily banking that lets students earn interests on their account balances....", Toast.LENGTH_SHORT).show();

    }

}
