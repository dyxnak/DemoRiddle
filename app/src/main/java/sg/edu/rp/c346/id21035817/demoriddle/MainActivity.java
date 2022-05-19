package sg.edu.rp.c346.id21035817.demoriddle;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    // event handling step 1
    TextView tvQ1, tvQ2;
    Button btnRevealQ1, btnRevealQ2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Log.d("MainActivity", "onCreate() called.");

        // event handling step 2
        tvQ1 = findViewById(R.id.textViewQ1);
        tvQ2 = findViewById(R.id.textViewQ2);
        btnRevealQ1 = findViewById(R.id.buttonRevealQ1);
        btnRevealQ2 = findViewById(R.id.buttonRevealQ2);

        // event handling step 3
        btnRevealQ1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, AnswerActivity1.class);
                intent.putExtra("Question","Q1");
                startActivity(intent);
            }
        });

        btnRevealQ2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, AnswerActivity2.class);
                intent.putExtra("Question", "Q2");
                startActivity(intent);
            }
        });
    }

    @Override
    protected void onStart() {
        Log.d("MainActivity", "onStart() called.");
        super.onStart();
    }
    @Override
    protected void onResume() {
        Log.d("MainActivity", "onResume() called.");
        super.onResume();
    }
    @Override
    protected void onPause() {
        Log.d("MainActivity", "onPause() called.");
        super.onPause();
    }
    @Override
    protected void onStop() {
        Log.d("MainActivity", "onStop() called.");
        super.onStop();
    }
    @Override
    protected void onDestroy() {
        Log.d("MainActivity", "onDestroy() called.");
        super.onDestroy();
    }
    @Override
    protected void onRestart() {
        Log.d("MainActivity", "onRestart() called.");
        super.onRestart();
    }

}