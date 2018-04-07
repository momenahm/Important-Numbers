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
import android.widget.Toast;

public class hospitalZag extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hospital_zag);
    }

    public void gamahos(View view)
    {
        AlertDialog.Builder gamaabuilder = new AlertDialog.Builder(hospitalZag.this);
        View mview = getLayoutInflater().inflate(R.layout.gama_layout,null);

        Button bgamaa1 = (Button)mview.findViewById(R.id.gama1);
        Button bgamaa2 = (Button)mview.findViewById(R.id.gamaa2);
        Button bgamaa3 = (Button)mview.findViewById(R.id.gamaa3);
        Button bgamaa4 = (Button)mview.findViewById(R.id.gamaa4);
        Button bgamaa5 = (Button)mview.findViewById(R.id.gamaa5);
        Button bgamaaadress = (Button)mview.findViewById(R.id.gamaaddress);
        bgamaa1.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent gamaa1Intent = new Intent(Intent.ACTION_CALL);
                gamaa1Intent.setData(Uri.parse("tel:0552358544"));
                startActivity(gamaa1Intent);
            }
        });
        bgamaa2.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent gamaa2Intent = new Intent(Intent.ACTION_CALL);
                gamaa2Intent.setData(Uri.parse("tel:0552347341"));
                startActivity(gamaa2Intent);
            }
        });
        bgamaa3.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent gamaa3Intent = new Intent(Intent.ACTION_CALL);
                gamaa3Intent.setData(Uri.parse("tel:0552358540"));
                startActivity(gamaa3Intent);
            }
        });
        bgamaa4.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent gamaa4Intent = new Intent(Intent.ACTION_CALL);
                gamaa4Intent.setData(Uri.parse("tel:0552358541"));
                startActivity(gamaa4Intent);
            }
        });
        bgamaa5.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent gamaa5Intent = new Intent(Intent.ACTION_CALL);
                gamaa5Intent.setData(Uri.parse("tel:0552326172"));
                startActivity(gamaa5Intent);
            }
        });
        bgamaaadress.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                String method = "GamaaHospital";
                Intent mapIntent = new Intent(hospitalZag.this, MapsActivity.class);
                mapIntent.putExtra("PUTDATA",method);
                startActivity(mapIntent);
            }
        });


        gamaabuilder.setView(mview);
        AlertDialog mdialog = gamaabuilder.create();
        mdialog.show();

    }

    public void taiserzag(View view)
    {
        AlertDialog.Builder builder = new AlertDialog.Builder(hospitalZag.this);
        View mview = getLayoutInflater().inflate(R.layout.alert_layout,null);
        Button bnum1 = (Button)mview.findViewById(R.id.num1);
        Button bnum2 = (Button)mview.findViewById(R.id.num2);
        Button bnum3 = (Button)mview.findViewById(R.id.num3);
        Button bnum4 = (Button)mview.findViewById(R.id.num4);
        Button bnum5 = (Button)mview.findViewById(R.id.num5);
        Button bnum6 = (Button)mview.findViewById(R.id.num6);
        Button bnum7 = (Button)mview.findViewById(R.id.num7);
        Button bnum8 = (Button)mview.findViewById(R.id.num8);
        Button btieseraddress = (Button)mview.findViewById(R.id.addretieserss);
        bnum1.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent num1Intent = new Intent(Intent.ACTION_CALL);
                num1Intent.setData(Uri.parse("tel:0552475005"));
                startActivity(num1Intent);
            }
        });
        bnum2.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent num2Intent = new Intent(Intent.ACTION_CALL);
                num2Intent.setData(Uri.parse("tel:0552475006"));
                startActivity(num2Intent);
            }
        });
        bnum3.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent num3Intent = new Intent(Intent.ACTION_CALL);
                num3Intent.setData(Uri.parse("tel:0552475007"));
                startActivity(num3Intent);
            }
        });
        bnum4.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent num4Intent = new Intent(Intent.ACTION_CALL);
                num4Intent.setData(Uri.parse("tel:0552475008"));
                startActivity(num4Intent);
            }
        });
        bnum5.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent num5Intent = new Intent(Intent.ACTION_CALL);
                num5Intent.setData(Uri.parse("tel:0552475009"));
                startActivity(num5Intent);
            }
        });
        bnum6.setOnClickListener(new OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent num6Intent = new Intent(Intent.ACTION_CALL);
            num6Intent.setData(Uri.parse("tel:0552475010"));
            startActivity(num6Intent);
        }
    });
        bnum7.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent num7Intent = new Intent(Intent.ACTION_CALL);
                num7Intent.setData(Uri.parse("tel:0552475013"));
                startActivity(num7Intent);
            }
        });
        bnum8.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent num8Intent = new Intent(Intent.ACTION_CALL);
                num8Intent.setData(Uri.parse("tel:0552475014"));
                startActivity(num8Intent);
            }
        });
        btieseraddress.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                String method = "TieserHospital";
                Intent mapIntent = new Intent(hospitalZag.this, MapsActivity.class);
                mapIntent.putExtra("PUTDATA",method);
                startActivity(mapIntent);
            }
        });





        builder.setView(mview);
        AlertDialog dialog =  builder.create();
        dialog.show();
    }

    public void obourzag(View view)
    {
        AlertDialog.Builder mbuilder = new AlertDialog.Builder(hospitalZag.this);
        View mview = getLayoutInflater().inflate(R.layout.obour_layout,null);
        Button bobour1 = (Button)mview.findViewById(R.id.obour1);
        Button bobour2 = (Button)mview.findViewById(R.id.obour2);
        Button bobour3 = (Button)mview.findViewById(R.id.obour3);
        Button bobour4 = (Button)mview.findViewById(R.id.obour4);

        Button bobouradress = (Button)mview.findViewById(R.id.obouraddress);
        bobour1.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent obour1Intent = new Intent(Intent.ACTION_CALL);
                obour1Intent.setData(Uri.parse("tel:0552316363"));
                startActivity(obour1Intent);
            }
        });
        bobour2.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent obour2Intent = new Intent(Intent.ACTION_CALL);
                obour2Intent.setData(Uri.parse("tel:0552302292"));
                startActivity(obour2Intent);
            }
        });
        bobour3.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent obour3Intent = new Intent(Intent.ACTION_CALL);
                obour3Intent.setData(Uri.parse("tel:0552302295"));
                startActivity(obour3Intent);
            }
        });
        bobour4.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent obour4Intent = new Intent(Intent.ACTION_CALL);
                obour4Intent.setData(Uri.parse("tel:0552302296"));
                startActivity(obour4Intent);
            }
        });
        bobouradress.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                String method = "ObourHospital";
                Intent mapIntent = new Intent(hospitalZag.this, MapsActivity.class);
                mapIntent.putExtra("PUTDATA",method);
                startActivity(mapIntent);
            }
        });



        mbuilder.setView(mview);
        AlertDialog dialog = mbuilder.create();
        dialog.show();

    }

    public void ahhrarzag(View view)
    {
        AlertDialog.Builder mbuilder = new AlertDialog.Builder(hospitalZag.this);
        View mview = getLayoutInflater().inflate(R.layout.ahrar_layout,null);
        Button bahrar1 = (Button)mview.findViewById(R.id.obour1);
        Button bahrar2 = (Button)mview.findViewById(R.id.obour2);
        Button bahrar3 = (Button)mview.findViewById(R.id.obour3);
        Button bahrar4 = (Button)mview.findViewById(R.id.obour4);
        Button bahraraddress = (Button)mview.findViewById(R.id.addrahrar);
        bahrar1.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent ahrar1Intent = new Intent(Intent.ACTION_CALL);
                ahrar1Intent.setData(Uri.parse("tel:0552362740"));
                startActivity(ahrar1Intent);
            }
        });
        bahrar2.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent ahrar2Intent = new Intent(Intent.ACTION_CALL);
                ahrar2Intent.setData(Uri.parse("tel:0552362741"));
                startActivity(ahrar2Intent);
            }
        });
        bahrar3.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent ahrar3Intent = new Intent(Intent.ACTION_CALL);
                ahrar3Intent.setData(Uri.parse("tel:0552362743"));
                startActivity(ahrar3Intent);
            }
        });
        bahrar4.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent ahrar4Intent = new Intent(Intent.ACTION_CALL);
                ahrar4Intent.setData(Uri.parse("tel:0552362748"));
                startActivity(ahrar4Intent);
            }
        });
        bahraraddress.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {

                String method = "AhrarHospital";
                Intent mapIntent = new Intent(hospitalZag.this, MapsActivity.class);
                mapIntent.putExtra("PUTDATA",method);
                startActivity(mapIntent);
            }
        });


        mbuilder.setView(mview);
        AlertDialog dialog = mbuilder.create();
        dialog.show();

    }


    public void gawishzag(View view)
    {
        AlertDialog.Builder mbuilder = new AlertDialog.Builder(hospitalZag.this);
        View mview = getLayoutInflater().inflate(R.layout.gawish_layout,null);
        Button bgawish1 = (Button)mview.findViewById(R.id.gawish1);
        Button bgawish2 = (Button)mview.findViewById(R.id.gawish2);
        Button bgawish3 = (Button)mview.findViewById(R.id.gawish3);
        Button bgawish4 = (Button)mview.findViewById(R.id.gawish4);
        Button bgawishaddrss = (Button)mview.findViewById(R.id.gawishddress);
        bgawish1.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent gawish1Intent = new Intent(Intent.ACTION_CALL);
                gawish1Intent.setData(Uri.parse("tel:0552324585"));
                startActivity(gawish1Intent);
            }
        });
        bgawish2.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent gawish2Intent = new Intent(Intent.ACTION_CALL);
                gawish2Intent.setData(Uri.parse("tel:0552326031"));
                startActivity(gawish2Intent);
            }
        });
        bgawish3.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent gawish3Intent = new Intent(Intent.ACTION_CALL);
                gawish3Intent.setData(Uri.parse("tel:0552326037"));
                startActivity(gawish3Intent);
            }
        });
        bgawish4.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent gawish4Intent = new Intent(Intent.ACTION_CALL);
                gawish4Intent.setData(Uri.parse("tel:0552348404"));
                startActivity(gawish4Intent);
            }
        });
        bgawishaddrss.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                String method = "GawishHospital";
                Intent mapIntent = new Intent(hospitalZag.this, MapsActivity.class);
                mapIntent.putExtra("PUTDATA",method);
                startActivity(mapIntent);
            }
        });


        mbuilder.setView(mview);
        AlertDialog dialog = mbuilder.create();
        dialog.show();
    }

    public void mabarazag(View view)
    {
        AlertDialog.Builder mbuilder = new AlertDialog.Builder(hospitalZag.this);
        View mview = getLayoutInflater().inflate(R.layout.mabrazag_layout,null);
        Button bmabra1 = (Button)mview.findViewById(R.id.mabra1);
        Button bmabra2 = (Button)mview.findViewById(R.id.mabra2);
        Button bmabaraaddress = (Button)mview.findViewById(R.id.mabraaddress);

        bmabra1.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent mabra1Intent = new Intent(Intent.ACTION_CALL);
                mabra1Intent.setData(Uri.parse("tel:0552303071"));
                startActivity(mabra1Intent);
            }
        });
        bmabra2.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent mabra2Intent = new Intent(Intent.ACTION_CALL);
                mabra2Intent.setData(Uri.parse("tel:0552303081"));
                startActivity(mabra2Intent);
            }
        });
        bmabaraaddress.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                String method = "MabraHospital";
                Intent mapIntent = new Intent(hospitalZag.this, MapsActivity.class);
                mapIntent.putExtra("PUTDATA",method);
                startActivity(mapIntent);
            }
        });



        mbuilder.setView(mview);
        AlertDialog dialog = mbuilder.create();
        dialog.show();
    }


    public void hamdyzag(View view) {
        AlertDialog.Builder mbuilder = new AlertDialog.Builder(hospitalZag.this);
        View mview = getLayoutInflater().inflate(R.layout.hamtyelsayed,null);
        Button bamdyels1 = (Button)mview.findViewById(R.id.hamdyels1);
        Button bamdyels2 = (Button)mview.findViewById(R.id.hamdyels2);
        Button bamdyelsddress = (Button)mview.findViewById(R.id.hamdyaddress);
       try{

            bamdyels1.setOnClickListener(new OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent amdyels1Intent = new Intent(Intent.ACTION_CALL);
                    amdyels1Intent.setData(Uri.parse("tel:0552360181"));
                    startActivity(amdyels1Intent);
                }
            });
            bamdyels2.setOnClickListener(new OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent amdyels2Intent = new Intent(Intent.ACTION_CALL);
                    amdyels2Intent.setData(Uri.parse("tel:0552306198"));
                    startActivity(amdyels2Intent);
                }
            });
        }catch (Exception e) {
           Toast.makeText(this,"Demo application Failed to invoke call" + e.toString(),Toast.LENGTH_LONG).show();
       }
            bamdyelsddress.setOnClickListener(new OnClickListener() {
                @Override
                public void onClick(View v) {
                    String method = "hamdyelsHospital";
                    Intent mapIntent = new Intent(hospitalZag.this, MapsActivity.class);
                    mapIntent.putExtra("PUTDATA", method);
                    startActivity(mapIntent);
                }
            });

        /*
        *
        * if (mContext.checkSelfPermission(Manifest.permission.CALL_PHONE) == PackageManager.PERMISSION_GRANTED) {
    Intent callIntent = new Intent(Intent.ACTION_CALL);
    callIntent.setData(Uri.parse("tel:" + phoneNumber));
    callIntent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
    startActivity(callIntent);
}
        *
        * */



        mbuilder.setView(mview);
        AlertDialog dialog = mbuilder.create();
        dialog.show();
    }

}
