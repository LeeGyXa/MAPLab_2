package com.example.lab21;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

// global variables
    Spinner spinner;
    EditText textInput;
    TextView textResults;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
// variables identification
        this.spinner = findViewById(R.id.spinner);
        this.textInput = findViewById(R.id.editText);
        this.textResults = findViewById(R.id.textView);

// spinner adaptation
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this, R.array.count_choice, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(adapter);
    }
// button function
    @SuppressLint("SetTextI18n")
    public void onBtnClick(View view) {

        String input = this.textInput.getText().toString();

        if(input.matches("")){

            Toast.makeText(this, "You did not enter a text", Toast.LENGTH_SHORT).show();
            this.textResults.setText("None!");
        }
// characters selection
        else {
            if (spinner.getSelectedItem().toString().equals("Characters")) {
            int charsCount = SymbolsCounter.getChars(input);
            String finalResults = String.valueOf(charsCount);
            this.textResults.setText(finalResults);
            }
// words selection
            else if (spinner.getSelectedItem().toString().equals("Words")) {
                int wordsCount = SymbolsCounter.getWords(input);
                String finalResultsWords = String.valueOf(wordsCount);
                this.textResults.setText(finalResultsWords);
      }
     }
    }
}