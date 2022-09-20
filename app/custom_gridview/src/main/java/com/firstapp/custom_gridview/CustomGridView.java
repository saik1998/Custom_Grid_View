package com.firstapp.custom_gridview;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.GridView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class CustomGridView extends AppCompatActivity {

    GridView gridView;
    AlertDialog alertDialog;
    UserPojo userPojo;
    GridAdapter gridAdapter;
    List<UserPojo> userPojoList = new ArrayList<>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_custom_grid_view);

        gridView = findViewById(R.id.grid_view);
        gridAdapter = new GridAdapter(this, userPojoList);
        gridView.setAdapter(gridAdapter);

        loadUserData();

        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int i, long l) {

//                Intent intent=new Intent(CustomGridView.this,CustomGirdView1.class);
//                intent.putExtra("nameKey",userPojoList.get(i).getName());
//                intent.putExtra("priceKey",userPojoList.get(i).getPrice());
//                intent.putExtra("ageKey",userPojoList.get(i).getAge());
//                intent.putExtra("weightKey",userPojoList.get(i).getWeight());
//                intent.putExtra("imagekey",userPojoList.get(i).getImage());
//
//                startActivity(intent);

                AlertDialog.Builder builder = new AlertDialog.Builder(CustomGridView.this);
                builder.setTitle("Ondevice Solutions");
                builder.setMessage("Welcome to Android");
                builder.setIcon(R.drawable.img);
                builder.setCancelable(false);

                builder.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int i) {
                        Toast.makeText(CustomGridView.this, "Yes", Toast.LENGTH_SHORT).show();

                    }
                });
                builder.setNegativeButton("No", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int i) {
                        Toast.makeText(CustomGridView.this, "No", Toast.LENGTH_SHORT).show();

                    }
                });
                builder.setNeutralButton("Help!", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int i) {
                        Toast.makeText(CustomGridView.this, "Contact!", Toast.LENGTH_SHORT).show();

                    }
                });
                builder.create();
                builder.show();

            }
        });
        gridView.setOnItemLongClickListener(new AdapterView.OnItemLongClickListener() {
            @Override
            public boolean onItemLongClick(AdapterView<?> parent, View view, int position, long id) {
                AlertDialog.Builder builder = new AlertDialog.Builder(CustomGridView.this);
                View root = getLayoutInflater().inflate(R.layout.custom_alretdialog, null);
                builder.setView(root);
                builder.setCancelable(false);

                Button cancel = root.findViewById(R.id.cancel);
                Button ok = root.findViewById(R.id.ok);

                cancel.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Toast.makeText(CustomGridView.this, "Thank you", Toast.LENGTH_SHORT).show();
                        alertDialog.dismiss();

                    }
                });
                ok.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Toast.makeText(CustomGridView.this, "Welcome", Toast.LENGTH_SHORT).show();
                        alertDialog.dismiss();
                    }

                });

                alertDialog = builder.create();
                alertDialog.show();


                return true;
            }
        });

    }

    private void loadUserData() {
        userPojo = new UserPojo(R.drawable.picture_1, "Eagle", "10000", "4kg", "2yrs");
        userPojoList.add(userPojo);
        userPojo = new UserPojo(R.drawable.picture_2, "Owl", "5000", "2kg", "6months");
        userPojoList.add(userPojo);
        userPojo = new UserPojo(R.drawable.picture_3, "Lion", "100000", "250kg", "10yrs");
        userPojoList.add(userPojo);
        userPojo = new UserPojo(R.drawable.picture_4, "Giraffe", "50000", "600kg", "10yrs");
        userPojoList.add(userPojo);
        userPojo = new UserPojo(R.drawable.picture_5, "Tiger", "300000", "200kg", "5yrs");
        userPojoList.add(userPojo);


        gridAdapter.notifyDataSetChanged();

    }
}
