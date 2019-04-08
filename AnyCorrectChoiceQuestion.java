// Made ChoiceQuestion parent b/c it was closest to what...
// ... I wanted this class to be
public class AnyCorrectChoiceQuestion extends ChoiceQuestion {

    public AnyCorrectChoiceQuestion(String newText) {
        super();
        super.setText(newText + " (Pick one of the correct options.)");
    }

    // Checks if given # answer is in the list of correct answers
    // Returns result
    public boolean checkAnswer(String response)
    {
        return super.getAnswer().contains(response);
    }
}
