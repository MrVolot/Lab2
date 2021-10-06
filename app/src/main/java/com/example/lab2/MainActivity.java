package com.example.lab2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText etText;
    TextView tvCount;
    Spinner spinner;
    int count;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        etText = findViewById(R.id.et_text);
        tvCount = findViewById(R.id.tv_count);
        spinner = (Spinner) findViewById(R.id.spinner);

        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,R.array.selection_options, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(adapter);
    }

    public void onButtonClick(View view) {
        if(spinner.getSelectedItem().toString().equalsIgnoreCase(getResources().getString(R.string.selection_chars))) {
            count = Counter.getCharsCount(etText.getText().toString());
            if(count==0){
                Toast.makeText(getApplicationContext(),"Nothing was entered. Enter some text and choose what to calculate",Toast.LENGTH_SHORT).show();
            }
            tvCount.setText(String.valueOf(count));
        }
        if(spinner.getSelectedItem().toString().equalsIgnoreCase(getResources().getString(R.string.selection_words))){
            count = Counter.getWordsCount(etText.getText().toString());
            if(count==0){
                Toast.makeText(getApplicationContext(),"Nothing was entered. Enter some text and choose what to calculate",Toast.LENGTH_SHORT).show();
            }
            tvCount.setText(String.valueOf(count));
        }
    }
}