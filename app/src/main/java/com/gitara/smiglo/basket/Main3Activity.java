package com.gitara.smiglo.basket;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;
import android.widget.TextView;

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

public class Main3Activity extends AppCompatActivity implements OnMapReadyCallback {

    @BindView(R.id.textView10)
    TextView textView10;
    @BindView(R.id.imageView5)
    ImageView imageView5;
    @BindView(R.id.textView11)
    TextView textView11;
    Playground court;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        ButterKnife.bind(this);

        court = new Gson().fromJson(this.getIntent().getStringExtra("court"), Playground.class);
        Picasso.get().load(court.getImage()).networkPolicy(NetworkPolicy.OFFLINE).transform(new PicassoCircleTransformation()).into(imageView5);
        textView10.setText(court.getName());
        textView11.setText(court.getAddress());
        MapFragment mapFragment = (MapFragment) getFragmentManager()
                .findFragmentById(R.id.map);

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
