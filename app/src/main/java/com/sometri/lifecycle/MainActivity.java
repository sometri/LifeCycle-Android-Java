package com.sometri.lifecycle;

import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

// Import the R class
import com.sometri.lifecycle.R;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "MainActivity";
    private TextView lifecycleTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lifecycleTextView = findViewById(R.id.lifecycleTextView);
        appendText("onCreate");
    }

    @Override
    protected void onStart() {
        super.onStart();
        appendText("onStart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        appendText("onResume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        appendText("onPause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        appendText("onStop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        appendText("onDestroy");
    }

    private void appendText(String text) {
        String currentText = lifecycleTextView.getText().toString();
        String newText = currentText.isEmpty() ? text : currentText + "\n" + text;
        lifecycleTextView.setText(newText);
        Log.d(TAG, text);
    }
}
