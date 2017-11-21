package com.example.buscis_c2_l11.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.view.View;
import android.view.View.OnClickListener;


public class Main2Activity extends AppCompatActivity implements OnClickListener {

    public Button appleId;
    public Button avacadoId;
    public Button bannanaId;
    public Button blackberryId;
    public Button blueberryId;
    public Button coconutId;
    public Button cherryId;
    public Button cranberryId;
    public Button nextPageId;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        appleId = (Button)findViewById(R.id.appleId);
        avacadoId = (Button)findViewById(R.id.avacadoId);
        bannanaId = (Button)findViewById(R.id.bannanaId);
        blackberryId = (Button)findViewById(R.id.blackberryId);
        blueberryId = (Button)findViewById(R.id.blueberryId);
        coconutId = (Button)findViewById(R.id.coconutId);
        cherryId = (Button)findViewById(R.id.cherryId);
        cranberryId = (Button)findViewById(R.id.cranberryId);
        nextPageId = (Button)findViewById(R.id.nextPageId);

        appleId.setOnClickListener(this);
        avacadoId.setOnClickListener(this);
        bannanaId.setOnClickListener(this);
        blackberryId.setOnClickListener(this);
        blueberryId.setOnClickListener(this);
        coconutId.setOnClickListener(this);
        cherryId.setOnClickListener(this);
        cranberryId.setOnClickListener(this);
        nextPageId.setOnClickListener(this);
    }

    public void onClick(View view) {
        if (view.getId() == R.id.appleId) {
            Intent intent = new Intent(this, AppleActivity.class);
            startActivity(intent); }
        if(view.getId() == R.id.avacadoId) {
            Intent intent = new Intent(this, AvacadoActivity.class);
            startActivity(intent); }
        if(view.getId() == R.id.bannanaId) {
            Intent intent = new Intent(this, BannanaActivity.class);
            startActivity(intent); }
        if(view.getId() == R.id.blackberryId) {
            Intent intent = new Intent(this, BlackberryActivity.class);
            startActivity(intent); }
        if(view.getId() == R.id.blueberryId) {
            Intent intent = new Intent(this, BlueberryActivity.class);
            startActivity(intent); }
        if(view.getId() == R.id.coconutId) {
            Intent intent = new Intent(this, CoconutActivity.class);
            startActivity(intent); }
        if(view.getId() == R.id.cherryId) {
            Intent intent = new Intent(this, CherryActivity.class);
            startActivity(intent); }
        if(view.getId() == R.id.cranberryId) {
            Intent intent = new Intent(this, CranberryActivity.class);
            startActivity(intent); }
        if(view.getId() == R.id.nextPageId) {
            Intent intent = new Intent(this, Main4Activity.class);
            startActivity(intent); }
    }
}
