package com.example.hamdamare.quatras;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import java.util.concurrent.TimeUnit;

public class ClothingActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_clothing);
    }
    //prompts user to the urban outfitters
    public void uo (View view){
        Toast.makeText(ClothingActivity.this, "Get 10% off your purchase with your student ID..", Toast.LENGTH_SHORT).show();
        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.urbanoutfitters.com/en-ca/sale"));
        startActivity(browserIntent);

    }
    //prompts user to the banana republic site
    public void bananaRep (View view){

        Toast.makeText(ClothingActivity.this, "Get 15% off purchases on full-price items in store with I.D..", Toast.LENGTH_SHORT).show();
        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://bananarepublic.gapcanada.ca/browse/division.do?cid=1014329&mlink=12147468,topNavSale,visnav&clink=12147468"));
        startActivity(browserIntent);
    }

    //prompts the user to the club monaco site
    public void clubMonaco (View view){
        Toast.makeText(ClothingActivity.this, "Get %15 off full-price and sale items with valid ID...", Toast.LENGTH_SHORT).show();
        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.clubmonaco.ca/category/index.jsp?categoryId=12266412&ab=global_sale"));
        startActivity(browserIntent);
    }


    //prompts user to h and m website
    public void hm (View view){
        Toast.makeText(ClothingActivity.this, "Get 15% off in-store purchases with valid student ID.\n" +
                "Newsletter sign up 25% off ..", Toast.LENGTH_SHORT).show();
        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www2.hm.com/en_ca/customer-service/newsletter.html"));
        startActivity(browserIntent);
    }



    //prompts user to jcrew website
    public void jCrew (View view){
        Toast.makeText(ClothingActivity.this, "Get 15% off in-store purchases with valid student ID at J. Crew stores and outlets...", Toast.LENGTH_SHORT).show();
        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.jcrew.com/ca/r/sale"));
        startActivity(browserIntent);
    }


    //prompts user to kateSpade website
    public void kateSpade (View view){
        Toast.makeText(ClothingActivity.this, "Get 15% off in-store purchases with valid student ID.\n" +
                "Get 15% with email sign up..", Toast.LENGTH_SHORT).show();
        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.katespade.com/katespade-customer-service-ks-help/ks-faq1.html"));
        startActivity(browserIntent);
    }



    //prompts user to levi website
    public void levi(View view){
        Toast.makeText(ClothingActivity.this, "Get 20% off in-store purchases and sign up your email for an additional 20% off..", Toast.LENGTH_SHORT).show();
        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.levi.com/CA/en_CA/."));
        startActivity(browserIntent);
    }



    //connects user to the roots site
    public void roots(View view){
        Toast.makeText(ClothingActivity.this, "Get 15% off your purchase on full-price items and 10% off sale items...", Toast.LENGTH_SHORT).show();
        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.roots.com/ca/en/sale/?psortb1=category-pos_Sale"));
        startActivity(browserIntent);
    }

    //connects user to the toms site
    public void toms(View view){
        Toast.makeText(ClothingActivity.this, "10% discount for students..", Toast.LENGTH_SHORT).show();
        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://verify.sheerid.com/toms-academic-discount/"));
        startActivity(browserIntent);
    }


    public void topshop (View view) {
        Toast.makeText(ClothingActivity.this, "Get 10% off your purchase with valid student ID...", Toast.LENGTH_SHORT).show();
        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.topshop.com/en/tsuk/category/sale-6923952/shop-all-sale-6912866"));
        startActivity(browserIntent);
    }




}
