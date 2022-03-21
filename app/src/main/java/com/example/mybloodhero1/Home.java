package com.example.mybloodhero1;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Home extends AppCompatActivity {
    Button centreButton;
    Button eligibilityButton;
    Button listButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        centreButton = findViewById(R.id.button_centre);
        centreButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent_centre = new Intent(Home.this, Centre.class);
                startActivity(intent_centre);
            }
        });

        eligibilityButton = findViewById(R.id.button_eligibility);
        eligibilityButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent_eligibility = new Intent(Home.this, Eligibility.class);
                startActivity(intent_eligibility);
            }
        });

        listButton = findViewById(R.id.button_list);
        listButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent_list = new Intent(Home.this, ToDoList.class);
                startActivity(intent_list);
            }
        });
    }
}