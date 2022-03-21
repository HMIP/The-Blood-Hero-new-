package com.example.mybloodhero1;

import androidx.fragment.app.DialogFragment;
import android.app.DatePickerDialog;
import android.app.Dialog;
import android.os.Bundle;
import androidx.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.DatePicker;
import java.util.Calendar;

public class choice_dt extends DialogFragment
        implements DatePickerDialog.OnDateSetListener {
    @Override
    public void onDateSet(DatePicker datePicker, int yeardt, int monthdt, int daydt) {
        Appointment dt = (Appointment) getActivity();
        dt.choice_dtResult(yeardt, monthdt, daydt);

    }

    @NonNull
    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {
        final Calendar c = Calendar.getInstance();
        int yeardt = c.get(Calendar.YEAR);
        int monthdt = c.get(Calendar.MONTH);
        int daydt = c.get(Calendar.DAY_OF_MONTH);

// Create a new instance of DatePickerDialog and return it.
        return new DatePickerDialog(getActivity(), this, yeardt, monthdt, daydt);
    }
}