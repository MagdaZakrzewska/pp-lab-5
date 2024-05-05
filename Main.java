import company.beans.Person;
import company.exceptions.InvalidAgeException;
import company.implementations.EmailMessenger;
import company.utils.MathUtils;

public class Main {
    public static void main(String[] args) {
        try {
            
            Person[] people = new Person[5];
            final int b = 10; 

            
            people[0] = new Person("John Doe", 30);
            people[1] = new Person("Anna Nowak", 27);
            people[2] = new Person("Jan Kowalski", 32);
            people[3] = new Person("Igor Lewandowski", 18);
            people[4] = new Person("Joanna Warszawska", 34);

            
            for (int i = 0; i < people.length; i++) {
                int value = MathUtils.add(people[i].getAge(), b);
                System.out.println("Value for " + people[i].getName() + ": " + value);

                
                EmailMessenger emailMessenger = new EmailMessenger();
                emailMessenger.sendMessage("Hello, " + people[i].getName() + "! The calculated value is: " + value);
            }
        } catch (InvalidAgeException e) {
            System.out.println("Invalid age provided: " + e.getMessage());
        }
    }
}