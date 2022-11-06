package com.lisbeth.gradients;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import java.util.Objects;

public class Gradient extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gradient);
        Objects.requireNonNull(getSupportActionBar()).hide();
    }

    public void buttonGradient(View view) {
        Intent intent = new Intent(Gradient.this, ButtonGradient.class);
        startActivity(intent);
    }
}