package pl.mordesku.sda.mockito;

import java.util.List;

/**
 * Created with notepad.exe.
 * Author: mprzybylski
 * Date: 2017-09-21
 * Time: 18:23
 */

public interface PersonRepository {
    List<Person> findAllPersons();
}
