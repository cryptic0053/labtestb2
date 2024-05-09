package com.example.labtestb2;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

class info{
    int units;
    String genre_name[];
    public info(int units,String genre_name[])
    {
        this.units=units;
        this.genre_name=genre_name;
    }
}

class genre{

}

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}