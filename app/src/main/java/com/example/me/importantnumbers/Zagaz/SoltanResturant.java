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

public class SoltanResturant extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_soltan_resturant);
    }

    public void menu(View view)
    {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        View mview = getLayoutInflater().inflate(R.layout.menu_soltan,null);
        builder.setView(mview);
        AlertDialog alertDialog = builder.create();
        alertDialog.show();
    }

    public void delivery(View view)
    {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        View mview = getLayoutInflater().inflate(R.layout.delivery_soultan,null);
        Button bsoultan1 = (Button)mview.findViewById(R.id.soultan1);
        Button bsoultan2 = (Button)mview.findViewById(R.id.soultan2);
        bsoultan1.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent soultan1intent = new Intent(Intent.ACTION_CALL);
                soultan1intent.setData(Uri.parse("tel:0552359991"));
                startActivity(soultan1intent);
            }
        });
        bsoultan2.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent soultan2intent = new Intent(Intent.ACTION_CALL);
                soultan2intent.setData(Uri.parse("tel:01111229713"));
                startActivity(soultan2intent);
            }
        });

        builder.setView(mview);
        AlertDialog alertDialog = builder.create();
        alertDialog.show();
    }

    public void address(View view) {


            String method = "Soltan";
            Intent mapIntent = new Intent(SoltanResturant.this, MapsActivity.class);
            mapIntent.putExtra("PUTDATA",method);
            startActivity(mapIntent);

    }
}
