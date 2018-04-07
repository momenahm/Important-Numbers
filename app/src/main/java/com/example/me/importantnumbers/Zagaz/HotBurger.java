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

public class HotBurger extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hot_burger);
    }

    public void menu(View view)
    {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        View mview = getLayoutInflater().inflate(R.layout.menu_hotburger,null);
        builder.setView(mview);
        AlertDialog alertDialog = builder.create();
        alertDialog.show();

    }

    public void delivery(View view)
    { AlertDialog.Builder builder = new AlertDialog.Builder(this);
        View mview = getLayoutInflater().inflate(R.layout.delivery_hotburger,null);
        Button bhotbur1 = (Button)mview.findViewById(R.id.hotbur1);
        Button bhotbur2 = (Button)mview.findViewById(R.id.hotbur2);

        bhotbur1.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent hotbur1Intent = new Intent(Intent.ACTION_CALL);
                hotbur1Intent.setData(Uri.parse("tel:0552321996"));
                startActivity(hotbur1Intent);
            }
        });
        bhotbur2.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent hotbur2Intent = new Intent(Intent.ACTION_CALL);
                hotbur2Intent.setData(Uri.parse("tel:01013700900"));
                startActivity(hotbur2Intent);
            }
        });



        builder.setView(mview);
        AlertDialog alertDialog = builder.create();
        alertDialog.show();
    }


    public void address(View view)
    {
        String method = "HotBurger";
        Intent mapIntent = new Intent(HotBurger.this, MapsActivity.class);
        mapIntent.putExtra("PUTDATA",method);
        startActivity(mapIntent);
    }



}



