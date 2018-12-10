package com.siobcode.intencionpagweb;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    Button btnVerPagina;
    EditText edtDireccion;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnVerPagina = (Button) findViewById(R.id.btnVerPagina);
        edtDireccion = (EditText) findViewById(R.id.edtDireccion);

    }
        public void verview (View v){
            Intent i = new Intent(this, Main2Activity.class);
            i.putExtra("direccion", edtDireccion.getText().toString());
            startActivity(i);
        }

}
