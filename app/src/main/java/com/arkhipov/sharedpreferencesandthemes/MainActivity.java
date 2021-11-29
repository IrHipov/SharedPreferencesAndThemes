package com.arkhipov.sharedpreferencesandthemes;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    private ThemeController themeController;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        themeController = new ThemeController(this);

        this.setTheme(themeController.getTheme());
        setContentView(R.layout.activity_main);
    }

    public void onSwitchMode(View view){
        themeController.switchThemeMode(!themeController.isNightMode());
        finish();
        startActivity(new Intent(this, getClass()));
    }
}