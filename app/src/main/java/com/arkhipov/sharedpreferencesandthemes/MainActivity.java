package com.arkhipov.sharedpreferencesandthemes;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.Switch;
import android.widget.TextView;

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
        themeController.switchThemMode(!themeController.isNightMode());
        finish();
        startActivity(new Intent(this, getClass()));
    }
}