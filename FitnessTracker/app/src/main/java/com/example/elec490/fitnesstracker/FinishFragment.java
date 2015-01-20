package com.example.elec490.fitnesstracker;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

public class FinishFragment extends Fragment {
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_finish, container, false);

        final Button finishButton = (Button) rootView.findViewById(R.id.finish);
        finishButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent StartWorkout = new Intent(getActivity(), monitorVitalSigns.class);
                startActivity(StartWorkout);
            }
        });


        return rootView;
    }

}
