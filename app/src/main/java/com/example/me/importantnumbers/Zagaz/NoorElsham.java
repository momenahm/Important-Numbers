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

public class NoorElsham extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_noor_elsham);
    }

    public void menu(View view)
    {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        View mview = getLayoutInflater().inflate(R.layout.menu_noorelsham,null);
        builder.setView(mview);
        AlertDialog alertDialog = builder.create();
        alertDialog.show();
    }

    public void delivery(View view) {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        View mview = getLayoutInflater().inflate(R.layout.delivery_noorsham,null);
        Button bnoorsh1 = (Button)mview.findViewById(R.id.noorsh1);
        Button bnoorsh2 = (Button)mview.findViewById(R.id.noorsh2);
        Button bnoorsh3 = (Button)mview.findViewById(R.id.noorsh3);
        bnoorsh1.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent noorsh1Intent = new Intent(Intent.ACTION_CALL);
                noorsh1Intent.setData(Uri.parse("tel:0552335332"));
                startActivity(noorsh1Intent);
            }
        });
        bnoorsh2.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent noorsh2Intent = new Intent(Intent.ACTION_CALL);
                noorsh2Intent.setData(Uri.parse("tel:01027811115"));
                startActivity(noorsh2Intent);
            }
        });
        bnoorsh3.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent noorsh3Intent = new Intent(Intent.ACTION_CALL);
                noorsh3Intent.setData(Uri.parse("tel:01147300044"));
                startActivity(noorsh3Intent);
            }
        });



        builder.setView(mview);
        AlertDialog alertDialog = builder.create();
        alertDialog.show();
    }


    public void Addresss(View view)
    {
        String method = "Noorsh";
        Intent mapIntent = new Intent(NoorElsham.this, MapsActivity.class);
        mapIntent.putExtra("PUTDATA",method);
        startActivity(mapIntent);
    }
}
