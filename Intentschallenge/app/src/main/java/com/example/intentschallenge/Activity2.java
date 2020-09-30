package com.example.intentschallenge;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

public class Activity2 extends AppCompatActivity {

    EditText et1,et2,et3,et4;
    ImageView iv1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);
        et1=findViewById(R.id.et1);
        et2=findViewById(R.id.et2);
        et3=findViewById(R.id.et3);
        et4=findViewById(R.id.et4);
        iv1=findViewById(R.id.iv1);
        iv1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(et1.getText().toString().isEmpty()|| et2.getText() == null || et3.getText() == null || et4.getText() == null)
                {
                    Toast.makeText(getApplicationContext(),"Please fill all fileds",Toast.LENGTH_SHORT).show();
                }
                else{
                    Intent intent = new Intent();
                    String phno=et2.getText().toString();
                    String gweb=et3.getText().toString();
                    String gmap=et4.getText().toString();
                    intent.putExtra("phno",phno);
                    intent.putExtra("gweb",gweb);
                    intent.putExtra("gmap",gmap);
                    setResult(RESULT_OK,intent);
                    Activity2.this.finish();
                }
            }
        });
    }
}
