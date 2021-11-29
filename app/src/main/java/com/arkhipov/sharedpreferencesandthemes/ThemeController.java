package com.arkhipov.sharedpreferencesandthemes;

import android.content.Context;
import android.content.SharedPreferences;

public class ThemeController {
    public static final String APP_PREFERENCES = "ThemeControllerSharedPreferences";
    public static final String SP_NIGHT_MODE = "IsNightMode";

    private final SharedPreferences sharedPreferences;

    public ThemeController(Context context) {
        sharedPreferences = context.getSharedPreferences(APP_PREFERENCES, Context.MODE_PRIVATE);
    }

    public void switchThemMode(boolean turnOnNightMode) {
        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.putBoolean(SP_NIGHT_MODE, turnOnNightMode);
        editor.apply(); // or commit(), it's same;
    }

    public int getTheme() {
        return isNightMode() ? R.style.Custom_Night : R.style.Custom_Light;
    }

    public boolean isNightMode() {
        return sharedPreferences.getBoolean(SP_NIGHT_MODE, false);
    }
}
