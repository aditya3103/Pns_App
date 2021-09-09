package com.example.pns;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;

public class gamma_distr extends AppCompatActivity {

    String jsonStr = "{\n" +
            "    \"Sheet1\": [\n" +
            "        {\n" +
            "            \"1\": \"0.632\",\n" +
            "            \"2\": \"0.264\",\n" +
            "            \"3\": \"0.08\",\n" +
            "            \"4\": \"0.019\",\n" +
            "            \"5\": \"0.004\",\n" +
            "            \"6\": \"0.001\",\n" +
            "            \"7\": \"0\",\n" +
            "            \"8\": \"0\",\n" +
            "            \"9\": \"0\",\n" +
            "            \"10\": \"0\",\n" +
            "            \"undefined\": \"1\"\n" +
            "        },\n" +
            "        {\n" +
            "            \"1\": \"0.865\",\n" +
            "            \"2\": \"0.594\",\n" +
            "            \"3\": \"0.323\",\n" +
            "            \"4\": \"0.143\",\n" +
            "            \"5\": \"0.053\",\n" +
            "            \"6\": \"0.017\",\n" +
            "            \"7\": \"0.005\",\n" +
            "            \"8\": \"0.001\",\n" +
            "            \"9\": \"0\",\n" +
            "            \"10\": \"0\",\n" +
            "            \"undefined\": \"2\"\n" +
            "        },\n" +
            "        {\n" +
            "            \"1\": \"0.95\",\n" +
            "            \"2\": \"0.801\",\n" +
            "            \"3\": \"0.577\",\n" +
            "            \"4\": \"0.353\",\n" +
            "            \"5\": \"0.185\",\n" +
            "            \"6\": \"0.084\",\n" +
            "            \"7\": \"0.034\",\n" +
            "            \"8\": \"0.012\",\n" +
            "            \"9\": \"0.004\",\n" +
            "            \"10\": \"0.001\",\n" +
            "            \"undefined\": \"3\"\n" +
            "        },\n" +
            "        {\n" +
            "            \"1\": \"0.982\",\n" +
            "            \"2\": \"0.908\",\n" +
            "            \"3\": \"0.762\",\n" +
            "            \"4\": \"0.567\",\n" +
            "            \"5\": \"0.371\",\n" +
            "            \"6\": \"0.215\",\n" +
            "            \"7\": \"0.111\",\n" +
            "            \"8\": \"0.051\",\n" +
            "            \"9\": \"0.021\",\n" +
            "            \"10\": \"0.008\",\n" +
            "            \"undefined\": \"4\"\n" +
            "        },\n" +
            "        {\n" +
            "            \"1\": \"0.993\",\n" +
            "            \"2\": \"0.96\",\n" +
            "            \"3\": \"0.875\",\n" +
            "            \"4\": \"0.735\",\n" +
            "            \"5\": \"0.56\",\n" +
            "            \"6\": \"0.384\",\n" +
            "            \"7\": \"0.238\",\n" +
            "            \"8\": \"0.133\",\n" +
            "            \"9\": \"0.068\",\n" +
            "            \"10\": \"0.032\",\n" +
            "            \"undefined\": \"5\"\n" +
            "        },\n" +
            "        {\n" +
            "            \"1\": \"0.998\",\n" +
            "            \"2\": \"0.983\",\n" +
            "            \"3\": \"0.938\",\n" +
            "            \"4\": \"0.849\",\n" +
            "            \"5\": \"0.715\",\n" +
            "            \"6\": \"0.554\",\n" +
            "            \"7\": \"0.394\",\n" +
            "            \"8\": \"0.256\",\n" +
            "            \"9\": \"0.153\",\n" +
            "            \"10\": \"0.084\",\n" +
            "            \"undefined\": \"6\"\n" +
            "        },\n" +
            "        {\n" +
            "            \"1\": \"0.999\",\n" +
            "            \"2\": \"0.993\",\n" +
            "            \"3\": \"0.97\",\n" +
            "            \"4\": \"0.918\",\n" +
            "            \"5\": \"0.827\",\n" +
            "            \"6\": \"0.699\",\n" +
            "            \"7\": \"0.55\",\n" +
            "            \"8\": \"0.401\",\n" +
            "            \"9\": \"0.271\",\n" +
            "            \"10\": \"0.17\",\n" +
            "            \"undefined\": \"7\"\n" +
            "        },\n" +
            "        {\n" +
            "            \"1\": \"1\",\n" +
            "            \"2\": \"0.997\",\n" +
            "            \"3\": \"0.986\",\n" +
            "            \"4\": \"0.958\",\n" +
            "            \"5\": \"0.9\",\n" +
            "            \"6\": \"0.809\",\n" +
            "            \"7\": \"0.687\",\n" +
            "            \"8\": \"0.547\",\n" +
            "            \"9\": \"0.407\",\n" +
            "            \"10\": \"0.283\",\n" +
            "            \"undefined\": \"8\"\n" +
            "        },\n" +
            "        {\n" +
            "            \"2\": \"0.999\",\n" +
            "            \"3\": \"0.994\",\n" +
            "            \"4\": \"0.979\",\n" +
            "            \"5\": \"0.945\",\n" +
            "            \"6\": \"0.884\",\n" +
            "            \"7\": \"0.793\",\n" +
            "            \"8\": \"0.676\",\n" +
            "            \"9\": \"0.544\",\n" +
            "            \"10\": \"0.413\",\n" +
            "            \"undefined\": \"9\"\n" +
            "        },\n" +
            "        {\n" +
            "            \"2\": \"1\",\n" +
            "            \"3\": \"0.997\",\n" +
            "            \"4\": \"0.99\",\n" +
            "            \"5\": \"0.971\",\n" +
            "            \"6\": \"0.933\",\n" +
            "            \"7\": \"0.87\",\n" +
            "            \"8\": \"0.78\",\n" +
            "            \"9\": \"0.667\",\n" +
            "            \"10\": \"0.542\",\n" +
            "            \"undefined\": \"10\"\n" +
            "        },\n" +
            "        {\n" +
            "            \"3\": \"0.999\",\n" +
            "            \"4\": \"0.995\",\n" +
            "            \"5\": \"0.985\",\n" +
            "            \"6\": \"0.962\",\n" +
            "            \"7\": \"0.921\",\n" +
            "            \"8\": \"0.857\",\n" +
            "            \"9\": \"0.768\",\n" +
            "            \"10\": \"0.659\",\n" +
            "            \"undefined\": \"11\"\n" +
            "        },\n" +
            "        {\n" +
            "            \"3\": \"1\",\n" +
            "            \"4\": \"0.998\",\n" +
            "            \"5\": \"0.992\",\n" +
            "            \"6\": \"0.98\",\n" +
            "            \"7\": \"0.954\",\n" +
            "            \"8\": \"0.911\",\n" +
            "            \"9\": \"0.845\",\n" +
            "            \"10\": \"0.758\",\n" +
            "            \"undefined\": \"12\"\n" +
            "        },\n" +
            "        {\n" +
            "            \"4\": \"0.999\",\n" +
            "            \"5\": \"0.996\",\n" +
            "            \"6\": \"0.989\",\n" +
            "            \"7\": \"0.974\",\n" +
            "            \"8\": \"0.946\",\n" +
            "            \"9\": \"0.9\",\n" +
            "            \"10\": \"0.834\",\n" +
            "            \"undefined\": \"13\"\n" +
            "        },\n" +
            "        {\n" +
            "            \"4\": \"1\",\n" +
            "            \"5\": \"0.998\",\n" +
            "            \"6\": \"0.994\",\n" +
            "            \"7\": \"0.986\",\n" +
            "            \"8\": \"0.968\",\n" +
            "            \"9\": \"0.938\",\n" +
            "            \"10\": \"0.891\",\n" +
            "            \"undefined\": \"14\"\n" +
            "        },\n" +
            "        {\n" +
            "            \"5\": \"0.999\",\n" +
            "            \"6\": \"0.997\",\n" +
            "            \"7\": \"0.992\",\n" +
            "            \"8\": \"0.982\",\n" +
            "            \"9\": \"0.963\",\n" +
            "            \"10\": \"0.93\",\n" +
            "            \"undefined\": \"15\"\n" +
            "        }\n" +
            "    ]\n" +
            "}";

    ArrayList<String> gammaArray = new ArrayList<>();


ArrayList<String> xArr = new ArrayList<>();
ArrayList<String> alpArr = new ArrayList<>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gamma_distr);

        AutoCompleteTextView xedit = findViewById(R.id.xedit);
        AutoCompleteTextView alphaedit = findViewById(R.id.alphaedit);
        TextView ans = findViewById(R.id.finalAns);

        for (int i=1; i<=15; ++i){
            if(i<=10){
                alpArr.add(String.valueOf(i));
            }
            xArr.add(String.valueOf(i));
        }



        try {
            JSONObject jsonObject = new JSONObject(jsonStr);
            JSONArray jsonArray = jsonObject.getJSONArray("Sheet1");


            for (int i = 0; i < jsonArray.length(); ++i) {
                for (int j = 1; j <= 10; ++j) {
                    try {
                        String ansStr = jsonArray.getJSONObject(i).getString(String.valueOf(j));
                        gammaArray.add(ansStr);
                    } catch (Exception e) {
                        //okay
                    }
                }
            }

        } catch (JSONException e) {


        }

        AutoCompleteTextView autoCompleteTextView1 = findViewById(R.id.autoCompleteTextView2);
        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, gammaArray);
        autoCompleteTextView1.setAdapter(arrayAdapter);
        autoCompleteTextView1.setThreshold(2);

        ans.setText("N/A");
        Log.i("Size", String.valueOf(gammaArray.size()));

        ArrayAdapter<String> xAdap = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, xArr);
        ArrayAdapter<String> alpAdap = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, alpArr);

        xedit.setAdapter(xAdap);
        alphaedit.setAdapter(alpAdap);

        xedit.setThreshold(0);
        alphaedit.setThreshold(0);

    }

    public void gofunc(View view){

        Button gammaDirect = findViewById(R.id.go);

        InputMethodManager imm = (InputMethodManager)getSystemService(Context.INPUT_METHOD_SERVICE);
        imm.hideSoftInputFromWindow(gammaDirect.getWindowToken(), InputMethodManager.RESULT_UNCHANGED_SHOWN);
        table();
    }

    public void table(){
        try{
            AutoCompleteTextView xedit = findViewById(R.id.xedit);
            AutoCompleteTextView alphaedit = findViewById(R.id.alphaedit);
            TextView ans = findViewById(R.id.finalAns);



        int xval = Integer.parseInt(xedit.getText().toString());
        int alpval = Integer.parseInt(alphaedit.getText().toString());

        JSONObject jsonObject = new JSONObject(jsonStr);
        JSONArray jsonArray = jsonObject.getJSONArray("Sheet1");
        String ansStr = jsonArray.getJSONObject(xval - 1).getString(String.valueOf(alpval));
        ans.setText(ansStr);

    } catch (Exception e){
            EditText xedit = findViewById(R.id.xedit);
            EditText alphaedit = findViewById(R.id.alphaedit);
            TextView ans = findViewById(R.id.finalAns);

            ans.setText(xedit.getText().toString());
            ans.setText("N/A");
        }


    }


    public void  inverse(View view){

        Button gammaInverse = findViewById(R.id.button3);

        InputMethodManager imm = (InputMethodManager)getSystemService(Context.INPUT_METHOD_SERVICE);
        imm.hideSoftInputFromWindow(gammaInverse.getWindowToken(), InputMethodManager.RESULT_UNCHANGED_SHOWN);

        AutoCompleteTextView autoCompleteTextView = findViewById(R.id.autoCompleteTextView2);
        String search = autoCompleteTextView.getText().toString();

        boolean didFind= false;

        try {
            JSONObject jsonObject = new JSONObject(jsonStr);
            JSONArray jsonArray = jsonObject.getJSONArray("Sheet1");
            TextView finalAns = findViewById(R.id.finalAns);


            for (int i = 0; i < jsonArray.length(); ++i) {
                for (int j = 1; j <= 10; ++j) {
                    try {
                        String ansStr = jsonArray.getJSONObject(i).getString(String.valueOf(j));
                        if(search.equals(ansStr)){

                            finalAns.setText("X= "+String.valueOf(i+1)+"\nα= "+String.valueOf(j));
                            didFind=true;
                            break;
                        }
                    } catch (Exception e) {
                        finalAns.setText("N/A :(");
                        e.printStackTrace();
                    }
                }
                if(didFind)
                    break;
            }

        } catch (JSONException e) {


        }



    }
}