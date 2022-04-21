package ch.juventus.se.problemstofix.person;

import java.util.Calendar;
import java.util.Date;
import java.util.Iterator;
import java.util.List;


public class PersonController {

    public List<Person> removeAllLindas (List<Person> people) {

        people.removeIf((person) -> person.getFirstName().equals("Linda"));
        return people;
    }

    public List<Person> removeAllUnderage (List<Person> people) {

        Calendar cal = Calendar.getInstance();
        cal.add(Calendar.YEAR, -18);
        Date referenceDate = cal.getTime();

        people.removeIf((person) -> person.getBirthday().after(referenceDate));

        return people;
    }

    public List<Person> removeAllWitLetterAInName(List<Person> people) {

        people.removeIf((person) -> person.getLastName().toLowerCase().contains("a"));

        return people;
    }
}
