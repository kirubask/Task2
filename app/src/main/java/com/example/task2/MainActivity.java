package com.example.task2;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView tv;
    EditText ed1;
    EditText ed2;
    EditText ed3;
    EditText ed4;
    Button resultbut;
    String result="";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().hide();
        tv = findViewById(R.id.resultView);
        ed1 = findViewById(R.id.ed1);
        ed2 = findViewById(R.id.ed2);
        ed3 = findViewById(R.id.ed3);
        ed4 = findViewById(R.id.ed4);
        resultbut = findViewById(R.id.rsultButton);


        resultbut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int number1 = Integer.parseInt(ed1.getText().toString());
                int number2 = Integer.parseInt(ed2.getText().toString());
                int number3 = Integer.parseInt(ed3.getText().toString());
                int number4 = Integer.parseInt(ed4.getText().toString());
                int temp = 0;


                int[] arr = new int[4];
                arr[0] = number1;
                arr[1] = number2;
                arr[2] = number3;
                arr[3] = number4;
                for (int i = 0; i < arr.length; i++) {
                    for (int j = i + 1; j < arr.length; j++) {
                        if (arr[i] > arr[j]) {
                            temp = arr[i];
                            arr[i] = arr[j];
                            arr[j] = temp;
                        }
                    }
                }

                for (int i = 0; i < arr.length; i++) {
                    System.out.print(arr[i] + " ");
                    result= result+arr[i]+",";

                }


                tv.setText(result);

            }

        });


    }
}