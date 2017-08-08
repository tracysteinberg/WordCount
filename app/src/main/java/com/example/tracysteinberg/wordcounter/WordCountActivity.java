package com.example.tracysteinberg.wordcounter;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.content.Intent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;


/**
 * Created by tracysteinberg on 08/08/2017.
 */


    public class WordCountActivity extends AppCompatActivity {

        EditText questionEditText;
        Button button;



        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_word_count);
            questionEditText = (EditText)findViewById(R.id.question_text);

            button = (Button)findViewById(R.id.button);

        }

        public void  onButtonClicked(View button) {
            Log.d(getClass().toString(), "onButtonClicked was called");
            String question = questionEditText.getText().toString();
            Log.d(getClass().toString(), "The words entered were'" + question + " '");
            AnswerProvider answerProvider = new AnswerProvider();
//          String  answer = answerProvider.answer.length();
            String  answer = answerProvider.getAnswer();


            Intent intent = new Intent(this, AnswerActivity.class);
            intent.putExtra("answer", answer);
            startActivity(intent);


        }






}
