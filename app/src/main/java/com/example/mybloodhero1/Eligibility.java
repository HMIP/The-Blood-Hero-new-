package com.example.mybloodhero1;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.CheckBox;

public class Eligibility extends AppCompatActivity {
    CheckBox cb1, cb2, cb3, cb4, cb5, cb6, cb7, cb8;
    Button btnReset, btnDone, btnBack;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_eligibility);

        cb1 = findViewById(R.id.cb1);
        cb2 = findViewById(R.id.cb2);
        cb3 = findViewById(R.id.cb3);
        cb4 = findViewById(R.id.cb4);
        cb5 = findViewById(R.id.cb5);
        cb6 = findViewById(R.id.cb6);
        cb7 = findViewById(R.id.cb7);
        cb8 = findViewById(R.id.cb8);
        btnReset = findViewById(R.id.btnReset);
        btnDone = findViewById(R.id.btnDone);
        btnDone.setOnClickListener(v -> {
            StringBuilder result = new StringBuilder();
            if (cb1.isChecked() && cb2.isChecked() && cb3.isChecked() &&
                    cb4.isChecked() && cb5.isChecked() && cb6.isChecked() &&
                    cb7.isChecked() && cb8.isChecked()){
                result.append("You are suitable for blood donation!");
                Message.message(Eligibility.this, result.toString());
                Intent intent_centre = new Intent(Eligibility.this, Centre.class);
                startActivity(intent_centre);
            } else {
                result.append("You are not suitable for blood donation!");
                Message.message(Eligibility.this, result.toString());
            }
        });

        btnReset.setOnClickListener(v -> {
            if (cb1.isChecked())
                cb1.setChecked(false);
            if (cb2.isChecked())
                cb2.setChecked(false);
            if (cb3.isChecked())
                cb3.setChecked(false);
            if (cb4.isChecked())
                cb4.setChecked(false);
            if (cb5.isChecked())
                cb5.setChecked(false);
            if (cb6.isChecked())
                cb6.setChecked(false);
            if (cb7.isChecked())
                cb7.setChecked(false);
            if (cb8.isChecked())
                cb8.setChecked(false);
        });
    }
}