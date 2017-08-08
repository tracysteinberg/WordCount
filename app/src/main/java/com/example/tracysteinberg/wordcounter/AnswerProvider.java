package com.example.tracysteinberg.wordcounter;

import java.util.ArrayList;

/**
 * Created by tracysteinberg on 08/08/2017.
 */


    public class AnswerProvider  implements AnswerProvidable {

        private ArrayList<String> answers;

        public AnswerProvider() {

            answers = new ArrayList<String>();
            setupAnswers();
        }

        public ArrayList<String> getAnswers() {
            return new ArrayList<String>(answers);
        }

        public int getLength() {

            return answers.size();
        }

        private void setupAnswers() {

            String[] answerToAdd = {
                    answers.add(answer)};

            }

         private void(String answer :answerToAdd) {
                answers.add(answer);

            }




}


