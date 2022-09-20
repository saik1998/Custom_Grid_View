package com.firstapp.custom_gridview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class CustomGirdView1 extends AppCompatActivity {
    TextView name,age,price,weight;
    ImageView imageView;

    String nameStr,ageStr,priceStr,weightStr;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.custom_gridlist);

        name=findViewById(R.id.picture_name);
        age=findViewById(R.id.picture_age);
        price=findViewById(R.id.picture_price);
        weight=findViewById(R.id.picture_weight);
        imageView=findViewById(R.id.picture_id);

        nameStr=getIntent().getStringExtra("nameKey");
        ageStr=getIntent().getStringExtra("ageKey");
        priceStr=getIntent().getStringExtra("priceKey");
        weightStr=getIntent().getStringExtra("weightKey");

        int img=getIntent().getIntExtra("imagekey",0);

//        imageView.setImageResource(img);

        name.setText(""+nameStr);
        age.setText(""+ageStr);
        price.setText(""+priceStr);
        weight.setText(""+weightStr);




    }
}