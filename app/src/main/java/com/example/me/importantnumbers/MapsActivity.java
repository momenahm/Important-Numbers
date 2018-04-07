package com.example.me.importantnumbers;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.widget.Toast;

public class MapsActivity extends FragmentActivity implements OnMapReadyCallback {

    private GoogleMap mMap;

    String method;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maps);
        // Obtain the SupportMapFragment and get notified when the map is ready to be used.

      //  Toast.makeText(this,method,Toast.LENGTH_LONG).show();


        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);
    }


    /**
     * Manipulates the map once available.
     * This callback is triggered when the map is ready to be used.
     * This is where we can add markers or lines, add listeners or move the camera. In this case,
     * we just add a marker near Sydney, Australia.
     * If Google Play services is not installed on the device, the user will be prompted to install
     * it inside the SupportMapFragment. This method will only be triggered once the user has
     * installed Google Play services and returned to the app.
     */


    @Override
    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;
        // Add a marker in Sydney and move the camera




try {

       method=getIntent().getExtras().getString("PUTDATA");
        if (method.equals("oriental"))
        {
            LatLng oriental = new LatLng(30.590944,31.494542);
            mMap.addMarker(new MarkerOptions().position(oriental).title("مطعم اورينتال")).showInfoWindow();
            mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(oriental, 20));
        }
        else if (method.equals("paradis"))
        {
            LatLng oriental = new LatLng(30.587589,31.503696);
            mMap.addMarker(new MarkerOptions().position(oriental).title("مطعم براديز")).showInfoWindow();
            mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(oriental, 20));
        }
        else if (method.equals("Maxim"))
        {
            LatLng oriental = new LatLng(30.589942,31.488971);
            mMap.addMarker(new MarkerOptions().position(oriental).title("مطعم ماكسيم")).showInfoWindow();
            mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(oriental, 20));
        }
        else if (method.equals("SDays"))
        {
            LatLng oriental = new LatLng(30.590884,31.496636);
            mMap.addMarker(new MarkerOptions().position(oriental).title("مطعم 7Days")).showInfoWindow();
            mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(oriental, 20));
        }
        else if (method.equals("Elasel"))
        {
            LatLng oriental = new LatLng(30.591034,31.489246);
            mMap.addMarker(new MarkerOptions().position(oriental).title("مطعم الاصيل")).showInfoWindow();
            mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(oriental, 20));
        }
        else if (method.equals("Gomaa"))
        {
            LatLng oriental = new LatLng(30.588941,31.489247);
            mMap.addMarker(new MarkerOptions().position(oriental).title("كريب جمعة")).showInfoWindow();
            mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(oriental, 20));
        }
        else if (method.equals("Soltan"))
        {
            LatLng oriental = new LatLng(30.592463,31.486854);
            mMap.addMarker(new MarkerOptions().position(oriental).title("Sultan Grill")).showInfoWindow();
            mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(oriental, 20));
        }
        else if (method.equals("Sandwich"))
        {
            LatLng oriental = new LatLng(30.587104,31.487165);
            mMap.addMarker(new MarkerOptions().position(oriental).title("sandwich")).showInfoWindow();
            mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(oriental, 20));
        }
        else if (method.equals("HotBurger"))
        {
            LatLng oriental = new LatLng(30.589298,31.487181);
            mMap.addMarker(new MarkerOptions().position(oriental).title("مطعم هوت برجر")).showInfoWindow();
            mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(oriental, 20));
        }
        else if (method.equals("Tata"))
        {
            LatLng oriental = new LatLng(30.588621,31.493790);
            mMap.addMarker(new MarkerOptions().position(oriental).title("مطعم طأطأ")).showInfoWindow();
            mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(oriental, 20));
        }
        else if (method.equals("Shahd"))
        {
            LatLng oriental = new LatLng(30.590154,31.495850);
            mMap.addMarker(new MarkerOptions().position(oriental).title("مطعم شهد")).showInfoWindow();
            mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(oriental, 20));
        }
        else if (method.equals("Zezinia"))
        {
            LatLng oriental = new LatLng(30.590136,31.495483);
            mMap.addMarker(new MarkerOptions().position(oriental).title("مطعم زيزينيا")).showInfoWindow();
            mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(oriental, 20));
        }
        else if (method.equals("Pizzahut"))
        {
            LatLng oriental = new LatLng(30.592491,31.491105);
            mMap.addMarker(new MarkerOptions().position(oriental).title("pizza hut zagazig")).showInfoWindow();
            mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(oriental, 20));
        }
        else if (method.equals("Elzaem"))
        {
            LatLng oriental = new LatLng(30.590619,31.499503);
            mMap.addMarker(new MarkerOptions().position(oriental).title("مطعم الزعيم")).showInfoWindow();
            mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(oriental, 20));
        }
        else if (method.equals("HatyMlook"))
        {
            LatLng oriental = new LatLng(30.595294,31.498072);
            mMap.addMarker(new MarkerOptions().position(oriental).title("حاتي الملوك")).showInfoWindow();
            mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(oriental, 20));
        }
        else if (method.equals("Company"))
        {
            LatLng oriental = new LatLng(30.587065,31.486626);
            mMap.addMarker(new MarkerOptions().position(oriental).title("The Crepe Company T.C.C")).showInfoWindow();
            mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(oriental, 20));
        }
        else if (method.equals("pizzaalex"))
        {
            LatLng oriental = new LatLng(30.588961,31.491982);
            mMap.addMarker(new MarkerOptions().position(oriental).title("بيتزا اسكندرية")).showInfoWindow();
            mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(oriental, 20));
        }
        else if (method.equals("sharaawy"))
        {
            LatLng oriental = new LatLng(30.586550,31.504803);
            mMap.addMarker(new MarkerOptions().position(oriental).title("مطعم الشرقاوي")).showInfoWindow();
            mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(oriental, 20));
        }
        else if (method.equals("Noorsh"))
        {
            LatLng oriental = new LatLng(30.590785,31.488997);
            mMap.addMarker(new MarkerOptions().position(oriental).title("مطعم نور الشام")).showInfoWindow();
            mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(oriental, 25));
        }
        else if (method.equals("ObourHospital"))
        {
            LatLng oriental = new LatLng(30.590338,30.590338);
            mMap.addMarker(new MarkerOptions().position(oriental).title("مستشفي العبور")).showInfoWindow();
            mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(oriental, 20));
        }
        else if (method.equals("MabraHospital"))
        {
            LatLng oriental = new LatLng(30.587114,31.491273);
            mMap.addMarker(new MarkerOptions().position(oriental).title("مستشفي المبرة")).showInfoWindow();
            mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(oriental, 20));
        }
        else if (method.equals("GawishHospital"))
        {
            LatLng oriental = new LatLng(30.591402,31.493388);
            mMap.addMarker(new MarkerOptions().position(oriental).title("مستشفي الجاويش")).showInfoWindow();
            mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(oriental, 20));
        }
        else if (method.equals("TieserHospital"))
        {
            LatLng oriental = new LatLng(30.597666,31.496261);
            mMap.addMarker(new MarkerOptions().position(oriental).title("مستشفي التيسير")).showInfoWindow();
            mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(oriental, 20));
        }
        else if (method.equals("GamaaHospital"))
        {
            LatLng oriental = new LatLng(30.584976,31.487308);
            mMap.addMarker(new MarkerOptions().position(oriental).title("مستشفي جامعة الزقازيق")).showInfoWindow();
            mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(oriental, 20));
        }
        else if (method.equals("AhrarHospital"))
        {
            LatLng oriental = new LatLng(30.566161,31.501755);
            mMap.addMarker(new MarkerOptions().position(oriental).title("مستشفي الأحرار")).showInfoWindow();
            mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(oriental, 20));
        }
        else if (method.equals("hamdyelsHospital"))
        {
            LatLng oriental = new LatLng(30.595827,31.496724);
            mMap.addMarker(new MarkerOptions().position(oriental).title("مستشفي حمدي السيد")).showInfoWindow();
            mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(oriental, 20));
        }
        else if (method.equals("Macdonals"))
        {
            LatLng oriental = new LatLng(30.590006,31.490323);
            mMap.addMarker(new MarkerOptions().position(oriental).title("McDonald's")).showInfoWindow();
            mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(oriental, 20));
        }
        else if (method.equals("Asmak"))
        {
            LatLng oriental = new LatLng(30.588898,31.488117);
            mMap.addMarker(new MarkerOptions().position(oriental).title("مطعم اسماك بحري")).showInfoWindow();
            mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(oriental, 20));
        }




}catch (Exception e)
{
    Toast.makeText(this,e.toString(),Toast.LENGTH_LONG).show();

}



    }




}
