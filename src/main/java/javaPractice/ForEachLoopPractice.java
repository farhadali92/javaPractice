package javaPractice;

import java.util.Arrays;
import java.util.List;

class Person{

    String firstname;
    String lastname;
    int age;

    public Person(String firstname, String lastname, int age) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.age = age;
    }
}

public class ForEachLoopPractice {

    public static void main(String[] args) {

        List<Person> people = Arrays.asList(
                new Person("john", "cock", 20),
                new Person("james", "root", 25),
                new Person("kevin", "clark", 26),
                new Person("stuart", "harmison", 29)
        );


        for (Person person : people) {
            System.out.print(person.firstname +"," +person.lastname +"'" +person.age);
            System.out.println();
        }

    }
}
