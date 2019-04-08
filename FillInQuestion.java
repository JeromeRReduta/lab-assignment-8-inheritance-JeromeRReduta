public class FillInQuestion extends Question {

    public FillInQuestion(String text) {
        super();

        String message = "";
        String answer = "";
        int change = 0;

        // Prints message except for the word(s) in btwn underscores
        // Makes the answer the word(s) btwn underscores
        for (int index = 0; index < text.length(); index++) {

            /* change alternates btwn 0 and 1 -
            1 = censor out/turn into underscores (for chosen word(s))
            0 = keep as is (for everything else)
             */

            // Change happens once program hits 1st _, and changes back...
            // ... once program hits 2nd _ (assuming no other _s)

            if (text.substring(index, index + 1).equals("_")) {
                change = (change + 1) % 2;
            }

            // Checking for certain letter != "_" b/c for some reason...
            // ... program kept adding 1st _ in answer and couldn't...
            // ... figure out how to fix it
            if (change == 1 && !text.substring(index, index+1).equals("_")) {
                message += "_";
                answer += text.substring(index, index+1);
            }

            else {
                message += text.substring(index, index+1);
            }
        }
            super.setText(message);
            super.setAnswer(answer);
        }
    }

