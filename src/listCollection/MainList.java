package listCollection;

import model.Person;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MainList {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>(Arrays.asList("Nurul", "Intan", "Tiara", "Ririn"));
        System.out.println(names);

        System.out.println("==================================================================================");

        System.out.println("Setelah Diubah : ");

        names.set(3, "Andika");
        names.set(1, "Farhan");
        System.out.println(names);

        System.out.println("==================================================================================");

        List<Person> persons = new ArrayList<>(
                Arrays.asList(
                        new Person(1, "Joko", "Jakarta"),
                        new Person(2, "Diego", "Bandung"),
                        new Person(3, "Budi", "Surabaya"),
                        new Person(4, "Bobi", "Surabaya"),
                        new Person(5, "Bryan", "Surabaya")
                )
        );
        for (int i = 0; i < persons.size(); i++) {
            System.out.println("Index ke " + i + " : " + persons.get(i));
        }

        System.out.println("=================================================================================");
        System.out.println("\nSetalah Diubah : ");

        persons.set(1, new Person(2, "Gilang", "Lampung"));
        persons.set(2, new Person(3, "Budi", "Semarang"));
        for (int i = 0; i < persons.size(); i++) {
            System.out.println("Index ke " + i + " : " + persons.get(i));
        }
        List<Person> personList = persons.stream().filter(x -> x.getCity().equals("Surabaya")).collect(Collectors.toList());
        persons.removeAll(personList);
        System.out.println("\nSetalah Remove All");
        for (int i = 0; i < persons.size(); i++) {
            System.out.println("Index ke " + i + " : " + persons.get(i));
        }
    }
}

