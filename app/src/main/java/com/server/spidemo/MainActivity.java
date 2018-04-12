package com.server.spidemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import java.util.Iterator;
import java.util.ServiceLoader;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onClick(View v){
        ServiceLoader<IDemo> demos = ServiceLoader.load(IDemo.class);
        Iterator<IDemo> iterator = demos.iterator();

        if (iterator.hasNext()){
            iterator.next().demo();
        }
    }
}
