package com.example.pm01firmadigital;

import androidx.appcompat.app.AppCompatActivity;

import android.content.ContentValues;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.pm01firmadigital.Transacciones.Transacciones;

import java.io.ByteArrayInputStream;
import java.sql.Blob;

public class MainActivity extends AppCompatActivity {
    EditText Descripcion;
    Firma firma;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button btnGuardar = (Button) findViewById(R.id.btnguardar);
        Firma firma =(Firma)findViewById(R.id.firma);
        Descripcion = (EditText) findViewById(R.id.Descripcion);


        Button btnlista = (Button) findViewById(R.id.btnlista);
        btnlista.setOnClickListener(new View.OnClickListener() {


            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), ActivityListaFirmas.class);
                startActivity(intent);
            }
        });


        btnGuardar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                guardarImagen();
            }

        });




    }

    private void guardarImagen()
    {
        SQLiteConexion conexion = new SQLiteConexion(this, Transacciones.NameDataBase, null, 1);
        SQLiteDatabase db = conexion.getWritableDatabase();
        ContentValues valores = new ContentValues();
        valores.put(Transacciones.Descripcion, Descripcion.getText().toString());



    }


}