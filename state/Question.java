/**
 * The Question class represents a mathematical question consisting of two numbers and an operation.
 * It generates the question and evaluates the user's answer.
 * 
 * @author Yatin Raju
 */
public class Question {
    private String question;
    private int answer;

    /**
     * Constructor for the Question class.
     * 
     * @param num1 The first number.
     * @param num2 The second number.
     * @param operation The operation (addition, subtraction, multiplication, or division).
     */
    public Question(int num1, int num2, Operation operation) {
        switch (operation) {
            case PLUS:
                question = num1 + " + " + num2;
                answer = num1 + num2;
                break;
            case MINUS:
                question = num1 + " - " + num2;
                answer = num1 - num2;
                break;
            case MULTIPLY:
                question = num1 + " * " + num2;
                answer = num1 * num2;
                break;
            case DIVIDE:
                if (num2 == 0) num2 = 1; // Avoid division by zero
                question = num1 + " / " + num2;
                answer = num1 / num2;
                break;
        }
    }

    /**
     * Returns the question as a string.
     * 
     * @return The question.
     */
    @Override
    public String toString() {
        return question;
    }

    /**
     * Gets the correct answer to the question.
     * 
     * @return The correct answer.
     */
    public int getAnswer() {
        return answer;
    }

    /**
     * Checks if the user's answer is correct.
     * 
     * @param userAnswer The user's answer.
     * @return True if the user's answer is correct, otherwise false.
     */
    public boolean isCorrect(int userAnswer) {
        return userAnswer == answer;
    }
}
