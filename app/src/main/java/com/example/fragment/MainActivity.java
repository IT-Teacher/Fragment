package com.example.fragment;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button button1, button2;
    FirstFragment firstFragment;
    SecondFragment secondFragment;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button1 = findViewById(R.id.btn1);
        button2 = findViewById(R.id.btn2);

        button1.setOnClickListener(view->{

            getSupportFragmentManager().beginTransaction()
                    .setReorderingAllowed(true)
                    .replace(R.id.fragment, FirstFragment.class, null)
                    .commit();

        });
        button2.setOnClickListener(view->{
            getSupportFragmentManager().beginTransaction()
                    .setReorderingAllowed(true)
                    .replace(R.id.fragment, SecondFragment.class, null)
                    .commit();
        });


    }

}