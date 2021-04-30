//  Nama   : Fatahillah Satria Bima Seno
//  NIM    : 10118039
//  Kelas  : IF-1
//  Tanggal Pengerjaan : 30 April 2021
//  Pembuatan activity Login

package com.fathsbs.bloodshare;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class LoginActivity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
    }

    public void pindahRegis(View view){
        Intent intent = new Intent(this,RegisterActivity.class);
        startActivity(intent);
    }
}
