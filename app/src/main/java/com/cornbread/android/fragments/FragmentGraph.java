package com.cornbread.android.fragments;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.github.mikephil.charting.charts.BarChart;
import com.github.mikephil.charting.data.BarData;
import com.github.mikephil.charting.data.BarDataSet;
import com.github.mikephil.charting.data.BarEntry;

import java.util.ArrayList;

public class FragmentGraph extends Fragment{
    int sides = 6; //You will receive this from other fragment
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        //View view = inflater.inflate(R.layout.fragment_graph, container, false);

        ArrayList<BarEntry> entries = new ArrayList<>();
        entries.add(new BarEntry(4f, 0));
        entries.add(new BarEntry(8f, 1));
        entries.add(new BarEntry(6f, 2));
        entries.add(new BarEntry(12f, 3));
        entries.add(new BarEntry(18f, 4));
        entries.add(new BarEntry(9f, 5));

        BarDataSet dataset = new BarDataSet(entries, "Hits");

        ArrayList<String> labels = new ArrayList<String>();
        for (int x = 1; x <= sides; x++){
            labels.add(Integer.toString(x));
        }


        BarChart chart = new BarChart(getActivity());
        BarData data = new BarData(labels, dataset);
        chart.setData(data);
        chart.getLegend().setEnabled(false);
        chart.setDescription("");

        return chart;
    }

    public void prepareData(){

    }
}
