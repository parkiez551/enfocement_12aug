package com.example.enfocement_app.Activities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.RadioGroup;

import com.example.enfocement_app.R;

public class Transaction_mode_activity extends AppCompatActivity {
    private RadioGroup radioGroup;
    Button submit_bt, clear;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_transaction);
        // Bind the components to their respective objects
        // by assigning their IDs
        // with the help of findViewById() method
        submit_bt = (Button)findViewById(R.id.submit_bt);
        radioGroup = (RadioGroup)findViewById(R.id.groupradio);
        // Uncheck or reset the radio buttons initially
        radioGroup.clearCheck();
        // Add the Listener to the RadioGroup
    /*    radioGroup.setOnCheckedChangeListener(
                new RadioGroup
                        .OnCheckedChangeListener() {
                    @Override

                    // The flow will come here when
                    // any of the radio buttons in the radioGroup
                    // has been clicked

                    // Check which radio button has been clicked
                    public void onCheckedChanged(RadioGroup group,
                                                 int checkedId)
                    {

                        // Get the selected Radio Button
                        RadioButton
                                radioButton
                                = (RadioButton)group
                                .findViewById(checkedId);
                    }
                });

        // Add the Listener to the Submit Button
        submit_bt.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v)
            {

                // When submit button is clicked,
                // Ge the Radio Button which is set
                // If no Radio Button is set, -1 will be returned
                int selectedId = radioGroup.getCheckedRadioButtonId();
                if (selectedId == -1) {
                    Toast.makeText(Transaction_mode_activity.this,
                            "No answer has been selected",
                            Toast.LENGTH_SHORT)
                            .show();
                }
                else {

                    RadioButton radioButton
                            = (RadioButton)radioGroup
                            .findViewById(selectedId);

                    // Now display the value of selected item
                    // by the Toast message
                    Toast.makeText(Transaction_mode_activity.this,
                            radioButton.getText(),
                            Toast.LENGTH_SHORT)
                            .show();
                }
            }
        });*/


    }
    public void onBackPressed() {
        super.onBackPressed();

        Intent i = new Intent(getApplicationContext(), search_activity.class);

        startActivity(i);

    }
}