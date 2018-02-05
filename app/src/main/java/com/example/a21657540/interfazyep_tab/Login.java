package com.example.a21657540.interfazyep_tab;

import android.content.Intent;
import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Login extends AppCompatActivity {

    TextView miSignUp;
    TextView titulo;
    TextView subtitulo;
    TextView noCuenta;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        miSignUp = findViewById(R.id.idDont);
        titulo = findViewById(R.id.idTitulo);
        subtitulo = findViewById(R.id.idSubtitulo);
        noCuenta = findViewById(R.id.idDont);

        Typeface fuenteTitulo = Typeface.createFromAsset(getAssets(), "RifficFree-Bold.ttf");
        titulo.setTypeface(fuenteTitulo);
        titulo.setTextSize(76);

        Typeface fuenteSubtitulo = Typeface.createFromAsset(getAssets(), "MODERNA_.TTF");
        subtitulo.setTypeface(fuenteSubtitulo);
        subtitulo.setTextSize(26);

        Typeface fuenteRegistro = Typeface.createFromAsset(getAssets(), "CaviarDreams.ttf");
        noCuenta.setTypeface(fuenteRegistro);
        noCuenta.setTextSize(20);
    }

    public void next(View v){
        Intent intent = new Intent(this, Signup.class);
        startActivity(intent);
    }

}
