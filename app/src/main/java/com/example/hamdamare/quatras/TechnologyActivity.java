package com.example.hamdamare.quatras;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Toast;

public class TechnologyActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_technology);
    }
    public void openMC (View view){
        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.microsoft.com/en-ca/store/b/student"));
        startActivity(browserIntent);
        Toast.makeText(TechnologyActivity.this, "Save 10% + Special Offers ", Toast.LENGTH_SHORT).show();
    }

    public void openBB (View view){
        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.bestbuy.com/site/clp/college-student-deals/pcmcat276200050000.c?id=pcmcat276200050000"));
        startActivity(browserIntent);
        Toast.makeText(TechnologyActivity.this, "By making an account all students are eligible for great deals. ", Toast.LENGTH_SHORT).show();

    }

    public void openA (View view){
        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.apple.com/ca_edu_93120/shop"));
        startActivity(browserIntent);


    }

    public void openAA (View view){
        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.adobe.com/ca/creativecloud/buy/students.html?promoid=65FN7X8B&mv=other"));
        startActivity(browserIntent);
        Toast.makeText(TechnologyActivity.this, "Full-time students can receive discounts on software, such as 60% on Creative Cloud. ", Toast.LENGTH_SHORT).show();

    }


}