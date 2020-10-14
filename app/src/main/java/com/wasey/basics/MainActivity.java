package com.wasey.basics;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//        makeCustomToastAppear();
    }

    private void makeCustomToastAppear(){
        LayoutInflater inflater = getLayoutInflater();
        View layout = inflater.inflate(R.layout.custom_toast, (ViewGroup) findViewById(R.id.custom_toast_container));

        TextView textView = (TextView) layout.findViewById(R.id.text);
        textView.setText("This is a custom toast");

        Toast toast = new Toast(getApplicationContext());
        toast.setGravity(Gravity.TOP|Gravity.LEFT, 0, 0);
        toast.setDuration(Toast.LENGTH_LONG);
        toast.setView(layout);
        toast.show();
    }
}