package com.example.mad_assignment9_a1;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText num1 = findViewById(R.id.num1);
        EditText num2 = findViewById(R.id.num2);
        Button wData = findViewById(R.id.wData);
        Button rData = findViewById(R.id.rData);
        TextView tv = findViewById(R.id.textView);

        wData.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                double n1 = Double.parseDouble(num1.getText().toString());
                double n2 = Double.parseDouble(num2.getText().toString());
                System.out.printf(String.valueOf(n1),"\n",n2);


                if (n1 != 0 || n2 != 0) {
                    if (writeData(n1, n2)){
                        tv.setText("Data edit to file");
                    }
                    else{
                        tv.setText("Error found while writing into file.");
                    }
                } else {
                    tv.setText("Value missing in 1 or 2");
                }

            }
        });

        rData.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String data=readData();

                tv.setText(data);
            }
        });
    }

    public boolean writeData(double number1, double number2){
        boolean status=true;
        try{
            String folder = getApplicationContext().getExternalFilesDir(null).getAbsolutePath()+File.separator;
            FileWriter myFile1= new FileWriter(folder+"measuredsignal.txt",true);
            myFile1.write(String.valueOf(number1));
            myFile1.write("\n");
            myFile1.close();

            FileWriter myFile2=new FileWriter(folder+"desiredsignal.txt",true);
            myFile2.write(String.valueOf(number2));
            myFile2.write("\n");
            myFile2.close();

        } catch (IOException e) {
            status=false;
            e.printStackTrace();
        }
        return status;
    }

    public String readData(){

        StringBuilder result= new StringBuilder();
        try{
            String folder = getApplicationContext().getExternalFilesDir(null).getAbsolutePath()+File.separator;
            File myFile1= new File(folder+"measuredsignal.txt");
            Scanner file=new Scanner(myFile1);
            while(file.hasNextLine()){
                result.append(file.nextLine().trim());
                result.append(" ");
            }
            result.append("|");

            File myFile2= new File(folder+"desiredsignal.txt");
            Scanner file2=new Scanner(myFile2);

            while(file2.hasNextLine()){
                result.append(file2.nextLine().trim());
                result.append(" ");
            }


        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        String[] data =result.toString().split("\\|",0);
        String[] f1=data[0].split(" ",0);
        System.out.println(Arrays.toString(f1));
        String[] f2=data[1].trim().split(" ",0);
        StringBuilder res=new StringBuilder();

        for (int i=0;i<f1.length;i++){
            double val1=Double.parseDouble(f1[i]);
            double val2=Double.parseDouble(f2[i]);
            double  ab = Math.abs(val1-val2);
            res.append(f1[i]).append(" ").append(f2[i]).append(" ").append(Math.round(ab*100.0)/100.0).append("\n");
        }

        return res.toString();
    }

}