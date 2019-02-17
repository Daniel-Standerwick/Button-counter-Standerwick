package com.example.button_counter_standerwick;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    private LinearLayout thisLayout;
    private int count;
    private TextView counterDisplay;
    private Button plusOne;
    private Button subtractOne;
    private Button reset;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        thisLayout = (LinearLayout) findViewById (R.id.mainLayout);
        counterDisplay = (TextView) findViewById (R.id.Count);
        plusOne = (Button) findViewById (R.id.plus);
        subtractOne = (Button) findViewById (R.id.minus);
        reset = (Button) findViewById (R.id.reset);

        plusOne.setOnClickListener (new View.OnClickListener ( ) {
            @Override
            public void onClick(View v) {
                count++;
                counterDisplay.setText (Integer.toString (count));
            }
        });

        subtractOne.setOnClickListener (new View.OnClickListener ( ) {
            @Override
            public void onClick(View v) {
                count--;
                counterDisplay.setText (Integer.toString (count));
            }
        });

        reset.setOnClickListener (new View.OnClickListener ( ) {
            @Override
            public void onClick(View v) {
                count = 0;
                counterDisplay.setText (Integer.toString (count));
            }
        });


    }
}
