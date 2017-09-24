package pl.mordesku.sda.mockito;

import java.util.ArrayList;
import java.util.List;

/**
 * Created with notepad.exe.
 * Author: mprzybylski
 * Date: 2017-09-21
 * Time: 18:24
 */
public class FilteredByName {
    private PersonRepository repository;

    public FilteredByName(PersonRepository repository) {
        this.repository = repository;
    }

    List<Person> findByName(String firstName) {
        List<Person> allPersons = repository.findAllPersons();
        List<Person> filtered = new ArrayList<>();
        for (Person person : allPersons) {
            if (person.getFirstName().equals(firstName)) {
                filtered.add(person);
            }
        }
        return filtered;
    }
}
