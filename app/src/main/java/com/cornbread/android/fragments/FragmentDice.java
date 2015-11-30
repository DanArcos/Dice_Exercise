package com.cornbread.android.fragments;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import java.util.Random;

public class FragmentDice extends Fragment {
    Random rand = new Random(); //For number generator
    int sides = 6; //Select number of sides
    Button mButtonDiceRoll;
    Button mButtonClear;
    TextView mTextViewRollResult;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_dice, container, false);

        mButtonDiceRoll = (Button)view.findViewById(R.id.button_diceRoll);
        mButtonDiceRoll.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Toast.makeText(getActivity(), Integer.toString(rollDie()), Toast.LENGTH_SHORT).show();
                processRoll(rollD(sides));
            }
        });

        mButtonClear = (Button)view.findViewById(R.id.button_clearAll);
        mButtonClear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                clearResults();
            }
        });

        mTextViewRollResult = (TextView)view.findViewById(R.id.textView_rollResult);
        return view;
    }

    public int rollD(int sides){
        //1 is minimum and 6 is the maximum
        return rand.nextInt(sides)+1;
    }

    //FUNCTIONS RELATING TO UPDATING ARE BELOW

    public void updateTextView(int result){
        mTextViewRollResult.setText(Integer.toString(result));
    }

    public void processRoll(int roll){

        //AddResultToList()

        //Plot add new result to plot

        //Update Text View
        updateTextView(roll);
    }

    //FUNCTIONS RELATING TO CLEARING ARE BELOW

    public void clearTextView(){
        mTextViewRollResult.setText("");
    }

    public void clearResults(){

        //Prompt - ARE YOU SURE YOU WANT TO CLEAR?

        //ClearData()

        //ClearGraph()

        //Set TextView to blank
        clearTextView();

    }
}
