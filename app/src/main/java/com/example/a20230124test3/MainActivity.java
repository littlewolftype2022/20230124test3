package com.example.a20230124test3;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.content.Intent;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {


    //private Button tz1;


    //@SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //tz1 = (Button) findViewById(R.id.tz1);
        //tz1.setOnClickListener(this);

    }

    private void startActivity2(View view) {

        Intent intent = new Intent(this,MainActivity2.class);
        startActivity(intent);

    }




   /*
    public View.OnClickListener startActivity2(){
        Intent intent = new Intent(MainActivity.this,MainActivity2.class);
        startActivity2(intent);
        return null;
    }

    */




    /*

    @Override
    public void onClick(View v){
        tz1.setOnClickListener(startActivity2());

    }

     */



/*
    @Override
    public void onClick(View view){

    }

 */

}