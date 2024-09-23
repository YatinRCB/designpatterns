package singleton;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * The Question class represents a trivia question, including the question prompt, 
 * a list of possible answers, and the correct answer's index.
 * <p>
 * It provides methods to check if a given answer is correct and to retrieve the correct answer.
 * </p>
 * <p>
 * Author: Yatin Raju
 * </p>
 */
public class Question {
    /** The prompt for the trivia question */
    private String question;

    /** The list of possible answers for the question */
    private ArrayList<String> answers;

    /** The index (1-based) of the correct answer */
    private int correctAnswer;

    /**
     * Constructs a Question with a prompt, the correct answer index, and a list of possible answers.
     * 
     * @param question The trivia question prompt.
     * @param correctAnswer The index of the correct answer (1-based).
     * @param answers An array of possible answers for the question.
     */
    public Question(String question, int correctAnswer, String[] answers) {
        this.question = question;
        this.correctAnswer = correctAnswer;
        this.answers = new ArrayList<>(Arrays.asList(answers));
    }

    /**
     * Default constructor that prints "Hello". This is primarily used for testing.
     */
    public Question() {
        System.out.println("Hello");
    }

    /**
     * Returns a formatted string representation of the question, including the possible answers.
     * 
     * @return A string representing the question and its answers.
     */
    @Override
    public String toString() {
        StringBuilder display = new StringBuilder(question + "\n");
        for (int i = 0; i < answers.size(); i++) {
            display.append(" ").append(i + 1).append(". ").append(answers.get(i)).append("\n");
        }
        return display.toString();
    }

    /**
     * Checks if the user's answer is correct.
     * 
     * @param userAnswer The user's answer (1-based index).
     * @return {@code true} if the user's answer matches the correct answer, {@code false} otherwise.
     */
    public boolean isCorrect(int userAnswer) {
        return userAnswer == correctAnswer + 1;
    }

    /**
     * Returns the correct answer for the question.
     * 
     * @return The correct answer as a string.
     */
    public String getCorrectAnswer() {
        return answers.get(correctAnswer - 1);  // -1 because correctAnswer is 1-based
    }
}
