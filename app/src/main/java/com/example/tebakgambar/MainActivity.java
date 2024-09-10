package com.example.tebakgambar;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    ImageView imageView_eskrim, imageView_mieayam, imageView_nasigoreng, imageView_nasikuning, imageView_sate, imageView_soto;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        newInitiate();
        onTebakGambar();

    }

    private void newInitiate() {
        imageView_eskrim = (ImageView) findViewById(R.id.imageView_eskrim);
        imageView_mieayam = (ImageView) findViewById(R.id.imageView_mieayam);
        imageView_nasigoreng = (ImageView) findViewById(R.id.imageView_nasigoreng);
        imageView_nasikuning = (ImageView) findViewById(R.id.imageView_nasikuning);
        imageView_sate = (ImageView) findViewById(R.id.imageView_sate);

        imageView_soto = (ImageView) findViewById(R.id.imageView_soto);
    }

    ;

    private void onTebakGambar() {
        imageView_eskrim.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent eskrim = new Intent(MainActivity.this, InputForm.class);
                eskrim.putExtra("nama", "eskrim");
                startActivity(eskrim);
            }
        });

        imageView_mieayam.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent makanan = new Intent(MainActivity.this, InputForm.class);
                makanan.putExtra("nama", "mieayam");
                startActivity(makanan);
            }
        });

        imageView_nasigoreng.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent makanan = new Intent(MainActivity.this, InputForm.class);
                makanan.putExtra("nama", "nasigoreng");
                startActivity(makanan);
            }
        });

        imageView_nasikuning.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent dribbble = new Intent(MainActivity.this, InputForm.class);
                dribbble.putExtra("nama", "nasikuning");
                startActivity(dribbble);
            }
        });

        imageView_sate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent makanan = new Intent(MainActivity.this, InputForm.class);
                makanan.putExtra("nama", "sate");
                startActivity(makanan);
            }
        });

        imageView_soto.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent makanan = new Intent(MainActivity.this, InputForm.class);
                makanan.putExtra("nama", "soto");
                startActivity(makanan);
            }
        });

    }
}