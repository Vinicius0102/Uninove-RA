package com.example.vinicius.uninove_ra;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;

public class MainActivity extends AppCompatActivity {

    private Toolbar sToolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        sToolbar = (Toolbar)findViewById(R.id.toolbar01);
        sToolbar.setTitle("Uninove - RA");
        sToolbar.setSubtitle(" Fabrica de app - Uninove");
        setSupportActionBar(sToolbar);



    }
}
