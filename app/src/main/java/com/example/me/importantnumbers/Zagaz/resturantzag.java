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

public class resturantzag extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resturantzag);
    }

    public void oriental(View view)
    {
        startActivity(new Intent(resturantzag.this,orientalzag.class));
    }

    public void paradis(View view)
    {
        startActivity(new Intent(resturantzag.this,paradisresturant.class));
    }

    public void maxim(View view)
    {
        startActivity(new Intent(resturantzag.this,MaximResturant.class));
    }

    public void soltanresturant(View view)
    {
        startActivity(new Intent(resturantzag.this,SoltanResturant.class));
    }

    public void sday(View view)
    {

        startActivity(new Intent(resturantzag.this,SDaysResturant.class));
    }


    public void PizzaHut(View view)
    {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        View mview = getLayoutInflater().inflate(R.layout.delivery_pizzahut,null);
        Button bpizzahut1 = (Button)mview.findViewById(R.id.pizzahut1);
        Button bpizzahut2 = (Button)mview.findViewById(R.id.deliveryhut);

        bpizzahut1.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent pizzahut1Intent = new Intent(Intent.ACTION_CALL);
                pizzahut1Intent.setData(Uri.parse("tel:19000"));
                startActivity(pizzahut1Intent);
            }
        });
        bpizzahut2.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                String method = "Pizzahut";
                Intent mapIntent = new Intent(resturantzag.this, MapsActivity.class);
                mapIntent.putExtra("PUTDATA",method);
                startActivity(mapIntent);
            }
        });



        builder.setView(mview);
        AlertDialog alertDialog = builder.create();
        alertDialog.show();



    }

    public void macdonals(View view)
    {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        View mview = getLayoutInflater().inflate(R.layout.delivery_macdonals,null);
        Button bmacdonals1 = (Button)mview.findViewById(R.id.macdonals1);
        Button bmacdonalsaddress = (Button)mview.findViewById(R.id.deliverymacdonals);

        bmacdonals1.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent macdonalsintent = new Intent(Intent.ACTION_CALL);
                macdonalsintent.setData(Uri.parse("tel:19991"));
                startActivity(macdonalsintent);
            }
        });
        bmacdonalsaddress.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                String method = "Macdonals";
                Intent mapIntent = new Intent(resturantzag.this, MapsActivity.class);
                mapIntent.putExtra("PUTDATA",method);
                startActivity(mapIntent);
            }
        });



        builder.setView(mview);
        AlertDialog alertDialog = builder.create();
        alertDialog.show();



    }

    public void elasel(View view)
    {
        startActivity(new Intent(resturantzag.this,ElaselResturant.class));
    }

    public void hotburger(View view)
    {
        startActivity(new Intent(resturantzag.this,HotBurger.class));
    }

    public void asmaakbahry(View view) {
        startActivity(new Intent(resturantzag.this,AsmakBahry.class));
    }

    public void sandwich(View view) {

        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        View mview = getLayoutInflater().inflate(R.layout.delivery_sandwich,null);
        Button sandwich1 = (Button)mview.findViewById(R.id.sandwich);
        Button sandwichadd= (Button)mview.findViewById(R.id.Addresssandwich);

        sandwich1.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent roken1intent = new Intent(Intent.ACTION_CALL);
                roken1intent.setData(Uri.parse("tel:01273922999"));
                startActivity(roken1intent);
            }
        });
        sandwichadd.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                String method = "Sandwich";
                Intent mapIntent = new Intent(resturantzag.this, MapsActivity.class);
                mapIntent.putExtra("PUTDATA",method);
                startActivity(mapIntent);
            }
        });



        builder.setView(mview);
        AlertDialog alertDialog = builder.create();
        alertDialog.show();
    }

    public void crepcity(View view)
    {
        startActivity(new Intent(resturantzag.this,CompanyCrep.class));
    }

    public void norelsham(View view)
    {
        startActivity(new Intent(resturantzag.this,NoorElsham.class));
    }

    public void elaraby(View view) {
        Intent arabyintent = new Intent(Intent.ACTION_CALL);
        arabyintent.setData(Uri.parse("tel:0552314301"));
        startActivity(arabyintent);
    }



    public void tata(View view) {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        View mview = getLayoutInflater().inflate(R.layout.delivery_tata,null);
        Button btata1 = (Button)mview.findViewById(R.id.tata1);
        Button btata2 = (Button)mview.findViewById(R.id.tata2);
        Button tataadd =(Button)mview.findViewById(R.id.tataaddress);
        btata1.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent tata1intent = new Intent(Intent.ACTION_CALL);
                tata1intent.setData(Uri.parse("tel:0552354049"));
                startActivity(tata1intent);
            }
        });
        btata2.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent tata2intent = new Intent(Intent.ACTION_CALL);
                tata2intent.setData(Uri.parse("tel:0552339559"));
                startActivity(tata2intent);
            }
        });
       tataadd.setOnClickListener(new OnClickListener() {
    @Override
    public void onClick(View v) {

        String method = "Tata";
        Intent mapIntent = new Intent(resturantzag.this, MapsActivity.class);
        mapIntent.putExtra("PUTDATA",method);
        startActivity(mapIntent);
    }
});
        builder.setView(mview);
        AlertDialog alertDialog = builder.create();
        alertDialog.show();
    }

    public void shahd(View view) {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        View mview = getLayoutInflater().inflate(R.layout.delivery_shahd,null);
        Button shahd1 = (Button)mview.findViewById(R.id.shahd1);
        Button shahdadd = (Button)mview.findViewById(R.id.shahdaddress);

        shahd1.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent shahd1intent = new Intent(Intent.ACTION_CALL);
                shahd1intent.setData(Uri.parse("tel:0552349373"));
                startActivity(shahd1intent);
            }
        });
        shahdadd.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                String method = "Shahd";
                Intent mapIntent = new Intent(resturantzag.this, MapsActivity.class);
                mapIntent.putExtra("PUTDATA",method);
                startActivity(mapIntent);
            }
        });


        builder.setView(mview);
        AlertDialog alertDialog = builder.create();
        alertDialog.show();
    }

    public void zezinia(View view) {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        View mview = getLayoutInflater().inflate(R.layout.delivery_zezinia,null);
        Button bzezinia1 = (Button)mview.findViewById(R.id.zezinia1);
        Button zeziadd = (Button)mview.findViewById(R.id.zeziniaaddress);

        bzezinia1.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent zezinia1intent = new Intent(Intent.ACTION_CALL);
                zezinia1intent.setData(Uri.parse("tel:0552384884"));
                startActivity(zezinia1intent);
            }
        });
        zeziadd.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                String method = "Zezinia";
                Intent mapIntent = new Intent(resturantzag.this, MapsActivity.class);
                mapIntent.putExtra("PUTDATA",method);
                startActivity(mapIntent);
            }
        });


        builder.setView(mview);
        AlertDialog alertDialog = builder.create();
        alertDialog.show();
    }


    public void kosharytahrir(View view)
    {

        Intent tahririntent = new Intent(Intent.ACTION_CALL);
        tahririntent.setData(Uri.parse("tel:0552378161"));
        startActivity(tahririntent);
    }

    public void kosharyaboahmed(View view)
    {
        Intent aboahmedintent = new Intent(Intent.ACTION_CALL);
        aboahmedintent.setData(Uri.parse("tel:0552353284"));
        startActivity(aboahmedintent);
    }

    public void Elzaeem(View view)
    {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        View mview = getLayoutInflater().inflate(R.layout.delivery_elzaem,null);
        Button belzaem1 = (Button)mview.findViewById(R.id.elzaem1);
        Button belzaem2 = (Button)mview.findViewById(R.id.elzaem2);
        Button belzaemadd= (Button)mview.findViewById(R.id.addresszaem);

        belzaem1.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent elzaem1Intent = new Intent(Intent.ACTION_CALL);
                elzaem1Intent.setData(Uri.parse("tel:0552320960"));
                startActivity(elzaem1Intent);
            }
        });
        belzaem2.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent elzaem2Intent = new Intent(Intent.ACTION_CALL);
                elzaem2Intent.setData(Uri.parse("tel:0552314848"));
                startActivity(elzaem2Intent);
            }
        });

        belzaemadd.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                String method = "Elzaem";
                Intent mapIntent = new Intent(resturantzag.this, MapsActivity.class);
                mapIntent.putExtra("PUTDATA",method);
                startActivity(mapIntent);
            }
        });



        builder.setView(mview);
        AlertDialog alertDialog = builder.create();
        alertDialog.show();
    }

    public void hatyelmolok(View view)
    {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        View mview = getLayoutInflater().inflate(R.layout.delivery_hatyelmlook,null);
        Button bhatyelmlook1 = (Button)mview.findViewById(R.id.hatymlook1);

        Button hatyelmlookadd= (Button)mview.findViewById(R.id.addressmlook);

     bhatyelmlook1.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent hatyelmlook1Intent = new Intent(Intent.ACTION_CALL);
                hatyelmlook1Intent.setData(Uri.parse("tel:0552340022"));
                startActivity(hatyelmlook1Intent);
            }
        });


        hatyelmlookadd.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                String method = "HatyMlook";
                Intent mapIntent = new Intent(resturantzag.this, MapsActivity.class);
                mapIntent.putExtra("PUTDATA",method);
                startActivity(mapIntent);
            }
        });



        builder.setView(mview);
        AlertDialog alertDialog = builder.create();
        alertDialog.show();
    }


    public void GomaaCrep(View view)
    {
        startActivity(new Intent(resturantzag.this,GomaaCrep.class));
    }

    public void PizzaAlex(View view) {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        View mview = getLayoutInflater().inflate(R.layout.delivery_pizzaalex,null);
        Button bpizzaalex1 = (Button)mview.findViewById(R.id.pizzaalex1);

        Button pizzaalexadd= (Button)mview.findViewById(R.id.deliveryalex);

        bpizzaalex1.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent pizzaalex1Intent = new Intent(Intent.ACTION_CALL);
                pizzaalex1Intent.setData(Uri.parse("tel:0552366951"));
                startActivity(pizzaalex1Intent);
            }
        });


        pizzaalexadd.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                String method = "pizzaalex";
                Intent mapIntent = new Intent(resturantzag.this, MapsActivity.class);
                mapIntent.putExtra("PUTDATA",method);
                startActivity(mapIntent);
            }
        });



        builder.setView(mview);
        AlertDialog alertDialog = builder.create();
        alertDialog.show();
    }

    public void sharawy(View view) {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        View mview = getLayoutInflater().inflate(R.layout.delivery_sharaawy,null);
        Button bsharaawy1 = (Button)mview.findViewById(R.id.sharaawy1);

        Button sharaawyadd= (Button)mview.findViewById(R.id.addsharaawy);

        bsharaawy1.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent sharaawy1Intent = new Intent(Intent.ACTION_CALL);
                sharaawy1Intent.setData(Uri.parse("tel:0552303392"));
                startActivity(sharaawy1Intent);
            }
        });


        sharaawyadd.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                String method = "sharaawy";
                Intent mapIntent = new Intent(resturantzag.this, MapsActivity.class);
                mapIntent.putExtra("PUTDATA",method);
                startActivity(mapIntent);
            }
        });
        builder.setView(mview);
        AlertDialog alertDialog = builder.create();
        alertDialog.show();

    }
}
