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

public class SDaysResturant extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sdays_resturant);
    }

    public void menu(View view)
    {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        View mview = getLayoutInflater().inflate(R.layout.menu_sdays,null);
        builder.setView(mview);
        AlertDialog alertDialog = builder.create();
        alertDialog.show();
    }

    public void delivery(View view)
    {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        View mview = getLayoutInflater().inflate(R.layout.delivery_sdays,null);
        Button bsdays1 = (Button)mview.findViewById(R.id.sdays1);
        Button bsdays2 = (Button)mview.findViewById(R.id.sdays2);
        bsdays1.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent sdays1intent = new Intent(Intent.ACTION_CALL);
                sdays1intent.setData(Uri.parse("tel:16069"));
                startActivity(sdays1intent);
            }
        });
        bsdays2.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent sdays2intent = new Intent(Intent.ACTION_CALL);
                sdays2intent.setData(Uri.parse("tel:0552373636"));
                startActivity(sdays2intent);
            }
        });

        builder.setView(mview);
        AlertDialog alertDialog = builder.create();
        alertDialog.show();
    }

    public void address(View view)
    {

        String method = "SDays";
        Intent mapIntent = new Intent(SDaysResturant.this, MapsActivity.class);
        mapIntent.putExtra("PUTDATA",method);
        startActivity(mapIntent);
    }
}
