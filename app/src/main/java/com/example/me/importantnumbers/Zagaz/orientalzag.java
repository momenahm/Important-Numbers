package com.example.me.importantnumbers.Zagaz;

import com.example.me.importantnumbers.MapsActivity;
import com.example.me.importantnumbers.R;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class orientalzag extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_orientalzag);

    }

    public void menu(View view)
    {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        View mview = getLayoutInflater().inflate(R.layout.activity_menuorienntal,null);
        builder.setView(mview);
        AlertDialog alertDialog = builder.create();
        alertDialog.show();
    }

    public void delivery(View view) {
      AlertDialog.Builder builder = new AlertDialog.Builder(this);
        View mview = getLayoutInflater().inflate(R.layout.deliveryoriental,null);
        Button boriental1 = (Button)mview.findViewById(R.id.orideli1);
        Button boriental2 = (Button)mview.findViewById(R.id.oriedel2);
        Button boriental3 = (Button)mview.findViewById(R.id.oridel3);
        boriental1.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent boriental1Intent = new Intent(Intent.ACTION_CALL);
                boriental1Intent.setData(Uri.parse("tel:16069"));
                startActivity(boriental1Intent);
            }
        });
        boriental2.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent boriental2Intent = new Intent(Intent.ACTION_CALL);
                boriental2Intent.setData(Uri.parse("tel:05522716065"));
                startActivity(boriental2Intent);
            }
        });
        boriental3.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent boriental3Intent = new Intent(Intent.ACTION_CALL);
                boriental3Intent.setData(Uri.parse("tel:05522746938"));
                startActivity(boriental3Intent);
            }
        });



        builder.setView(mview);
        AlertDialog alertDialog = builder.create();
        alertDialog.show();
    }




    public void address(View view) {

        //MapsActivity mapsActivity = new MapsActivity();
        //mapsActivity.methodresturant("oriental");
        String method = "oriental";
        //Intent intent = new Intent(this,MapsActivity.class);
        //intent.putExtra("oriental","DATA");
        //startActivity(intent);

        Intent mapIntent = new Intent(orientalzag.this, MapsActivity.class);
        mapIntent.putExtra("PUTDATA",method);
        startActivity(mapIntent);

    }
}
