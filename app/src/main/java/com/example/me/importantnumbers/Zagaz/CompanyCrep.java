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

public class CompanyCrep extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_company_crep);
    }

    public void menu(View view)
    {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        View mview = getLayoutInflater().inflate(R.layout.menu_companycrep,null);
        builder.setView(mview);
        AlertDialog alertDialog = builder.create();
        alertDialog.show();

    }


    public void delivery(View view)
    {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        View mview = getLayoutInflater().inflate(R.layout.delivery_company,null);
        Button company1 = (Button)mview.findViewById(R.id.company1);
        Button company2 = (Button)mview.findViewById(R.id.company2);
        Button basel3 = (Button)mview.findViewById(R.id.asel3);

        company1.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent company1Intent = new Intent(Intent.ACTION_CALL);
                company1Intent.setData(Uri.parse("tel:0552333797"));
                startActivity(company1Intent);
            }
        });
        company2.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent company2Intent = new Intent(Intent.ACTION_CALL);
                company2Intent.setData(Uri.parse("tel:01222453636"));
                startActivity(company2Intent);
            }
        });




        builder.setView(mview);
        AlertDialog alertDialog = builder.create();
        alertDialog.show();
    }

    public void address(View view)
    {
        String method = "Company";
        Intent mapIntent = new Intent(CompanyCrep.this, MapsActivity.class);
        mapIntent.putExtra("PUTDATA",method);
        startActivity(mapIntent);
    }
}
