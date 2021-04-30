//  Nama   : Fatahillah Satria Bima Seno
//  NIM    : 10118039
//  Kelas  : IF-1
//  Tanggal Pengerjaan : 30 April 2021
//  Keterangan : Pembuatan activity almost there

package com.fathsbs.bloodshare;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class AlmostActivity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_almost_there);
    }

    public void pindahVerify(View view){
        Intent intent = new Intent(this,VerifyActivity.class);
        startActivity(intent);
    }
}
