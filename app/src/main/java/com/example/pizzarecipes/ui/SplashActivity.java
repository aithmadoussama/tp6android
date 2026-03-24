package com.example.pizzarecipes.ui;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.example.pizzarecipes.R;

public class SplashActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        Thread t = new Thread(()->{
            try {
                Thread.sleep(5000);
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
            Intent i = new Intent(SplashActivity.this, ListPizzaActivity.class);
            startActivity(i);
            finish();
        });
        t.start();
        Toast.makeText(this, "Bienvenue", Toast.LENGTH_LONG).show();

    }

}
