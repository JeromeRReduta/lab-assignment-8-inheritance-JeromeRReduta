// Made ChoiceQuestion parent b/c it was closest to...
// ... what I wanted MultiChoiceQuestion to be
public class MultiChoiceQuestion extends ChoiceQuestion {

    public MultiChoiceQuestion() {
        super();
    }
// Referenced https://stackoverflow.com/questions/26534451/how-to-determine-if-2-different-words-have-the-same-letters
    // Also referenced Java Char/String API
    public boolean checkAnswer(String response)
    {
        // Makes var to copy answers w/o modifying answers
        String match = super.getAnswer();

        // Removes # from match if it is in response

        // If a # is in reponse that is not one of the ans...
        // answer is immediately false/wrong

        // Putting in a # 2+ times also counts as wrong ans.

        for (int index = 0; index < response.length(); index ++) {
            if (match.contains(response.substring(index, index+1))) {
                match = match.replace(response.substring(index, index+1), "");
            }

            else if (Character.isDigit(response.charAt(index))) {
                return false;
            }
        }

    return match.isEmpty();
    }

}
