package com.mario.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;

import java.util.ArrayList;
import java.util.Random;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    private ArrayList<Integer> lista= new ArrayList<Integer>();
    private ImageView img1,img2,img3,img4,img5,img6,img7,img8,img9;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lista.add(R.drawable.paisaje1);

        img1=findViewById(R.id.ima1);
        img2=findViewById(R.id.ima2);
        img3=findViewById(R.id.ima3);

        img4=findViewById(R.id.ima4);
        img5=findViewById(R.id.ima5);
        img6=findViewById(R.id.ima6);

        img7=findViewById(R.id.ima7);
        img8=findViewById(R.id.ima8);
        img9=findViewById(R.id.ima9);

        img1.setOnClickListener(this);
        img2.setOnClickListener(this);
        img3.setOnClickListener(this);

        img4.setOnClickListener(this);
        img5.setOnClickListener(this);
        img6.setOnClickListener(this);

        img7.setOnClickListener(this);
        img8.setOnClickListener(this);
        img9.setOnClickListener(this);
    }

    @Override
    public void onClick(View v){
        ImageView imagen = findViewById(v.getId());
        Random rand = new Random();
        int num = (int)rand.nextInt(lista.size());
        imagen.setImageResource(lista.get(num));

    }
}
