import java.util.Scanner;

public class App {

    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) throws Exception {

        handle("Learner");
        scan.close();
    }

    static void handle(String drive) {

        System.out.println("Driving Lesson!");
        operate(drive);

        String feedback = getFeedBack(drive);

        // Define the base case / stopping condition
        if (feedback.equals("failed")) {

            // Do something to reach the goal
            retake(drive);

            // Recursive call
            handle(drive);
        } else if (feedback.equals("pass")) {
            serve(drive);
        }
    }

    static void operate(String drive) {
        System.out.println("Driving Test");
    }

    static String getFeedBack(String drive) {
        System.out.println("Does the " + drive + " is good? (Enter \"pass\" or \"failed\")");

        String feedback = scan.next();

        return feedback;
    }

    static void retake(String drive) {
        System.out.println("The Learner must retake: " + "(Type \"Retake\")");
        String reaquired = scan.next();
        System.out.println("Learner will retake the exam and driving lessons ");
    }

    static void serve(String drive) {
        System.out.println("Congratulations, Drive Safe! " + drive);
    }

}
