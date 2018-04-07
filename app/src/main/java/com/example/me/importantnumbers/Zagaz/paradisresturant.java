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

public class paradisresturant extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_paradisresturant);

    }

    public void menu(View view)
    {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        View mview = getLayoutInflater().inflate(R.layout.paradismenu,null);
        builder.setView(mview);
        AlertDialog alertDialog = builder.create();
        alertDialog.show();
    }

    public void delivery(View view)
    {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        View mview = getLayoutInflater().inflate(R.layout.delivery_paradis,null);
        Button bparadis1 = (Button)mview.findViewById(R.id.paradis1);
        Button bparadis2 = (Button)mview.findViewById(R.id.paradis2);
        bparadis1.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent paradis1intent = new Intent(Intent.ACTION_CALL);
                paradis1intent.setData(Uri.parse("tel:0552365855"));
                startActivity(paradis1intent);
            }
        });
        bparadis2.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent paradis2intent = new Intent(Intent.ACTION_CALL);
                paradis2intent.setData(Uri.parse("tel:0552385855"));
                startActivity(paradis2intent);
            }
        });

        builder.setView(mview);
        AlertDialog alertDialog = builder.create();
        alertDialog.show();
    }

    public void Address(View view)
    {
        String method = "paradis";
        Intent mapIntent = new Intent(paradisresturant.this, MapsActivity.class);
        mapIntent.putExtra("PUTDATA",method);
        startActivity(mapIntent);

    }
}
