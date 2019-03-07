package com.meterstoinches.quiz1;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button one;
    public static FragmentManager fragmentManager;
    Fragment f=null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        one = (Button) findViewById(R.id.b1);
        fragmentManager=getSupportFragmentManager();
    }

    public void select(View view) {
        if(view==findViewById(R.id.b1)){
            f=new FirstFragment();
        }
        FragmentTransaction Transaction=fragmentManager.beginTransaction();
        Transaction.add(R.id.fragmentOne,f,null).commit();
    }


    public void selectb2(View view) {
        if(view==findViewById(R.id.b2)){
            f=new FragmnetTwo();
        }
        FragmentTransaction Transaction=fragmentManager.beginTransaction();
        Transaction.add(R.id.fragmentTwo,f,null).commit();
    }

    public void selectb3(View view) {
        if(view==findViewById(R.id.b3)){
            f=new ThirdFragment();
        }
        FragmentTransaction Transaction=fragmentManager.beginTransaction();
        Transaction.add(R.id.fragmentThree,f,null).commit();
    }
}
