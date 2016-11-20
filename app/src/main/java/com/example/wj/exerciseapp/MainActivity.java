package com.example.wj.exerciseapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private Toast toast;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    //Test 20161120
    public void buttonClick(View view) {
        String tmp = getString(R.string.MsgTest2);
        String tmp2 = getString(R.string.app_name);
        toast = Toast.makeText(this, test(tmp) + tmp2, Toast.LENGTH_SHORT);
        toast.show();
    }

    private String test(String str)
    {
        return "GG: " + str;
    }
}
