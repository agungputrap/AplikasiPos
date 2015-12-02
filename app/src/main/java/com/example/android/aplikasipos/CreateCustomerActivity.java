package com.example.android.aplikasipos;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class CreateCustomerActivity extends AppCompatActivity {
    EditText fname, lname, email, group, sa_jalan, sa_kota, sa_provinsi, sa_kodepos, sa_negara, ba_jalan, ba_kota, ba_provinsi, ba_kodepos, ba_negara ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_customer);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        fname = (EditText) findViewById(R.id.editText);
        lname = (EditText) findViewById(R.id.editText2);
        email = (EditText) findViewById(R.id.editText3);
        group = (EditText) findViewById(R.id.editText4);
        sa_jalan = (EditText) findViewById(R.id.editText5);
        sa_kota = (EditText) findViewById(R.id.editText6);
        sa_provinsi = (EditText) findViewById(R.id.editText7);
        sa_kodepos = (EditText) findViewById(R.id.editText8);
        sa_negara = (EditText) findViewById(R.id.editText9);
        ba_jalan = (EditText) findViewById(R.id.editText10);
        ba_kota = (EditText) findViewById(R.id.editText11);
        ba_provinsi = (EditText) findViewById(R.id.editText12);
        ba_kodepos = (EditText) findViewById(R.id.editText13);
        ba_negara = (EditText) findViewById(R.id.editText14);

    }

    public void saveCustomer(View view) {
        String customer_fname = fname.getText().toString();
        String customer_lname = lname.getText().toString();
        String customer_email = email.getText().toString();
        String customer_group = group.getText().toString();

        String customer_sajalan = sa_jalan.getText().toString();
        String customer_sakota = sa_kota.getText().toString();
        String customer_saprovinsi = sa_provinsi.getText().toString();
        int customer_sakodepos = Integer.parseInt(sa_kodepos.getText().toString());
        String customer_sanegara = sa_negara.getText().toString();

        String customer_bajalan = ba_jalan.getText().toString();
        String customer_bakota = ba_kota.getText().toString();
        String customer_baprovinsi = ba_provinsi.getText().toString();
        int customer_bakodepos = Integer.parseInt(ba_kodepos.getText().toString());
        String customer_banegara = ba_negara.getText().toString();

        //buat class
        Customer customer = new Customer(customer_fname, customer_lname, customer_email, customer_group, customer_sajalan, customer_sakota, customer_saprovinsi, customer_sakodepos, customer_sanegara, customer_bajalan, customer_bakota, customer_baprovinsi, customer_bakodepos, customer_banegara);
        customer.save();
        Toast.makeText(getApplicationContext(), "customer saved", Toast.LENGTH_LONG).show();
    }

}
