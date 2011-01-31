package com.example.helloautocomplete;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;

public class HelloAutoComplete extends Activity {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        
        String[] countries = getResources().getStringArray(R.array.countries_array);
        
        AutoCompleteTextView textView = (AutoCompleteTextView)findViewById(R.id.autocomplete_country);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, R.layout.list_item, countries);
        textView.setAdapter(adapter);
    }
}