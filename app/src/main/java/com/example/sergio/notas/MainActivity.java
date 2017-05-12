/*
Copyright (C) 2017  sergio soriano

This program is free software: you can redistribute it and/or modify
it under the terms of the GNU General Public License as published by
the Free Software Foundation, either version 3 of the License, or
(at your option) any later version.

This program is distributed in the hope that it will be useful,
but WITHOUT ANY WARRANTY; without even the implied warranty of
MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
GNU General Public License for more details.

You should have received a copy of the GNU General Public License
along with this program.  If not, see <http://www.gnu.org/licenses/>

 */
package com.example.sergio.notas;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

import java.lang.reflect.Array;
import java.text.DecimalFormat;

public class MainActivity extends AppCompatActivity {

    private EditText n1;
    private EditText n2;
    private EditText n3;
    private EditText n4;
    private EditText e1;
    private EditText e2;
    private EditText e3;
    private EditText e4;
    private Button calcular;
    private Button btn_inf;

    private TextView  resultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        n1 =(EditText) findViewById(R.id.epr1);
        n2 =(EditText) findViewById(R.id.epe1);
        n3 =(EditText) findViewById(R.id.epr2);
        n4 =(EditText) findViewById(R.id.epe2);

        e1 =(EditText) findViewById(R.id.eva1);
        e2 =(EditText) findViewById(R.id.eva2);
        e3 =(EditText) findViewById(R.id.eva3);
        e4 =(EditText) findViewById(R.id.eva4);

        calcular = (Button) findViewById(R.id.boton_calcular);
        resultado = (TextView) findViewById(R.id.id_resultado);

        btn_inf = (Button) findViewById(R.id.btn_informacion);
        //calcular.setEnabled(false);

        n1.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View v, boolean hasFocus) {

                if(!n1.getText().toString().equals("")){
                    int nota1 = Integer.parseInt(n1.getText().toString());
                    if(nota1 > 70){
                        n1.setError("la nota no puede superar 70");
                        //calcular.setEnabled(false);
                        n1.setText("");
                    }else if(nota1 < 10 && nota1 > 0 && nota1 !=8 && nota1 !=9){
                        n1.setText(String.valueOf(nota1*10));
                    }else if(nota1 == 0 || nota1 ==8 || nota1 ==9){
                        n1.setText("");
                        n1.setError("valor invalido");
                    }

                }
            }
        });

        n2.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View v, boolean hasFocus) {

                if(!n2.getText().toString().equals("")){
                    int nota2 = Integer.parseInt(n2.getText().toString());
                    if(nota2 > 70){
                        n2.setError("la nota no puede superar 70");
                        //calcular.setEnabled(false);
                        n2.setText("");
                    }else if(nota2 < 10 && nota2 > 0 && nota2 !=8 && nota2 !=9){
                        n2.setText(String.valueOf(nota2*10));
                    }else if(nota2 == 0 || nota2 ==8 || nota2 ==9){

                        n2.setError("valor invalido");
                    }
                }
            }
        });

        n3.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View v, boolean hasFocus) {

                if(!n3.getText().toString().equals("")){
                    int nota3 = Integer.parseInt(n3.getText().toString());
                    if(nota3 > 70){
                        n3.setError("la nota no puede superar 70");
                        //calcular.setEnabled(false);
                        n3.setText("");
                    }else if(nota3 < 10 && nota3 > 0 && nota3 !=8 && nota3 !=9){
                        n3.setText(String.valueOf(nota3*10));
                    }else if(nota3 == 0 || nota3 ==8 || nota3 ==9){

                        n3.setError("valor invalido");
                    }

                }
            }
        });

        n4.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View v, boolean hasFocus) {

                if(!n4.getText().toString().equals("")){
                    int nota4 = Integer.parseInt(n4.getText().toString());
                    if(nota4 > 70){
                        n4.setError("la nota no puede superar 70");
                        //calcular.setEnabled(false);
                        n4.setText("");
                    }else if(nota4 < 10 && nota4 > 0 && nota4 !=8 && nota4 !=9){
                        n4.setText(String.valueOf(nota4*10));
                    }else if(nota4 == 0 || nota4 ==8 || nota4 ==9){

                        n4.setError("valor invalido");
                    }
                }
            }
        });

        e1.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View v, boolean hasFocus) {

                if(!e1.getText().toString().equals("")){
                    int ee1 = Integer.parseInt(e1.getText().toString());
                    if(ee1 > 70){
                        e1.setError("la nota no puede superar 70");
                        //calcular.setEnabled(false);
                        e1.setText("");
                    }else if(ee1 < 10 && ee1 > 0 && ee1 !=8 && ee1 !=9){
                        e1.setText(String.valueOf(ee1*10));
                    }else if(ee1 == 0 || ee1 ==8 || ee1 ==9){

                        e1.setError("valor invalido");
                    }
                }
            }
        });

        e2.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View v, boolean hasFocus) {

                if(!e2.getText().toString().equals("")){
                    int ee2 = Integer.parseInt(e2.getText().toString());
                    if(ee2 > 70){
                        e2.setError("la nota no puede superar 70");
                        //calcular.setEnabled(false);
                        e2.setText("");
                    }else if(ee2 < 10 && ee2 > 0 && ee2 !=8 && ee2 !=9){
                        e2.setText(String.valueOf(ee2*10));
                    }else if(ee2 == 0 || ee2 ==8 || ee2 ==9){

                        e2.setError("valor invalido");
                    }
                }
            }
        });

        e3.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View v, boolean hasFocus) {

                if(!e3.getText().toString().equals("")){
                    int ee3 = Integer.parseInt(e3.getText().toString());
                    if(ee3 > 70){
                        e3.setError("la nota no puede superar 70");
                        //calcular.setEnabled(false);
                        e3.setText("");
                    }else if(ee3 < 10 && ee3 > 0 && ee3 !=8 && ee3 !=9){
                        e3.setText(String.valueOf(ee3*10));
                    }else if(ee3 == 0 || ee3 ==8 || ee3 ==9){

                        e3.setError("valor invalido");
                    }
                }
            }
        });

        e4.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View v, boolean hasFocus) {

                if(!e4.getText().toString().equals("")){
                    int ee4 = Integer.parseInt(e4.getText().toString());
                    if(ee4 > 70){
                        e4.setError("la nota no puede superar 70");
                        //calcular.setEnabled(false);
                        e4.setText("");
                    }else if(ee4 < 10 && ee4 > 0 && ee4 !=8 && ee4 !=9){
                        e4.setText(String.valueOf(ee4*10));
                    }else if(ee4 == 0 || ee4 ==8 || ee4 ==9){

                        e4.setError("valor invalido");
                    }
                }
            }
        });

        btn_inf.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this,SecondActivity.class));
            }
        });

    }


    public void calcular(View v){
            if(!n1.getText().toString().equals("") && !n2.getText().toString().equals("") &&
                    !n3.getText().toString().equals("") && !n4.getText().toString().equals("") &&
                    !e1.getText().toString().equals("") && !e2.getText().toString().equals("") &&
                    !e3.getText().toString().equals("") && !e4.getText().toString().equals("")){

                double notepr1 = 10*(0.10*Integer.valueOf(n1.getText().toString()))/100;
                double notepe1 = 15*(0.10*Integer.valueOf(n2.getText().toString()))/100;
                double notepr2 = 20*(0.10*Integer.valueOf(n3.getText().toString()))/100;
                double notepe2 = 25*(0.10*Integer.valueOf(n4.getText().toString()))/100;
                double evas = 30*(0.10*((Integer.valueOf(e1.getText().toString())+Integer.valueOf(e2.getText().toString())+
                        Integer.valueOf(e3.getText().toString())+Integer.valueOf(e4.getText().toString()))/4))/100;

                double suma = notepr1+notepe1+notepr2+notepe2+evas;
                suma = Math.round(suma*Math.pow(10,2))/Math.pow(10,2);

                resultado.setText(String.valueOf("Nota final: "+suma));
                Toast.makeText(getApplicationContext(), String.valueOf(suma), Toast.LENGTH_LONG).show();
            }else{
                resultado.setText("complete los campos faltantes para realizar el calculo");
            }

    }
}
