package com.example.enfocement_app.Activities;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.enfocement_app.R;
public class Menu extends AppCompatActivity {
    private Button create_case_bt,search_bt;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
        DeclareVariables();
        create_case_bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Menu.this,create_case_activity.class);
                startActivity(i);
                finish();
            }
        });
        search_bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Menu.this,search_activity.class);
                startActivity(i);
                finish();
            }
        });
    }
    private void DeclareVariables() {
       create_case_bt = (Button) findViewById(R.id.create_case_bt);
        search_bt = (Button) findViewById(R.id.search_bt);
    }
}