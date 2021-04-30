//  Nama   : Fatahillah Satria Bima Seno
//  NIM    : 10118039
//  Kelas  : IF-1
//  Tanggal Pengerjaan : 30 April 2021
//  Pembuatan activity verify

package com.fathsbs.bloodshare;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class VerifyActivity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_verify);
    }

    public void pindahHome(View view){
        Intent intent = new Intent(this,HomeActivity.class);
        startActivity(intent);
    }
}
