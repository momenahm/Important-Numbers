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

public class MaximResturant extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maxim_resturant);
    }

    public void menu(View view)
    {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        View mview = getLayoutInflater().inflate(R.layout.menu_maxim,null);
        builder.setView(mview);
        AlertDialog alertDialog = builder.create();
        alertDialog.show();
    }

    public void delivery(View view) {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        View mview = getLayoutInflater().inflate(R.layout.delivery_maxim,null);
        Button bmaxim1 = (Button)mview.findViewById(R.id.maxim1);
        Button bmaxim2 = (Button)mview.findViewById(R.id.maxim2);

        bmaxim1.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent maxim1Intent = new Intent(Intent.ACTION_CALL);
                maxim1Intent.setData(Uri.parse("tel:0552353070"));
                startActivity(maxim1Intent);
            }
        });
        bmaxim2.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent maxim2Intent = new Intent(Intent.ACTION_CALL);
                maxim2Intent.setData(Uri.parse("tel:0552363070"));
                startActivity(maxim2Intent);
            }
        });



        builder.setView(mview);
        AlertDialog alertDialog = builder.create();
        alertDialog.show();
    }


    public void address(View view)
    {
        String method = "Maxim";
        Intent mapIntent = new Intent(MaximResturant.this, MapsActivity.class);
        mapIntent.putExtra("PUTDATA",method);
        startActivity(mapIntent);
    }
}
