package com.example.buscis_c2_l11.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.view.View;
import android.view.View.OnClickListener;
import android.content.Intent;
import android.widget.Toast;

public class Main5Activity extends AppCompatActivity implements OnClickListener {

    public Button melonId;
    public Button orangeId;
    public Button peachId;
    public Button pineappleId;
    public Button pomegranateId;
    public Button raspberryId;
    public Button strawberryId;
    public Button tomatoId;
    public Button nextPage3Id;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main5);
        melonId = (Button)findViewById(R.id.melonId);
        orangeId = (Button)findViewById(R.id.orangeId);
        peachId = (Button)findViewById(R.id.peachId);
        pineappleId = (Button)findViewById(R.id.pineappleId);
        pomegranateId = (Button)findViewById(R.id.pomegranateId);
        raspberryId = (Button)findViewById(R.id.raspberryId);
        strawberryId = (Button)findViewById(R.id.strawberryId);
        tomatoId = (Button)findViewById(R.id.tomatoId);
        nextPage3Id = (Button)findViewById(R.id.nextPage3Id);

        melonId.setOnClickListener(this);
        orangeId.setOnClickListener(this);
        peachId.setOnClickListener(this);
        pineappleId.setOnClickListener(this);
        pomegranateId.setOnClickListener(this);
        raspberryId.setOnClickListener(this);
        strawberryId.setOnClickListener(this);
        tomatoId.setOnClickListener(this);
        nextPage3Id.setOnClickListener(this);

    }

    public void onClick(View view) {
        if (view.getId() == R.id.melonId) {
            Intent intent = new Intent(this, MelonActivity.class);
            startActivity(intent); }
        if(view.getId() == R.id.orangeId) {
            Intent intent = new Intent(this, OrangeActivity.class);
            startActivity(intent); }
        if(view.getId() == R.id.peachId) {
            Intent intent = new Intent(this, PeachActivity.class);
            startActivity(intent); }
        if(view.getId() == R.id.pineappleId) {
            Intent intent = new Intent(this, PineappleActivity.class);
            startActivity(intent); }
        if(view.getId() == R.id.pomegranateId) {
            Intent intent = new Intent(this, PomegranateActivity.class);
            startActivity(intent); }
        if(view.getId() == R.id.raspberryId) {
            Intent intent = new Intent(this, RaspberryActivity.class);
            startActivity(intent); }
        if(view.getId() == R.id.strawberryId) {
            Intent intent = new Intent(this, StrawberryActivity.class);
            startActivity(intent); }
        if(view.getId() == R.id.tomatoId) {
            Intent intent = new Intent(this, TomatoActivity.class);
            startActivity(intent); }
        if(view.getId() == R.id.nextPage3Id) {
            Toast.makeText(getApplicationContext(), "Last Page Reached",
                    Toast.LENGTH_SHORT).show(); }
    }
}

