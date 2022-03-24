package com.example.pruebadb;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.android.volley.Request;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;

public class MainActivity extends AppCompatActivity {

    EditText edtNombre,edtPass,edtEdad,edtCorreo,edtSexo,edtAltura,edtPeso;
    Button btnAgregar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edtNombre=(EditText)findViewById(R.id.edtNombre);
        edtPass=(EditText)findViewById(R.id.edtPass);
        edtEdad=(EditText)findViewById(R.id.edtEdad);
        edtCorreo=(EditText)findViewById(R.id.edtCorreo);
        edtSexo=(EditText)findViewById(R.id.edtSexo);
        edtAltura=(EditText)findViewById(R.id.edtAltura);
        edtPeso=(EditText)findViewById(R.id.edtPeso);
        btnAgregar=(Button)findViewById(R.id.btnAgregar);

        btnAgregar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

    }

    private void ejecutarServicio(String URL) {
        StringRequest stringRequest=new StringRequest(Request.Method.POST, URL, new Response.Listener<String>() {
            @Override
            public void onResponse(String response) {
                Toast.makeText(getApplicationContext(), );
            }
        }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {

            }
        });
    }
}