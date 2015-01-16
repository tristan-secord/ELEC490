package com.example.tristansecord.fitnesstracker;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

/**
 * Created by Tristan Secord on 10/01/2015.
 */
public class ListviewGoalAdapter extends BaseAdapter{
private static String[] listGoals;

    private LayoutInflater mInflater;

    public ListviewGoalAdapter(Context GoalsFragment, String[] results){
        listGoals = results;
        mInflater = LayoutInflater.from(GoalsFragment);
    }

    @Override
    public int getCount() {
        // TODO Auto-generated method stub
        return listGoals.length;
    }

    @Override
    public Object getItem(int arg0) {
        // TODO Auto-generated method stub
        return listGoals[0];
    }

    @Override
    public long getItemId(int arg0) {
        // TODO Auto-generated method stub
        return arg0;
    }


    public View getView(int position, View convertView, ViewGroup parent) {
        // TODO Auto-generated method stub
        ViewHolder holder;
        if(convertView == null){
            convertView = mInflater.inflate(R.layout.goal_item, null);
            holder = new ViewHolder();
            holder.txtname = (TextView) convertView.findViewById(R.id.textView1);

            convertView.setTag(holder);
        } else {
            holder = (ViewHolder) convertView.getTag();
        }

        holder.txtname.setText(listGoals[position]);

        return convertView;
    }

    static class ViewHolder{
        TextView txtname;
    }
}
