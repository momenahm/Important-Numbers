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

public class Sandwich extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sandwich);
    }

    public void delivery(View view)
    {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        View mview = getLayoutInflater().inflate(R.layout.delivery_sandwich,null);
        Button sandwich1 = (Button)mview.findViewById(R.id.sandwich);

        sandwich1.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent roken1intent = new Intent(Intent.ACTION_CALL);
                roken1intent.setData(Uri.parse("tel:01273922999"));
                startActivity(roken1intent);
            }
        });

        builder.setView(mview);
        AlertDialog alertDialog = builder.create();
        alertDialog.show();
    }

    public void Address(View view)
    {

        String method = "Sandwich";
        Intent mapIntent = new Intent(Sandwich.this, MapsActivity.class);
        mapIntent.putExtra("PUTDATA",method);
        startActivity(mapIntent);
    }
}
