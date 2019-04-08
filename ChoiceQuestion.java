import java.util.ArrayList;

/**
   A question with multiple choices.
*/
public class ChoiceQuestion extends Question
{
   private ArrayList<String> choices;

   /**
      Constructs a choice question with no choices.
   */
   public ChoiceQuestion()
   {
      choices = new ArrayList<String>();
   }

   /**
      Adds an answer choice to this question.
      @param choice the choice to add
      @param correct true if this is the correct choice, false otherwise
   */
   public void addChoice(String choice, boolean correct)
   {
      choices.add(choice);
      if (correct) 
      {
         // Convert choices.size() to string

         /* Note: Changed this method from
         setAnswer("" + choices.size()) to
         setAnswer(super.getAnswer() + choices.size())

         This allows me to have a string to multiple answer #s
         (e.g. if the answers are 1, 2, and/or 4, the answers
         string is "124")

         Makes checking for multiple answers possible and
         (hopefully) easy
          */

         setAnswer(super.getAnswer() + choices.size());
      }
   }
   
   public void display()
   {
      // Display the question text
      super.display();
      // Display the answer choices
      for (int i = 0; i < choices.size(); i++)
      {
         int choiceNumber = i + 1;
         System.out.println(choiceNumber + ": " + choices.get(i));     
      }
   }
}

