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

public class ElaselResturant extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_elasel_resturant);
    }

    public void menu(View view)
    {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        View mview = getLayoutInflater().inflate(R.layout.menu_elasel,null);
        builder.setView(mview);
        AlertDialog alertDialog = builder.create();
        alertDialog.show();
    }


    public void delivery(View view)
    {

        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        View mview = getLayoutInflater().inflate(R.layout.delivery_elasel,null);
        Button basel1 = (Button)mview.findViewById(R.id.asel1);
        Button basel2 = (Button)mview.findViewById(R.id.asel2);
        Button basel3 = (Button)mview.findViewById(R.id.asel3);

        basel1.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent asel1Intent = new Intent(Intent.ACTION_CALL);
                asel1Intent.setData(Uri.parse("tel:0552337878"));
                startActivity(asel1Intent);
            }
        });
        basel2.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent asel2Intent = new Intent(Intent.ACTION_CALL);
                asel2Intent.setData(Uri.parse("tel:01110373974"));
                startActivity(asel2Intent);
            }
        });
        basel3.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent asel3Intent = new Intent(Intent.ACTION_CALL);
                asel3Intent.setData(Uri.parse("tel:01144030555"));
                startActivity(asel3Intent);
            }
        });



        builder.setView(mview);
        AlertDialog alertDialog = builder.create();
        alertDialog.show();
    }

    public void address(View view)
    {
        String method = "Elasel";
        Intent mapIntent = new Intent(ElaselResturant.this, MapsActivity.class);
        mapIntent.putExtra("PUTDATA",method);
        startActivity(mapIntent);
    }
}
