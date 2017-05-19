package com.example.dani.fragmentos;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        if (savedInstanceState == null) {
            //adicionar o fragmento inicial
            getFragmentManager()
                    .beginTransaction()
                    .add(R.id.frame_container,new NovoFragment())
                    .commit();
        }

        Button f1 = (Button) findViewById(R.id.btnFrag1);
        Button f2 = (Button) findViewById(R.id.btnFrag2);
        f1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getFragmentManager()
                        .beginTransaction()
                        .replace(R.id.frame_container, new NovoFragment())
                        .commit();
            }
        });
        f2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getFragmentManager()
                        .beginTransaction()
                        .replace(R.id.frame_container, new SegundoFragment())
                        .commit();
            }
        });
    }



}

