package com.example.scrollview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    ImageButton ibApple,ibAvocado, ibBanana, ibGrape, ibMango, ibOrange, ibPapaya, ibStrawberry, ibTangerine, ibWatermelon;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ibApple = findViewById(R.id.ib_apple);
        ibAvocado = findViewById(R.id.ib_avocado);
        ibBanana = findViewById(R.id.ib_banana);
        ibGrape = findViewById(R.id.ib_grape);
        ibMango = findViewById(R.id.ib_mango);
        ibOrange = findViewById(R.id.ib_orange);
        ibPapaya = findViewById(R.id.ib_papaya);
        ibStrawberry = findViewById(R.id.ib_strawberry);
        ibTangerine = findViewById(R.id.ib_tangerine);
        ibWatermelon = findViewById(R.id.ib_watermelon);

        ibApple.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this,"Esta es una Manzana", Toast.LENGTH_SHORT).show();
            }
        });
        ibAvocado.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this,"Esta es una Palta", Toast.LENGTH_SHORT).show();
            }
        });
        ibBanana.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this,"Esta es un Plátano", Toast.LENGTH_SHORT).show();
            }
        });
        ibGrape.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this,"Esta son Uvas", Toast.LENGTH_SHORT).show();
            }
        });
        ibMango.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this,"Esta es un Mango", Toast.LENGTH_SHORT).show();
            }
        });
        ibOrange.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this,"Esta es una Naranja", Toast.LENGTH_SHORT).show();
            }
        });
        ibPapaya.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this,"Esta es una Papaya", Toast.LENGTH_SHORT).show();
            }
        });
        ibStrawberry.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this,"Esta es una Fresa", Toast.LENGTH_SHORT).show();
            }
        });
        ibTangerine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this,"Esta es una Mandarina", Toast.LENGTH_SHORT).show();
            }
        });
        ibWatermelon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this,"Esta es una Sandía", Toast.LENGTH_SHORT).show();
            }
        });
    }
}