package com.joshsoftware.urdhvam.utils;

import android.Manifest;
import android.app.Activity;
import android.support.v4.app.ActivityCompat;
import android.support.v4.content.ContextCompat;

public class MyRuntimePermission {

    private static final int PERMISSION_EXTERNAL_STORAGE = 1;
    private static final int PERMISSION_RECORD_AUDIO = 2;
    private Activity context;

    public MyRuntimePermission(Activity context) {
        this.context = context;
    }

    public void checkPermissionForExternalStorage() {
        if (ActivityCompat.shouldShowRequestPermissionRationale(context, Manifest.permission.WRITE_EXTERNAL_STORAGE)) {
            ActivityCompat.requestPermissions(context, new String[]{Manifest.permission.WRITE_EXTERNAL_STORAGE}, PERMISSION_EXTERNAL_STORAGE);
        } else {
            ActivityCompat.requestPermissions(context, new String[]{Manifest.permission.WRITE_EXTERNAL_STORAGE}, PERMISSION_EXTERNAL_STORAGE);
        }

//        if (ActivityCompat.shouldShowRequestPermissionRationale(context,Manifest.permission.RECORD_AUDIO)){
//
//            ActivityCompat.requestPermissions(context,new String[]{Manifest.permission.RECORD_AUDIO},PERMISSION_RECORD_AUDIO);
//
//        }
    }
}