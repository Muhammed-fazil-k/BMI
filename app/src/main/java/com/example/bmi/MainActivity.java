package com.example.bmi;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText height,weight;
    TextView bmi;
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        height=findViewById(R.id.height);
        weight=findViewById(R.id.weight);
        button=findViewById(R.id.button);
        bmi=findViewById(R.id.bmi);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String h=height.getText().toString();
                String w=weight.getText().toString();
                if(h.isEmpty()||w.isEmpty()){
                    height.setError("Enter Something");
                    weight.setError("Enter Something");
                }
                else if(Integer.parseInt(h)==0){
                    height.setError("Enter non zero height");
                }
                else{
                    float he=Float.parseFloat(h);
                    float we=Float.parseFloat(w);
                    /*int he=Integer.parseInt(h);
                    int we=Integer.parseInt(w);*/
                    float bm=we/(he*he);
                    bmi.setText(Float.toString(bm));



                }
            }
        });

    }
}