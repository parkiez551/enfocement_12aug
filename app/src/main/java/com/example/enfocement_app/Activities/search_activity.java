package com.example.enfocement_app.Activities;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.example.enfocement_app.R;
public class search_activity extends AppCompatActivity {
    private TextView search_tv;
    private EditText vehicle_no_et;
    private Button search_bt1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search);
        DeclareVariable();
    }
    private void DeclareVariable() {
        search_tv = (TextView) findViewById(R.id.search_tv);
        vehicle_no_et = (EditText) findViewById(R.id.search_vehicle);
        search_bt1=(Button)  findViewById(R.id.search_bt1);

search_bt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(search_activity.this, Transaction_mode_activity.class);
                startActivity(i);
                finish();
            }
        });
    }
    public void onBackPressed() {
        super.onBackPressed();

        Intent i = new Intent(getApplicationContext(), Menu.class);

        startActivity(i);

    }


}

