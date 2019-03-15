package com.mario.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    private ImageView img1,img2,img3,img4,img5,img6,img7,img8,img9;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

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
        int viewId = v.getId();
        Log.i("id",viewId+"");
        switch (viewId){
            case R.id.ima1:
                img1.setImageResource(R.drawable.magunas);
                break;
            case R.id.ima2:
                img2.setImageResource(R.drawable.magunas);
                break;
            case R.id.ima3:
                img3.setImageResource(R.drawable.magunas);
                break;
            case R.id.ima4:
                img4.setImageResource(R.drawable.magunas);
                break;
            case R.id.ima5:
                img5.setImageResource(R.drawable.magunas);
                break;
            case R.id.ima6:
                img6.setImageResource(R.drawable.magunas);
                break;
            case R.id.ima7:
                img7.setImageResource(R.drawable.magunas);
                break;
            case R.id.ima8:
                img8.setImageResource(R.drawable.magunas);
                break;
            case R.id.ima9:
                img9.setImageResource(R.drawable.magunas);
                break;

        }
    }
}
