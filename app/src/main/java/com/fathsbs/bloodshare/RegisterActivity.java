//  Nama   : Fatahillah Satria Bima Seno
//  NIM    : 10118039
//  Kelas  : IF-1
//  Tanggal Pengerjaan : 30 April 2021
//  Pembuatan activity Register

package com.fathsbs.bloodshare;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class RegisterActivity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        Spinner goldarSpinner = (Spinner) findViewById(R.id.regis_golonganDarah);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(RegisterActivity.this, android.R.layout.simple_spinner_dropdown_item, getResources().getStringArray(R.array.golongan_darah));
        goldarSpinner.setAdapter(adapter);

        Spinner reshusSpinner = (Spinner) findViewById(R.id.regis_reshus);
        ArrayAdapter<String> adapter2 = new ArrayAdapter<String>(RegisterActivity.this, android.R.layout.simple_spinner_dropdown_item, getResources().getStringArray(R.array.reshus_darah));
        reshusSpinner.setAdapter(adapter2);

        Spinner pekerjaanSpinner = (Spinner) findViewById(R.id.regis_pekerjaan);
        ArrayAdapter<String> adapter3 = new ArrayAdapter<String>(RegisterActivity.this, android.R.layout.simple_spinner_dropdown_item, getResources().getStringArray(R.array.pekerjaan));
        pekerjaanSpinner.setAdapter(adapter3);
    }

    public void pindahAlmost(View view){
        Intent intent = new Intent(this,AlmostActivity.class);
        startActivity(intent);
    }

    public void pindahLogin(View view){
        Intent intent = new Intent(this,LoginActivity.class);
        startActivity(intent);
    }
}
