package com.example.brunoschalch.mensposit;

import android.content.Context;
import android.graphics.Color;
import android.support.constraint.ConstraintLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    TextView mensaje;
    ConstraintLayout bglay;
    String[] frases = {"La confianza en uno mismo es el mejor aliado para alcanzar el éxito.",
            "Solo hay un lugar en el cual alcanzar un objetivo es imposible: tu mente.",
            "Si nunca te has tropezado, es que necesitas arriesgar un poco más.",
            "Para sentirte mejor, empieza a ser quien te gustaría ser.",
    "Soy optimista porque de nada sirve ser lo contrario.",
    "Ama la vida que tienes para poder vivir la vida que amas.",
    "Déjate de excusas y cambia tu actitud.",
    "Mira el sol y se acabará la oscuridad.",
    "De lo único que te tienes que preocupar es de vivir al máximo.",
    "Acepta los contratiempos y afróntalos con tu mejor arma.",
    "Cualquier noche termina con un precioso amanecer.",
    "Mira el sol y se acabará la oscuridad.",
            "Si crees en positivo, tus pensamientos crearán una realidad positiva."
    };

    private int currentPos=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mensaje = findViewById(R.id.mitexto);
        bglay = findViewById(R.id.mainbg);


        findViewById(R.id.button).setOnClickListener(this);
        findViewById(R.id.dia).setOnClickListener(this);
        findViewById(R.id.noche).setOnClickListener(this);
        findViewById(R.id.izq).setOnClickListener(this);
        findViewById(R.id.der).setOnClickListener(this);
        findViewById(R.id.gotopos).setOnClickListener(this);

        mensaje.setText(getRandomMessage());

    }

    @Override
    public void onClick(View view) {

        if (view.getId()==R.id.button) {

            mensaje.setText(getRandomMessage());

        } else if (view.getId()==R.id.dia) {
            bglay.setBackgroundColor(Color.parseColor("#f49242"));
        } else if (view.getId()==R.id.noche) {
            bglay.setBackgroundColor(Color.parseColor("#0043a3"));
        } else if (view.getId()==R.id.izq) {
           setMensajeLeft();
        } else if (view.getId()==R.id.der) {
            setMensajeRight();
        } else if (view.getId()==R.id.gotopos) {
            EditText edittext = findViewById(R.id.editText);
            int pos = Integer.parseInt(edittext.getText().toString());
            goToPos(pos);
        }

    }

    private String getRandomMessage() {
        Random rnd = new Random();
        int rand = rnd.nextInt(frases.length);
        currentPos = rand;
        return frases[rand];
    }

    private void setMensajeLeft(){
        if (currentPos-1<0) {
            currentPos = frases.length-1;
        } else {
            currentPos = (currentPos-1)%frases.length;
        }
        mensaje.setText(frases[currentPos]);
    }

    private void setMensajeRight(){
        currentPos = (currentPos+1)%frases.length;
        mensaje.setText(frases[currentPos]);
    }

    private void goToPos(int pos) {
        if (pos<0 || pos>frases.length) {
            Toast.makeText(this, "Nope", Toast.LENGTH_LONG).show();
            return;
        }
        mensaje.setText(frases[pos]);
    }

}
