package com.example.hamdamare.quatras;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class EntertainmentActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_entertainment);
    }


    //prompts user to the ballet of canada site
    public void ballet(View view) {
        Toast.makeText(EntertainmentActivity.this, "Student members (16 to 19 years old)  get youth pricing and discounted tickets for shows...", Toast.LENGTH_SHORT).show();
        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://national.ballet.ca/Tickets/Box-Office"));
        startActivity(browserIntent);
    }

    //prompts the user to the newyork times site
    public void times (View view) {
        Toast.makeText(EntertainmentActivity.this, "Post-secondary students get 50% off regular subscriptions via the College Rate....", Toast.LENGTH_SHORT).show();
        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.nytimes.com"));
        startActivity(browserIntent);
    }

    public void recroom(View view) {
        Toast.makeText(EntertainmentActivity.this,"Students get a $30 game tag with 225 credits – that's an additional 25 credits!*",Toast.LENGTH_SHORT).show();
        Intent browserIntent = new Intent(Intent.ACTION_VIEW,Uri.parse("https://www.therecroom.com/south-edmonton-recroom/Gaming/video-games"));
        startActivity(browserIntent);
    }


    //prompts user to h and m website
    public void journal (View view) {
        Toast.makeText(EntertainmentActivity.this, "Students can get the paper for just $1 each week..." +
                "Newsletter sign up 25% off ..", Toast.LENGTH_SHORT).show();
        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.wsj.com"));
        startActivity(browserIntent);
    }



    //prompts user to jcrew website
    public void opera (View view) {
        Toast.makeText(EntertainmentActivity.this, "Individuals under 30 can buy tickets for $22 each....", Toast.LENGTH_SHORT).show();
        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.coc.ca/ticket-services/OperaUnder30"));
        startActivity(browserIntent);
    }


    //prompts user to kateSpade website
    public void cineplex (View view) {
        Toast.makeText(EntertainmentActivity.this, "Get tickets for 11 dollars on Tuesdays..." +
                "Get 15% with email sign up..", Toast.LENGTH_SHORT).show();
        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.cineplex.com"));
        startActivity(browserIntent);
    }

    //prompts user to levi website
    public void fedEX(View view) {
        Toast.makeText(EntertainmentActivity.this, "You can save 30% on a document with FedEx Envelop/Pak and 20% on a package with FedEx IP service with your student ID card!.", Toast.LENGTH_SHORT).show();
        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.fedex.com/ca_english/oadr/landing_page.html?INTCMP=BAL-1004300-3-1-960-1101000-CA-CA-EN-F18NEWWELOFFER0-1-CAHM-EN-1"));
        startActivity(browserIntent);
    }

    public void greyhound(View view) {
        Toast.makeText(EntertainmentActivity.this, "Save 10% on fare with valid student ID and 25% with an ISIC card...", Toast.LENGTH_SHORT).show();
        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.greyhound.ca/en/dealsanddiscounts/default.aspx"));
        startActivity(browserIntent);

    }

    public void students(View view) {
        Toast.makeText(EntertainmentActivity.this, "StudentUniverse has partnered with Air Canada to give students the best deals on flight tickets. See their website for more details...", Toast.LENGTH_SHORT).show();
        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.studentuniverse.com"));
        startActivity(browserIntent);

    }

}
