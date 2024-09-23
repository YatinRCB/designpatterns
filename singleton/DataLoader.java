package singleton;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * Used to read external data for the program
 * Questions from: https://www.rd.com/list/trivia-questions-for-kids/
 */
public class DataLoader {
    //relative path to the file, based on the directory you currently have open
    private static final String FILE_NAME = "C:\\Users\\yatin\\eclipse-workspace\\singleton project\\bin\\questions.txt";

    /**third
     * Returns a list of all trivia questions from the text file
     * @return An ArrayList of Questions
     */
    public static ArrayList<Question> getTriviaQuestions() {
        ArrayList<Question> questions = new ArrayList<Question>();

        try {
            File file = new File(FILE_NAME);
            Scanner scanner = new Scanner(file);

            //loop through to get each question
            while (scanner.hasNextLine()) {
                String[] data = scanner.nextLine().split(",");
                String prompt = data[0].trim();
                int correctAns = Integer.parseInt(data[1].trim());
                String[] answers = new String[data.length - 2];

                for(int i = 2; i < data.length; i++){
                  answers[i-2] = data[i].trim();
                }
                
                Question question = new Question(prompt, correctAns, answers);
                questions.add(question);
            }
            scanner.close();
          } catch (FileNotFoundException e) {
            System.out.println("Sorry, we could not properly read the questions file");
            e.printStackTrace();
          } catch(Exception e){
            e.printStackTrace();
          }

          return questions;
    }    
}
