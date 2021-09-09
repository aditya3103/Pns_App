package com.example.pns;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.w3c.dom.Text;

import java.util.ArrayList;
import java.util.Arrays;

public class BinomialDistribution extends AppCompatActivity{

    String jsonStr = "{\n" +
            "    \"Sheet1\": [\n" +
            "        {\n" +
            "            \"1\": \"0.368\",\n" +
            "            \"2\": \"0.135\",\n" +
            "            \"3\": \"0.05\",\n" +
            "            \"4\": \"0.018\",\n" +
            "            \"5\": \"0.007\",\n" +
            "            \"6\": \"0.002\",\n" +
            "            \"7\": \"0.001\",\n" +
            "            \"8\": \"0\",\n" +
            "            \"9\": \"0\",\n" +
            "            \"10\": \"0\",\n" +
            "            \"15\": \"0\",\n" +
            "            \"20\": \"0\",\n" +
            "            \"x\": \"0\",\n" +
            "            \"0.1\": \"0.905\",\n" +
            "            \"0.2\": \"0.819\",\n" +
            "            \"0.3\": \"0.741\",\n" +
            "            \"0.4\": \"0.67\",\n" +
            "            \"0.5\": \"0.607\",\n" +
            "            \"0.6\": \"0.549\",\n" +
            "            \"0.7\": \"0.497\",\n" +
            "            \"0.8\": \"0.449\",\n" +
            "            \"0.9\": \"0.407\"\n" +
            "        },\n" +
            "        {\n" +
            "            \"1\": \"0.736\",\n" +
            "            \"2\": \"0.406\",\n" +
            "            \"3\": \"0.199\",\n" +
            "            \"4\": \"0.092\",\n" +
            "            \"5\": \"0.04\",\n" +
            "            \"6\": \"0.017\",\n" +
            "            \"7\": \"0.007\",\n" +
            "            \"8\": \"0.003\",\n" +
            "            \"9\": \"0.001\",\n" +
            "            \"10\": \"0\",\n" +
            "            \"15\": \"0\",\n" +
            "            \"20\": \"0\",\n" +
            "            \"x\": \"1\",\n" +
            "            \"0.1\": \"0.995\",\n" +
            "            \"0.2\": \"0.982\",\n" +
            "            \"0.3\": \"0.963\",\n" +
            "            \"0.4\": \"0.938\",\n" +
            "            \"0.5\": \"0.91\",\n" +
            "            \"0.6\": \"0.878\",\n" +
            "            \"0.7\": \"0.844\",\n" +
            "            \"0.8\": \"0.809\",\n" +
            "            \"0.9\": \"0.772\"\n" +
            "        },\n" +
            "        {\n" +
            "            \"1\": \"0.92\",\n" +
            "            \"2\": \"0.677\",\n" +
            "            \"3\": \"0.423\",\n" +
            "            \"4\": \"0.238\",\n" +
            "            \"5\": \"0.125\",\n" +
            "            \"6\": \"0.062\",\n" +
            "            \"7\": \"0.03\",\n" +
            "            \"8\": \"0.014\",\n" +
            "            \"9\": \"0.006\",\n" +
            "            \"10\": \"0.003\",\n" +
            "            \"15\": \"0\",\n" +
            "            \"20\": \"0\",\n" +
            "            \"x\": \"2\",\n" +
            "            \"0.1\": \"1\",\n" +
            "            \"0.2\": \"0.999\",\n" +
            "            \"0.3\": \"0.996\",\n" +
            "            \"0.4\": \"0.992\",\n" +
            "            \"0.5\": \"0.986\",\n" +
            "            \"0.6\": \"0.977\",\n" +
            "            \"0.7\": \"0.966\",\n" +
            "            \"0.8\": \"0.953\",\n" +
            "            \"0.9\": \"0.937\"\n" +
            "        },\n" +
            "        {\n" +
            "            \"1\": \"0.981\",\n" +
            "            \"2\": \"0.857\",\n" +
            "            \"3\": \"0.647\",\n" +
            "            \"4\": \"0.433\",\n" +
            "            \"5\": \"0.265\",\n" +
            "            \"6\": \"0.151\",\n" +
            "            \"7\": \"0.082\",\n" +
            "            \"8\": \"0.042\",\n" +
            "            \"9\": \"0.021\",\n" +
            "            \"10\": \"0.01\",\n" +
            "            \"15\": \"0\",\n" +
            "            \"20\": \"0\",\n" +
            "            \"x\": \"3\",\n" +
            "            \"0.2\": \"1\",\n" +
            "            \"0.3\": \"1\",\n" +
            "            \"0.4\": \"0.999\",\n" +
            "            \"0.5\": \"0.998\",\n" +
            "            \"0.6\": \"0.997\",\n" +
            "            \"0.7\": \"0.994\",\n" +
            "            \"0.8\": \"0.991\",\n" +
            "            \"0.9\": \"0.987\"\n" +
            "        },\n" +
            "        {\n" +
            "            \"1\": \"0.996\",\n" +
            "            \"2\": \"0.947\",\n" +
            "            \"3\": \"0.815\",\n" +
            "            \"4\": \"0.629\",\n" +
            "            \"5\": \"0.44\",\n" +
            "            \"6\": \"0.285\",\n" +
            "            \"7\": \"0.173\",\n" +
            "            \"8\": \"0.1\",\n" +
            "            \"9\": \"0.055\",\n" +
            "            \"10\": \"0.029\",\n" +
            "            \"15\": \"0.001\",\n" +
            "            \"20\": \"0\",\n" +
            "            \"x\": \"4\",\n" +
            "            \"0.4\": \"1\",\n" +
            "            \"0.5\": \"1\",\n" +
            "            \"0.6\": \"1\",\n" +
            "            \"0.7\": \"0.999\",\n" +
            "            \"0.8\": \"0.999\",\n" +
            "            \"0.9\": \"0.998\"\n" +
            "        },\n" +
            "        {\n" +
            "            \"1\": \"0.999\",\n" +
            "            \"2\": \"0.983\",\n" +
            "            \"3\": \"0.916\",\n" +
            "            \"4\": \"0.785\",\n" +
            "            \"5\": \"0.616\",\n" +
            "            \"6\": \"0.446\",\n" +
            "            \"7\": \"0.301\",\n" +
            "            \"8\": \"0.191\",\n" +
            "            \"9\": \"0.116\",\n" +
            "            \"10\": \"0.067\",\n" +
            "            \"15\": \"0.003\",\n" +
            "            \"20\": \"0\",\n" +
            "            \"x\": \"5\",\n" +
            "            \"0.7\": \"1\",\n" +
            "            \"0.8\": \"1\",\n" +
            "            \"0.9\": \"1\"\n" +
            "        },\n" +
            "        {\n" +
            "            \"1\": \"1\",\n" +
            "            \"2\": \"0.995\",\n" +
            "            \"3\": \"0.966\",\n" +
            "            \"4\": \"0.889\",\n" +
            "            \"5\": \"0.762\",\n" +
            "            \"6\": \"0.606\",\n" +
            "            \"7\": \"0.45\",\n" +
            "            \"8\": \"0.313\",\n" +
            "            \"9\": \"0.207\",\n" +
            "            \"10\": \"0.13\",\n" +
            "            \"15\": \"0.008\",\n" +
            "            \"20\": \"0\",\n" +
            "            \"x\": \"6\"\n" +
            "        },\n" +
            "        {\n" +
            "            \"2\": \"0.999\",\n" +
            "            \"3\": \"0.988\",\n" +
            "            \"4\": \"0.949\",\n" +
            "            \"5\": \"0.867\",\n" +
            "            \"6\": \"0.744\",\n" +
            "            \"7\": \"0.599\",\n" +
            "            \"8\": \"0.453\",\n" +
            "            \"9\": \"0.324\",\n" +
            "            \"10\": \"0.22\",\n" +
            "            \"15\": \"0.018\",\n" +
            "            \"20\": \"0.001\",\n" +
            "            \"x\": \"7\"\n" +
            "        },\n" +
            "        {\n" +
            "            \"2\": \"1\",\n" +
            "            \"3\": \"0.996\",\n" +
            "            \"4\": \"0.979\",\n" +
            "            \"5\": \"0.932\",\n" +
            "            \"6\": \"0.847\",\n" +
            "            \"7\": \"0.729\",\n" +
            "            \"8\": \"0.593\",\n" +
            "            \"9\": \"0.456\",\n" +
            "            \"10\": \"0.333\",\n" +
            "            \"15\": \"0.037\",\n" +
            "            \"20\": \"0.002\",\n" +
            "            \"x\": \"8\"\n" +
            "        },\n" +
            "        {\n" +
            "            \"3\": \"0.999\",\n" +
            "            \"4\": \"0.992\",\n" +
            "            \"5\": \"0.968\",\n" +
            "            \"6\": \"0.916\",\n" +
            "            \"7\": \"0.83\",\n" +
            "            \"8\": \"0.717\",\n" +
            "            \"9\": \"0.587\",\n" +
            "            \"10\": \"0.458\",\n" +
            "            \"15\": \"0.07\",\n" +
            "            \"20\": \"0.005\",\n" +
            "            \"x\": \"9\"\n" +
            "        },\n" +
            "        {\n" +
            "            \"3\": \"1\",\n" +
            "            \"4\": \"0.997\",\n" +
            "            \"5\": \"0.986\",\n" +
            "            \"6\": \"0.957\",\n" +
            "            \"7\": \"0.901\",\n" +
            "            \"8\": \"0.816\",\n" +
            "            \"9\": \"0.706\",\n" +
            "            \"10\": \"0.583\",\n" +
            "            \"15\": \"0.118\",\n" +
            "            \"20\": \"0.011\",\n" +
            "            \"x\": \"10\"\n" +
            "        },\n" +
            "        {\n" +
            "            \"4\": \"0.999\",\n" +
            "            \"5\": \"0.995\",\n" +
            "            \"6\": \"0.98\",\n" +
            "            \"7\": \"0.947\",\n" +
            "            \"8\": \"0.888\",\n" +
            "            \"9\": \"0.803\",\n" +
            "            \"10\": \"0.697\",\n" +
            "            \"15\": \"0.185\",\n" +
            "            \"20\": \"0.021\",\n" +
            "            \"x\": \"11\"\n" +
            "        },\n" +
            "        {\n" +
            "            \"4\": \"1\",\n" +
            "            \"5\": \"0.998\",\n" +
            "            \"6\": \"0.991\",\n" +
            "            \"7\": \"0.973\",\n" +
            "            \"8\": \"0.936\",\n" +
            "            \"9\": \"0.876\",\n" +
            "            \"10\": \"0.792\",\n" +
            "            \"15\": \"0.268\",\n" +
            "            \"20\": \"0.039\",\n" +
            "            \"x\": \"12\"\n" +
            "        },\n" +
            "        {\n" +
            "            \"5\": \"0.999\",\n" +
            "            \"6\": \"0.996\",\n" +
            "            \"7\": \"0.987\",\n" +
            "            \"8\": \"0.966\",\n" +
            "            \"9\": \"0.926\",\n" +
            "            \"10\": \"0.864\",\n" +
            "            \"15\": \"0.363\",\n" +
            "            \"20\": \"0.066\",\n" +
            "            \"x\": \"13\"\n" +
            "        },\n" +
            "        {\n" +
            "            \"5\": \"1\",\n" +
            "            \"6\": \"0.999\",\n" +
            "            \"7\": \"0.994\",\n" +
            "            \"8\": \"0.983\",\n" +
            "            \"9\": \"0.959\",\n" +
            "            \"10\": \"0.917\",\n" +
            "            \"15\": \"0.466\",\n" +
            "            \"20\": \"0.105\",\n" +
            "            \"x\": \"14\"\n" +
            "        },\n" +
            "        {\n" +
            "            \"6\": \"0.999\",\n" +
            "            \"7\": \"0.998\",\n" +
            "            \"8\": \"0.992\",\n" +
            "            \"9\": \"0.978\",\n" +
            "            \"10\": \"0.951\",\n" +
            "            \"15\": \"0.568\",\n" +
            "            \"20\": \"0.157\",\n" +
            "            \"x\": \"15\"\n" +
            "        },\n" +
            "        {\n" +
            "            \"6\": \"1\",\n" +
            "            \"7\": \"0.999\",\n" +
            "            \"8\": \"0.996\",\n" +
            "            \"9\": \"0.989\",\n" +
            "            \"10\": \"0.973\",\n" +
            "            \"15\": \"0.664\",\n" +
            "            \"20\": \"0.221\",\n" +
            "            \"x\": \"16\"\n" +
            "        },\n" +
            "        {\n" +
            "            \"7\": \"1\",\n" +
            "            \"8\": \"0.998\",\n" +
            "            \"9\": \"0.995\",\n" +
            "            \"10\": \"0.986\",\n" +
            "            \"15\": \"0.749\",\n" +
            "            \"20\": \"0.297\",\n" +
            "            \"x\": \"17\"\n" +
            "        },\n" +
            "        {\n" +
            "            \"8\": \"0.999\",\n" +
            "            \"9\": \"0.998\",\n" +
            "            \"10\": \"0.993\",\n" +
            "            \"15\": \"0.819\",\n" +
            "            \"20\": \"0.381\",\n" +
            "            \"x\": \"18\"\n" +
            "        },\n" +
            "        {\n" +
            "            \"8\": \"1\",\n" +
            "            \"9\": \"0.999\",\n" +
            "            \"10\": \"0.997\",\n" +
            "            \"15\": \"0.875\",\n" +
            "            \"20\": \"0.47\",\n" +
            "            \"x\": \"19\"\n" +
            "        },\n" +
            "        {\n" +
            "            \"9\": \"1\",\n" +
            "            \"10\": \"0.998\",\n" +
            "            \"15\": \"0.917\",\n" +
            "            \"20\": \"0.559\",\n" +
            "            \"x\": \"20\"\n" +
            "        },\n" +
            "        {\n" +
            "            \"10\": \"0.999\",\n" +
            "            \"15\": \"0.947\",\n" +
            "            \"20\": \"0.644\",\n" +
            "            \"x\": \"21\"\n" +
            "        },\n" +
            "        {\n" +
            "            \"10\": \"1\",\n" +
            "            \"15\": \"0.967\",\n" +
            "            \"20\": \"0.721\",\n" +
            "            \"x\": \"22\"\n" +
            "        },\n" +
            "        {\n" +
            "            \"15\": \"0.981\",\n" +
            "            \"20\": \"0.787\",\n" +
            "            \"x\": \"23\"\n" +
            "        },\n" +
            "        {\n" +
            "            \"15\": \"0.989\",\n" +
            "            \"20\": \"0.843\",\n" +
            "            \"x\": \"24\"\n" +
            "        },\n" +
            "        {\n" +
            "            \"15\": \"0.994\",\n" +
            "            \"20\": \"0.888\",\n" +
            "            \"x\": \"25\"\n" +
            "        },\n" +
            "        {\n" +
            "            \"15\": \"0.997\",\n" +
            "            \"20\": \"0.922\",\n" +
            "            \"x\": \"26\"\n" +
            "        },\n" +
            "        {\n" +
            "            \"15\": \"0.998\",\n" +
            "            \"20\": \"0.948\",\n" +
            "            \"x\": \"27\"\n" +
            "        },\n" +
            "        {\n" +
            "            \"15\": \"0.999\",\n" +
            "            \"20\": \"0.966\",\n" +
            "            \"x\": \"28\"\n" +
            "        },\n" +
            "        {\n" +
            "            \"15\": \"1\",\n" +
            "            \"20\": \"0.978\",\n" +
            "            \"x\": \"29\"\n" +
            "        },\n" +
            "        {\n" +
            "            \"20\": \"0.987\",\n" +
            "            \"x\": \"30\"\n" +
            "        },\n" +
            "        {\n" +
            "            \"20\": \"0.992\",\n" +
            "            \"x\": \"31\"\n" +
            "        },\n" +
            "        {\n" +
            "            \"20\": \"0.995\",\n" +
            "            \"x\": \"32\"\n" +
            "        },\n" +
            "        {\n" +
            "            \"20\": \"0.997\",\n" +
            "            \"x\": \"33\"\n" +
            "        },\n" +
            "        {\n" +
            "            \"20\": \"0.999\",\n" +
            "            \"x\": \"34\"\n" +
            "        },\n" +
            "        {\n" +
            "            \"20\": \"0.999\",\n" +
            "            \"x\": \"35\"\n" +
            "        },\n" +
            "        {\n" +
            "            \"20\": \"1\",\n" +
            "            \"x\": \"36\"\n" +
            "        }\n" +
            "    ]\n" +
            "}";

    ArrayList<String> xval = new ArrayList<>();
    ArrayList<String> muVal = new ArrayList<>(Arrays.asList("0.1", "0.2" ,"0.3", "0.4", "0.5" ,"0.6", "0.7", "0.8", "0.9" ,"1",
            "2", "3" ,"4" ,"5" ,"6" ,"7" ,"8" ,"9" ,"10" ,"15" ,"20"));

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_binomial_distribution);

        try{
            JSONObject jsonObject = new JSONObject(jsonStr);
            JSONArray jsonArray = jsonObject.getJSONArray("Sheet1");


            for (int i=0; i<jsonArray.length(); ++i){
                xval.add(String.valueOf(i));
            }

            AutoCompleteTextView xauto = findViewById(R.id.xauto);
            AutoCompleteTextView muAuto = findViewById(R.id.muauto);

            ArrayAdapter<String> xAdap = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, xval);
            ArrayAdapter<String> muAdap = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, muVal);

            xauto.setAdapter(xAdap);
            muAuto.setAdapter(muAdap);

            xauto.setThreshold(1);
            muAuto.setThreshold(1);

            Log.i("Info", jsonArray.getJSONObject(Integer.parseInt("5")-1).getString("4.0"));

        } catch (Exception e) {
            Log.i("Status", "Didnt enter");
            e.printStackTrace();
        }


    }

    public void poissonGo(View view){

        Button poissonButton = findViewById(R.id.poissonGo);

        InputMethodManager imm = (InputMethodManager)getSystemService(Context.INPUT_METHOD_SERVICE);
        imm.hideSoftInputFromWindow(poissonButton.getWindowToken(), InputMethodManager.RESULT_UNCHANGED_SHOWN);

        AutoCompleteTextView xauto = findViewById(R.id.xauto);
        AutoCompleteTextView muAuto = findViewById(R.id.muauto);

        String xSearch = xauto.getText().toString();
        String muSearch = muAuto.getText().toString();

        TextView poissonAns = findViewById(R.id.poissonAns);

        try {

            JSONObject jsonObject = new JSONObject(jsonStr);
            JSONArray jsonArray = jsonObject.getJSONArray("Sheet1");
            poissonAns.setText(jsonArray.getJSONObject(Integer.parseInt(xSearch)).getString(muSearch));

        } catch (Exception e){
            poissonAns.setText("N/A :(");
        }



    }


}