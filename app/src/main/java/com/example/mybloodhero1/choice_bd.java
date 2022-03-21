package com.example.mybloodhero1;

import androidx.fragment.app.DialogFragment;
import android.app.DatePickerDialog;
import android.app.Dialog;
import android.os.Bundle;
import android.widget.DatePicker;
import android.widget.EditText;
import java.util.Calendar;
import androidx.annotation.NonNull;

public class choice_bd extends DialogFragment
        implements DatePickerDialog.OnDateSetListener {

    @Override
    public void onDateSet(DatePicker datePicker, int year, int month, int day) {
        Appointment bd = (Appointment) getActivity();
        assert bd != null;
        bd.choice_bdResult(year, month, day);

    }

    @NonNull
    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {
        final Calendar c = Calendar.getInstance();
        int year = c.get(Calendar.YEAR);
        int month = c.get(Calendar.MONTH);
        int day = c.get(Calendar.DAY_OF_MONTH);

        // Create a new instance of DatePickerDialog and return it.
        return new DatePickerDialog(getActivity(), this, year, month, day);
    }
}
