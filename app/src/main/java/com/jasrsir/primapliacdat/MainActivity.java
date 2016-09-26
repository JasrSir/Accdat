package com.jasrsir.primapliacdat;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Date;

/**
 * @author Juan Antonio Suarez
 * @version 1.0
 * Primera app con Acceso a Datos.
 */

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    //Tenemos que referenciar los métodos y objetos...
    //Creamos los objetos
    Button boton;
    TextView texto;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        boton = (Button) findViewById(R.id.button);
        texto = (TextView) findViewById(R.id.textView);
        boton.setOnClickListener(this);
        actualizar();

    }

    private void actualizar() {
        texto.setText(new Date().toString());
    }
    //Prueba de que funciona git hub 13.32
    @Override
    public void onClick(View v) {
        if (v == boton)
            actualizar();
    }
}
