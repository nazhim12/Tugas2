package com.example.tugas2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void actone(View view) {
        Intent a = new Intent(MainActivity.this,MainActivity2.class);
        startActivity(a);
    }

    public void acttwo(View view) {
        Intent B = new Intent(MainActivity.this,MainActivity3.class);
        startActivity(B);
    }
}