import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        // Java program to check if a student number is valid
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter student email: ");
        String studentEmail = scan.nextLine();

        // Long method
        Pattern pattern = Pattern.compile("\\w+@students.national-u.edu.ph");
        Matcher matcher = pattern.matcher(studentEmail);

        boolean match = matcher.matches();

        if (match) {
            System.out.println("valid student Email");
        } else {
            System.out.println("invalid student Email");
        }
        System.out.print("Enter phone number: ");
        String phonenum = scan.nextLine();
         
          pattern = Pattern.compile("09\\d{9}");
          matcher = pattern.matcher(phonenum);
         
          boolean num = matcher.matches();
         if(num) {
             System.out.println("valid phone number");
         } else {
             System.out.println("invalid phone number");
         }
        
    }
}
