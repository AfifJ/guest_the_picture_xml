package com.example.tebakgambar;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.Locale;

public class InputForm extends AppCompatActivity {
    ImageView imageView_tebak;
    EditText answerInput;
    Button button_cek;

    String jawaban;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_input_form);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        newInitiate();
        intentCheck();
        onTebak();
    }
    private void newInitiate() {
        imageView_tebak = (ImageView)findViewById(R.id.imageView_tebak);
        answerInput = (EditText)findViewById(R.id.editText_jawab);
        button_cek = (Button)findViewById(R.id.buttonCek);
    }

    private void intentCheck() {
        Intent cek = getIntent();
        String nama = cek.getStringExtra("nama");

        assert nama != null;
        switch (nama.toLowerCase(Locale.ROOT)) {
            case "eskrim":
                imageView_tebak.setImageResource(R.drawable.eskrim);
                jawaban = "es krim";
                break;
            case "nasigoreng":
                imageView_tebak.setImageResource(R.drawable.nasigoreng);
                jawaban = "nasi goreng";
                break;
            case "mieayam":
                imageView_tebak.setImageResource(R.drawable.mieayam);
                jawaban = "mie ayam";
                break;
            case "nasikuning":
                imageView_tebak.setImageResource(R.drawable.nasikuning);
                jawaban = "nasi kuning";
                break;
            case "sate":
                imageView_tebak.setImageResource(R.drawable.sate);
                jawaban = "sate";
                break;
            case "soto":
                imageView_tebak.setImageResource(R.drawable.soto);
                jawaban = "soto";
                break;
            default:
                imageView_tebak.setImageResource(R.drawable.ic_launcher_foreground);
                jawaban = "Terjadi kesalahan";
                break;
        }

    }

    private void onTebak() {
        button_cek.setOnClickListener(view -> {
            if (answerInput.getText().toString().toLowerCase(Locale.ROOT).equals(jawaban)){
                Toast.makeText(InputForm.this,"Benar!",Toast.LENGTH_SHORT).show();
            } else {
                Toast.makeText(InputForm.this,"Salah!",Toast.LENGTH_SHORT).show();
            }
        });
    }
}