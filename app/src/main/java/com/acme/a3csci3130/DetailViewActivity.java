package com.acme.a3csci3130;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class DetailViewActivity extends Activity {

    private EditText nameField, numberField, primaryField, provinceField, addressField;
    Contact receivedBusinessInfo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_view);
        receivedBusinessInfo = (Contact)getIntent().getSerializableExtra("Contact");

        numberField = (EditText) findViewById(R.id.number);
        nameField = (EditText) findViewById(R.id.name);
        primaryField= (EditText) findViewById(R.id.primary);
        addressField = (EditText) findViewById(R.id.address);
        provinceField= (EditText) findViewById(R.id.province);


        if(receivedBusinessInfo != null){
            numberField.setText(receivedBusinessInfo.number);
            nameField.setText(receivedBusinessInfo.name);
            primaryField.setText(receivedBusinessInfo.primary);
            addressField.setText(receivedBusinessInfo.address);
            provinceField.setText(receivedBusinessInfo.province);
        }
    }

    public void updateContact(View v){
        //TODO: Update contact funcionality

    }

    public void eraseContact(View v)
    {
        //TODO: Erase contact functionality
        String number = numberField.getText().toString();

    }
}
