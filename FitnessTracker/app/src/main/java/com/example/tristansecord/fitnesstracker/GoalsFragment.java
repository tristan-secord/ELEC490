package com.example.tristansecord.fitnesstracker;

import com.example.tristansecord.fitnesstracker.R;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;

public class GoalsFragment extends Fragment{
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_goals, container, false);

        String[] goalNames = new String[] {"Running", "Weight Lifting", "Heart Rate"};
        ListView goals = (ListView)rootView.findViewById(R.id.listView);
        goals.setAdapter(new ListviewGoalAdapter(getActivity(), goalNames));

        goals.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position,
                                    long id) {
                String entry= (String) parent.getAdapter().getItem(position);
                Intent intent = new Intent(GoalsFragment.this, EditGoals.class);
                //String message = entry.getMessage();
                //intent.putExtra(EXTRA_MESSAGE, message);
                startActivity(intent);
            }
        });
        return rootView;
    }
}
