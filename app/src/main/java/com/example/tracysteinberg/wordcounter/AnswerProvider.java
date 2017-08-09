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

                    answers.add("go for a run");
                    answers.add("hava a nap");
            }

         public String getAnswer() {

             return answers.get(0);
         }




}

