package com.example.me.importantnumbers.Zagaz;

import com.example.me.importantnumbers.R;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class Zagazig extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_zagazig);
    }

    public void hoszagazig(View view)
    {
        startActivity(new Intent(Zagazig.this,hospitalZag.class));

    }

    public void police(View view)
    {
        AlertDialog.Builder builder = new AlertDialog.Builder(Zagazig.this);
        View mview = getLayoutInflater().inflate(R.layout.police_layout,null);
        Button police1 = (Button)mview.findViewById(R.id.polic1);
        police1.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent policintent = new  Intent(Intent.ACTION_CALL);
                policintent.setData(Uri.parse("tel:122"));
                startActivity(policintent);

            }
        });
        builder.setView(mview);
        AlertDialog dialog = builder.create();
        dialog.show();

    }

    public void matafy(View view)
    {
        AlertDialog.Builder builder = new AlertDialog.Builder(Zagazig.this);
        View mview = getLayoutInflater().inflate(R.layout.matafy_layout,null);
        Button fire11 = (Button)mview.findViewById(R.id.fire1);
        fire11.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent fireintent = new  Intent(Intent.ACTION_CALL);
                fireintent.setData(Uri.parse("tel:0552305058"));
                startActivity(fireintent);

            }
        });
        builder.setView(mview);
        AlertDialog dialog = builder.create();
        dialog.show();

    }

    public void resturant(View view)
    {
           startActivity(new Intent(Zagazig.this,resturantzag.class));
    }
}
