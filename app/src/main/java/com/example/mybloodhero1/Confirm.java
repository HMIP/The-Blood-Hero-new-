package com.example.mybloodhero1;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Confirm extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_confirm);

        ActionBar actionBar = getSupportActionBar();
        assert actionBar != null;
        actionBar.setTitle("Confirm");

        Intent intent = getIntent();
        String name = intent.getStringExtra("Name");
        String icNo = intent.getStringExtra("IC");
        String hpNo = intent.getStringExtra("Phone No");
        String appointmentDate = intent.getStringExtra("Appointment Date");
        String appointmentTime = intent.getStringExtra("Appointment Time");

        TextView tvName = findViewById(R.id.Cet_name);
        tvName.setText(name);
        TextView tvICNo = findViewById(R.id.Cet_icno);
        tvICNo.setText(icNo);
        TextView tvHPNo = findViewById(R.id.Cet_phoneno);
        tvHPNo.setText(hpNo);
        TextView tvAppointmentDate = findViewById(R.id.Cet_date);
        tvAppointmentDate.setText(appointmentDate);
        TextView tvAppointmentTime = findViewById(R.id.Cet_time);
        tvAppointmentTime.setText(appointmentTime);
    }

    public void back_home(View view) {
        Intent home = new Intent(this, Home.class);
        startActivity(home);
    }
}