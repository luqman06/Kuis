package com.example.kuissederhanadaribadoystudio;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    AlertDialog.Builder builder;
    RadioGroup radioGroup;

    //deklarasi


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //rdg inisialisassi
        radioGroup = (RadioGroup) findViewById(R.id.radioGroup);
    }

    //memilih radio button
    public void onRadioButton(View view){
        Boolean checked = ((RadioButton) view).isChecked();

        switch (view.getId()){
            case R.id.radioButton:
                if (checked)
                    tampilDialog();
                break;

            case R.id.radioButton2:
                if (checked)
                    jawabanSalah();
                break;

            case R.id.radioButton3:
                if (checked)
                    jawabanSalah();
                break;

            case R.id.radioButton4:
                if (checked)
                    jawabanSalah();
                break;
        }
    }

    //menampil data dialog

    public void tampilDialog(){
        builder = new AlertDialog.Builder(this);
        builder.setCancelable(false);
        builder.setTitle("Selamat!!!!!");
        builder.setMessage("Jawaban kamu benar : Go MARIED");
        builder.setPositiveButton("OKE", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                Toast.makeText(MainActivity.this, "SELAMET", Toast.LENGTH_SHORT).show();
            }
        });

        builder.setNegativeButton("ULANGI", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                radioGroup.clearCheck();
            }
        });
        builder.create().show();
    }

    //menampilakna jawabn salah
    public void jawabanSalah(){
        Toast.makeText(this, "Jawaban mu salah belum beruntung", Toast.LENGTH_SHORT).show();
    }
}
