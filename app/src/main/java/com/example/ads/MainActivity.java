package com.example.ads;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    private TextView latitude;
    private TextView longtitude;
    private TextView numberOfRooms;
    private Button submitButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        latitude = (TextView)findViewById(R.id.latitude);
        longtitude = (TextView)findViewById(R.id.longtitude);
        numberOfRooms = (TextView)findViewById(R.id.numberOfRooms);
        submitButton = (Button)findViewById(R.id.submitButton);

        submitButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Apartment apartment = new Apartment();
                apartment.setLatitude(Float.parseFloat(latitude.getText().toString()));
                apartment.setLongtitude(Float.parseFloat(longtitude.getText().toString()));
                apartment.setNumberOfRooms(Integer.parseInt(numberOfRooms.getText().toString()));
                save(apartment);
            }
        });





    }

    private void save(Apartment apartment) {




    }

}
