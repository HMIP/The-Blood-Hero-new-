package com.example.mybloodhero1;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class Centre extends AppCompatActivity {
    private String selectedStates, selectedHospitals;
    private TextView tvstateSpinner, tvhospitalSpinner;
    private Spinner stateSpinner, hospitalSpinner;
    private ArrayAdapter<CharSequence> hospitalAdapter;
    TextView tvHospital;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_centre);

        Button btnBookAppointment;
        btnBookAppointment = findViewById(R.id.button_appointment);
        tvstateSpinner = findViewById(R.id.textview_state);
        tvhospitalSpinner = findViewById(R.id.textview_hospital);
        stateSpinner = findViewById(R.id.state);
        ArrayAdapter<CharSequence> stateAdapter = ArrayAdapter.createFromResource(this, R.array.state, R.layout.spinner_layout);
        stateAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        stateSpinner.setAdapter(stateAdapter);


        btnBookAppointment.setOnClickListener(v -> {
            if (selectedStates.equals("Select Your State")) {
                Toast.makeText(Centre.this, "Please select your state from this list",
                        Toast.LENGTH_SHORT).show();
                tvstateSpinner.setError("State is required!");
                tvstateSpinner.requestFocus();
            } else if (selectedHospitals.equals("Select Hospital")) {
                Toast.makeText(Centre.this, "Please select hospital from this list",
                        Toast.LENGTH_SHORT).show();
                tvhospitalSpinner.setError("Hospital is required!");
                tvhospitalSpinner.requestFocus();
                tvstateSpinner.setError(null);
            } else {
                tvstateSpinner.setError(null);
                tvhospitalSpinner.setError(null);
                Toast.makeText(Centre.this, "Selected State: " + selectedStates +
                        "\nSelected Hospital: " + selectedHospitals, Toast.LENGTH_SHORT).show();
                Intent intent_appointment = new Intent(Centre.this, Appointment.class);
                startActivity(intent_appointment);
            }
        });

        stateSpinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                hospitalSpinner = findViewById(R.id.hospital);

                selectedStates = stateSpinner.getSelectedItem().toString();

                int parentID = parent.getId();
                if (parentID == R.id.state) {
                    switch (selectedStates) {
                        case "Select Your State":
                            hospitalAdapter = ArrayAdapter.createFromResource(parent.getContext(),
                                    R.array.hospital_default, R.layout.spinner_layout);
                            break;
                        case "Johor":
                            hospitalAdapter = ArrayAdapter.createFromResource(parent.getContext(),
                                    R.array.hospital_jb, R.layout.spinner_layout);
                            break;
                        case "Kedah":
                            hospitalAdapter = ArrayAdapter.createFromResource(parent.getContext(),
                                    R.array.hospital_kedah, R.layout.spinner_layout);
                            break;
                        case "Kelantan":
                            hospitalAdapter = ArrayAdapter.createFromResource(parent.getContext(),
                                    R.array.hospital_kelantan, R.layout.spinner_layout);
                            break;
                        case "Malacca":
                            hospitalAdapter = ArrayAdapter.createFromResource(parent.getContext(),
                                    R.array.hospital_malacca, R.layout.spinner_layout);
                            break;
                        case "Negeri Sembilan":
                            hospitalAdapter = ArrayAdapter.createFromResource(parent.getContext(),
                                    R.array.hospital_n9, R.layout.spinner_layout);
                            break;
                        case "Pahang":
                            hospitalAdapter = ArrayAdapter.createFromResource(parent.getContext(),
                                    R.array.hospital_pahang, R.layout.spinner_layout);
                            break;
                        case "Penang":
                            hospitalAdapter = ArrayAdapter.createFromResource(parent.getContext(),
                                    R.array.hospital_penang, R.layout.spinner_layout);
                            break;
                        case "Perak":
                            hospitalAdapter = ArrayAdapter.createFromResource(parent.getContext(),
                                    R.array.hospital_perak, R.layout.spinner_layout);
                            break;
                        case "Perlis":
                            hospitalAdapter = ArrayAdapter.createFromResource(parent.getContext(),
                                    R.array.hospital_perlis, R.layout.spinner_layout);
                            break;
                        case "Sabah":
                            hospitalAdapter = ArrayAdapter.createFromResource(parent.getContext(),
                                    R.array.hospital_sabah, R.layout.spinner_layout);
                            break;
                        case "Sarawak":
                            hospitalAdapter = ArrayAdapter.createFromResource(parent.getContext(),
                                    R.array.hospital_sarawak, R.layout.spinner_layout);
                            break;
                        case "Selangor":
                            hospitalAdapter = ArrayAdapter.createFromResource(parent.getContext(),
                                    R.array.hospital_selangor, R.layout.spinner_layout);
                            break;
                        case "Terengganu":
                            hospitalAdapter = ArrayAdapter.createFromResource(parent.getContext(),
                                    R.array.hospital_terengganu, R.layout.spinner_layout);
                            break;
                        default:
                            break;
                    }

                    hospitalAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                    hospitalSpinner.setAdapter(hospitalAdapter);

                    hospitalSpinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                        @Override
                        public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                            selectedHospitals = hospitalSpinner.getSelectedItem().toString();
                        }

                        @Override
                        public void onNothingSelected(AdapterView<?> parent) {
                        }
                    });
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
            }
        });
    }

    public void openLocation(View view) {
        Intent intent_location = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com/maps/search/blood+donation+center+in+malaysua/@2.0842849,100.5778939,7z/data=!3m1!4b1"));
        startActivity(intent_location);
    }
}