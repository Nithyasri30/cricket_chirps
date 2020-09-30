package com.example.cricket;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.example.cricket.R;

import java.text.DecimalFormat;

public class MainActivity extends AppCompatActivity{
    EditText etChirps;
    Button btnCalculate;
    TextView tvResults;
    DecimalFormat formatter;
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        etChirps=findViewById(R.id.ett);
        btnCalculate=findViewById(R.id.btt);
        tvResults=findViewById(R.id.tvr);
        tvResults.setVisibility(View.GONE);


        formatter = new DecimalFormat("#0.0");
        btnCalculate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                                    int chirps=Integer.parseInt(etChirps.getText().toString().trim());
                    double temp=(chirps/3.0)+4;
                    String results="The Temperature is "+ formatter.format(temp) ;
                    tvResults.setText(results);

                    tvResults.setVisibility(View.VISIBLE);
                }
        });
    }

}