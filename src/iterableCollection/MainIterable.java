package iterableCollection;

import model.Person;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class MainIterable {
    public static void main(String[] args) {
        Iterable<String> names = List.of("Ahmad Roni", "Ahmad Syukur", "Ahmad Subagyo", "Ahmad Bootcamp");

////        for(var name: names){
////            System.out.println(name);
//        }

        //  menggunakan iterator
        Iterator<String> namesIterator = names.iterator();
        while (namesIterator.hasNext()){
            System.out.println(namesIterator.next());
        }
        System.out.println("===============================================================================");

        Iterable<Person> persons = Arrays.asList(
                new Person(1,"Ahmad Roni","Ciamis"),
                new Person(2,"Ahmad Syahroni","Jakarta"),
                new Person(3,"Ahmad Baehaki","Yogyakarta"),
                new Person(4,"Ahmad Manullang","Medan")
        );


//        for (var peson: persons){
//            System.out.println(peson);
//        }

        Iterator<Person> personIterator = persons.iterator();
        while (personIterator.hasNext()){
            System.out.println(personIterator.next());
        }
    }
}

