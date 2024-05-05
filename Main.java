import company.beans.Person;
import company.exceptions.InvalidAgeException;
import company.implementations.EmailMessenger;
import company.utils.MathUtils;

public class Main {
    public static void main(String[] args) {
        try {
     
            Person person = new Person("John Doe", 30);
            System.out.println("Name: " + person.getName());
            System.out.println("Age: " + person.getAge());

         
            int result = MathUtils.add(5, 10);
            System.out.println("Result of addition: " + result);

          
            EmailMessenger emailMessenger = new EmailMessenger();
            emailMessenger.sendMessage("Hello, world! The result of addition is: " + result);
        } catch (InvalidAgeException e) {
            System.out.println("Invalid age provided: " + e.getMessage());
        }
    }
}