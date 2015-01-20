package com.example.elec490.fitnesstracker;

import com.example.elec490.fitnesstracker.R;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;


public class StartFragment extends Fragment{
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_start, container, false);

        final Button startButton = (Button) rootView.findViewById(R.id.start);
        startButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent StartWorkout = new Intent(getActivity(), monitorVitalSigns.class);
                if (StartWorkout != null)
                    startActivity(StartWorkout);
            }
        });

        return rootView;
    }
}
