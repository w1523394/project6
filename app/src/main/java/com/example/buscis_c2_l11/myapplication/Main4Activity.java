package com.example.buscis_c2_l11.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.view.View;
import android.view.View.OnClickListener;
import android.content.Intent;

public class Main4Activity extends AppCompatActivity implements OnClickListener {

    public Button cucumberId;
    public Button grapeId;
    public Button grapefruitId;
    public Button guavaId;
    public Button kiwiId;
    public Button lemonId;
    public Button limeId;
    public Button mangoId;
    public Button nextPage2Id;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);

        cucumberId = (Button)findViewById(R.id.cucumberId);
        grapeId = (Button)findViewById(R.id.grapeId);
        grapefruitId = (Button)findViewById(R.id.grapefruitId);
        guavaId = (Button)findViewById(R.id.guavaId);
        kiwiId = (Button)findViewById(R.id.kiwiId);
        lemonId = (Button)findViewById(R.id.lemonId);
        limeId = (Button)findViewById(R.id.limeId);
        mangoId = (Button)findViewById(R.id.mangoId);
        nextPage2Id = (Button)findViewById(R.id.nextPage2Id);

        cucumberId.setOnClickListener(this);
        grapeId.setOnClickListener(this);
        grapefruitId.setOnClickListener(this);
        guavaId.setOnClickListener(this);
        kiwiId.setOnClickListener(this);
        lemonId.setOnClickListener(this);
        limeId.setOnClickListener(this);
        mangoId.setOnClickListener(this);
        nextPage2Id.setOnClickListener(this);

    }

    public void onClick(View view) {
        if (view.getId() == R.id.cucumberId) {
            Intent intent = new Intent(this, CucumberActivity.class);
            startActivity(intent); }
        if(view.getId() == R.id.grapeId) {
            Intent intent = new Intent(this, GrapeActivity.class);
            startActivity(intent); }
        if(view.getId() == R.id.grapefruitId) {
            Intent intent = new Intent(this, GrapefruitActivity.class);
            startActivity(intent); }
        if(view.getId() == R.id.guavaId) {
            Intent intent = new Intent(this, GuavaActivity.class);
            startActivity(intent); }
        if(view.getId() == R.id.kiwiId) {
            Intent intent = new Intent(this, KiwiActivity.class);
            startActivity(intent); }
        if(view.getId() == R.id.lemonId) {
            Intent intent = new Intent(this, LemonActivity.class);
            startActivity(intent); }
        if(view.getId() == R.id.limeId) {
            Intent intent = new Intent(this, LimeActivity.class);
            startActivity(intent); }
        if(view.getId() == R.id.mangoId) {
            Intent intent = new Intent(this, MangoActivity.class);
            startActivity(intent); }
        if(view.getId() == R.id.nextPage2Id) {
            Intent intent = new Intent(this, Main5Activity.class);
            startActivity(intent); }
    }
}
