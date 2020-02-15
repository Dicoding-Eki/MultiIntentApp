package com.belajar.multiintentapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.*;

public class MoveWithDataActivity extends AppCompatActivity {

    public static String EXTRA_AGE = "extra_age";
    public static String EXTRA_NAME = "extra_name";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_move_with_data);

        TextView tvNameReceived = findViewById(R.id.tv_name_received);
        TextView tvAgeReceived = findViewById(R.id.tv_age_received);


        String name = getIntent().getStringExtra(EXTRA_NAME);
        int age = getIntent().getIntExtra(EXTRA_AGE, 0);

        String displayName = "Name : " + name;
        String displayAge = "Your Age : " + age;
        tvNameReceived.setText(displayName);
        tvAgeReceived.setText(displayAge);

    }
}
