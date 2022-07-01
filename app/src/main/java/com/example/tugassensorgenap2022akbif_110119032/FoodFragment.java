package com.example.tugassensorgenap2022akbif_110119032;

import android.Manifest;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.Fragment;
import com.google.android.gms.location.FusedLocationProviderClient;
import com.google.android.gms.location.LocationServices;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import androidx.fragment.app.FragmentActivity;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.BitmapDescriptor;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

//Nama  : Ginanjar Tubagus Gumilar
//NIM   : 10119032
//Kelas : IF 1

public class FoodFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // Initialize view
        View view = inflater.inflate(R.layout.fragment_maps, container, false);

        SupportMapFragment mapFragment=(SupportMapFragment) getChildFragmentManager().findFragmentById(R.id.google_map);

        // check condition
        if (ContextCompat.checkSelfPermission(getActivity(), Manifest.permission.ACCESS_FINE_LOCATION) == PackageManager.PERMISSION_GRANTED && ContextCompat.checkSelfPermission(getActivity(),
                Manifest.permission.ACCESS_COARSE_LOCATION) == PackageManager.PERMISSION_GRANTED) {

                mapFragment.getMapAsync(googleMap -> {
                    //Lokasi 1
                    LatLng lokasi1 = new LatLng(-6.960492860547133, 107.61362744266117);
                    MarkerOptions options1 = new MarkerOptions().position(lokasi1).title("Rumah Makan Moroseneng");
                    //Lokasi 2
                    LatLng lokasi2 = new LatLng(-6.959327699766084, 107.61352537220095);
                    MarkerOptions options2 = new MarkerOptions().position(lokasi2).title("Dapur Riang 23");
                    //Lokasi 3
                    LatLng lokasi3 = new LatLng(-6.961886700255742, 107.61112658400664);
                    MarkerOptions options3 = new MarkerOptions().position(lokasi3).title("Warung nasi Cibiuk Teh Iis");
                    //Lokasi 4
                    LatLng lokasi4 = new LatLng(-6.958897096136771, 107.61316812559018);
                    MarkerOptions options4 = new MarkerOptions().position(lokasi4).title("Warung Nasi Alam Priangan");
                    //Lokasi 5
                    LatLng lokasi5 = new LatLng(-6.9594220367462, 107.6100780659454);
                    MarkerOptions options5 = new MarkerOptions().position(lokasi5).title("jajanan & seblak mmh mulki");
                    googleMap.animateCamera(CameraUpdateFactory.newLatLngZoom(lokasi3,16));
                    googleMap.addMarker(options1);
                    googleMap.addMarker(options2);
                    googleMap.addMarker(options3);
                    googleMap.addMarker(options4);
                    googleMap.addMarker(options5);


            });
        }
        else {
            // When permission is not granted
            // Call method
            requestPermissions(new String[] {Manifest.permission.ACCESS_FINE_LOCATION, Manifest.permission.ACCESS_COARSE_LOCATION }, 100);
        }
        // Return view
        return view;
    }

}