import company.beans.Person;
import company.exceptions.InvalidAgeException;
import company.implementations.EmailMessenger;

public class Main {
    public static void main(String[] args) {
        try {
            // Tworzenie i wyświetlanie informacji o osobie
            Person person = new Person("John Doe", 30);
            System.out.println("Name: " + person.getName());
            System.out.println("Age: " + person.getAge());

            // Tworzenie i wysyłanie wiadomości e-mail
            EmailMessenger emailMessenger = new EmailMessenger();
            emailMessenger.sendMessage("Hello, world!");
        } catch (InvalidAgeException e) {
            System.out.println("Invalid age provided: " + e.getMessage());
        }
    }
}