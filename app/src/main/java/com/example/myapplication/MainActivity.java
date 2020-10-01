package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    int count = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onClickFirstButton(View view)
    {
       count++;
        TextView tv1 = findViewById(R.id.textView);
        tv1.setText(count+"");
    }

    public void onClickSecondButton(View view)
    {
        count--;
        TextView tv1 = findViewById(R.id.textView);
        tv1.setText(count+"");
    }
    public void onClickThirdButton(View view)
    {
        startActivity(new Intent(MainActivity.this,Main2Activity.class));
    }
    public void openDialogue(View view){

    }

}