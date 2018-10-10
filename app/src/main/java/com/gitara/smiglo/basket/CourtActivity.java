package com.gitara.smiglo.basket;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.MapFragment;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;
import com.google.gson.Gson;
import com.squareup.picasso.NetworkPolicy;
import com.squareup.picasso.Picasso;

import butterknife.BindView;
import butterknife.ButterKnife;

public class CourtActivity extends AppCompatActivity implements OnMapReadyCallback {
    Playground court;
    @BindView(R.id.imageView6)
    ImageView imageView6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_court);


        ButterKnife.bind(this);
        court = new Gson().fromJson(this.getIntent().getStringExtra("court"), Playground.class);
        Picasso.get().load(court.getImage()).networkPolicy(NetworkPolicy.OFFLINE).into(imageView6);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);


        MapFragment mapFragment = (MapFragment) getFragmentManager()
                .findFragmentById(R.id.map2);

        mapFragment.getMapAsync(this);
    }


    @Override
    public void onMapReady(GoogleMap googleMap) {

//        Toast.makeText(this.getBaseContext(),court.getName(),Toast.LENGTH_LONG).show();
        googleMap.getUiSettings().setAllGesturesEnabled(false);

        LatLng sydney = new LatLng(court.getLatitude(), court.getLongtitude());
        googleMap.addMarker(new MarkerOptions().position(sydney)
                .title("elo"));
        googleMap.moveCamera(CameraUpdateFactory.newLatLng(sydney));
    }


}
