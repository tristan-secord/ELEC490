package com.example.elec490.fitnesstracker;

import com.example.elec490.fitnesstracker.R;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.graphics.Color;
import android.os.Handler;
import android.app.Activity;

import com.jjoe64.graphview.*;
import com.jjoe64.graphview.GraphView.*;
import com.jjoe64.graphview.GraphViewSeries.GraphViewSeriesStyle;
import com.jjoe64.graphview.GraphView.GraphViewData;
import com.jjoe64.graphview.LineGraphView.*;

public class ProgressFragment extends Fragment{
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_progress, container, false);

        GraphViewSeries exampleSeries = new GraphViewSeries("", new GraphViewSeriesStyle(Color.BLACK, 3), new GraphViewData[] {
                new GraphViewData(1, 2.0d)
                , new GraphViewData(2, 1.5d)
                , new GraphViewData(3, 2.5d)
                , new GraphViewData(4, 1.0d)
        });

        GraphView graphView = new LineGraphView(
                container.getContext() // context
                , "Progress" // heading
        );

        graphView.setHorizontalLabels(new String[] {"2 days ago", "yesterday", "today", "tomorrow"});
        graphView.setVerticalLabels(new String[] {"high", "middle", "low"});

        graphView.getGraphViewStyle().setGridColor(Color.WHITE);
        graphView.getGraphViewStyle().setHorizontalLabelsColor(Color.YELLOW);
        graphView.getGraphViewStyle().setVerticalLabelsColor(Color.YELLOW);
        graphView.getGraphViewStyle().setNumHorizontalLabels(10);
        graphView.getGraphViewStyle().setNumVerticalLabels(4);
        graphView.getGraphViewStyle().setVerticalLabelsWidth(100);

        graphView.addSeries(exampleSeries); // data


        LinearLayout Progress = (LinearLayout) rootView.findViewById(R.id.Progress);
        Progress.addView(graphView);


        return rootView;
    }


}
