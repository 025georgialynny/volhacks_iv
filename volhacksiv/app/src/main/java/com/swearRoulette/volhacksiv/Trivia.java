package com.example.funtime;

import com.google.firebase.database.DatabaseReference;

import java.util.ArrayList;
import java.util.Random;

public class Trivia
{
   private String strQuestion = "";
   private String strGivenAnswer = "";
   private ArrayList<String> answers = new ArrayList<String>();
   private int iCorrectIndex = 0;
   private Random ran = new Random();

   public Trivia(DatabaseReference db)
   {

   }

   public void setAnswer(String strGiven)
   {
     this.strGivenAnswer = strGiven;
   }

   private boolean checkAnswer()
   {
      boolean blnCorrect = false;

      if(strGivenAnswer.equals(answers.get(iCorrectIndex)))
      {
         blnCorrect = true;
      }

      return blnCorrect;
   }
}
