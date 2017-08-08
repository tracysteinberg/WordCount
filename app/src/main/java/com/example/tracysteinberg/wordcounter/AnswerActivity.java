package com.example.tracysteinberg.wordcounter;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.TextView;

/**
 * Created by tracysteinberg on 08/08/2017.
 */

    public class AnswerActivity extends AppCompatActivity {

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);

            setContentView(R.layout.activity_answer);
            Log.d("WordCounter:", "AnswerActivity.onCreateCalled");

            TextView answerText = (TextView)findViewById(R.id.answer_text);
            Intent intent = getIntent();
            Bundle extras = intent.getExtras();
            String answer = extras.getString("answer");
            answerText.setText(answer);


        }
    }
