package com.example.helloformstuff;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.Toast;

public class HelloFormStuff extends Activity {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        
        final Button button = (Button)findViewById(R.id.button);
        button.setOnClickListener(new OnClickListener() {
			public void onClick(View v) {
				// Perform action on clicks
				Toast.makeText(HelloFormStuff.this, "Beep Bop", Toast.LENGTH_SHORT).show();
			}
		});
    }
}