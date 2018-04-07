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

public class AsmakBahry extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_asmak_bahry);
    }
    public void menu(View view)
    {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        View mview = getLayoutInflater().inflate(R.layout.menu_asmak,null);
        builder.setView(mview);
        AlertDialog alertDialog = builder.create();
        alertDialog.show();
    }


    public void delivery(View view)
    {

        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        View mview = getLayoutInflater().inflate(R.layout.delivery_asmak,null);
        Button basmak1 = (Button)mview.findViewById(R.id.asmak1);
        Button basmak2 = (Button)mview.findViewById(R.id.asmak2);
        Button basmak3 = (Button)mview.findViewById(R.id.asmak3);


        basmak1.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent asmak1Intent = new Intent(Intent.ACTION_CALL);
                asmak1Intent.setData(Uri.parse("tel:0552357336 "));
                startActivity(asmak1Intent);
            }
        });
        basmak2.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent asmak2Intent = new Intent(Intent.ACTION_CALL);
                asmak2Intent.setData(Uri.parse("tel:01212127417"));
                startActivity(asmak2Intent);
            }
        });
        basmak3.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent asmak3Intent = new Intent(Intent.ACTION_CALL);
                asmak3Intent.setData(Uri.parse("tel:01211473333"));
                startActivity(asmak3Intent);
            }
        });




        builder.setView(mview);
        AlertDialog alertDialog = builder.create();
        alertDialog.show();
    }

    public void address(View view)
    {
        String method = "Asmak";
        Intent mapIntent = new Intent(AsmakBahry.this, MapsActivity.class);
        mapIntent.putExtra("PUTDATA",method);
        startActivity(mapIntent);
    }
}
