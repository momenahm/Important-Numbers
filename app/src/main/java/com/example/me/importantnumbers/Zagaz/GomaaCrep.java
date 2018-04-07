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

public class GomaaCrep extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gomaa_crep);
    }
    public void menu(View view)
    {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        View mview = getLayoutInflater().inflate(R.layout.menu_gomaa,null);
        builder.setView(mview);
        AlertDialog alertDialog = builder.create();
        alertDialog.show();
    }


    public void delivery(View view)
    {

        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        View mview = getLayoutInflater().inflate(R.layout.delivery_gomaa,null);
        Button bgomaa1 = (Button)mview.findViewById(R.id.gomaa1);


        bgomaa1.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent gomaa1Intent = new Intent(Intent.ACTION_CALL);
                gomaa1Intent.setData(Uri.parse("tel:0552381551"));
                startActivity(gomaa1Intent);
            }
        });




        builder.setView(mview);
        AlertDialog alertDialog = builder.create();
        alertDialog.show();
    }
    public void address(View view)
    {
        String method = "Gomaa";
        Intent mapIntent = new Intent(GomaaCrep.this, MapsActivity.class);
        mapIntent.putExtra("PUTDATA",method);
        startActivity(mapIntent);
    }
}
