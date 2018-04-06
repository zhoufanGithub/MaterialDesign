package com.zhoufan.materialdesigndemo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

/**
 * Material Design
 */
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    // DrawerLayout NavigationView
    public void drawerLayout(View view) {
        startActivity(new Intent(MainActivity.this, DrawerLayoutActivity.class));
    }
}
