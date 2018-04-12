package com.server.spidemo;

import android.util.Log;

public class ADemo implements IDemo{
    @Override
    public void demo() {
        Log.e("tanlin", this.getClass().getName());
    }
}
