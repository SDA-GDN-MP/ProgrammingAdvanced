package pl.mordesku.sda.mockito;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.runners.MockitoJUnitRunner;

import java.util.Arrays;
import java.util.List;

import static junit.framework.TestCase.assertEquals;
import static org.junit.Assert.assertTrue;

/**
 * Created with notepad.exe.
 * Author: mprzybylski
 * Date: 2017-09-21
 * Time: 18:37
 */
@RunWith(MockitoJUnitRunner.class)
public class FilteredByNameTest {
    @Mock
    public PersonRepository repository;

    @Test
    public void shouldReturnPersons()
    {
        FilteredByName filteredByName = Mockito.mock(FilteredByName.class);

        Mockito.when(filteredByName.findByName("Mateusz"))
                .thenReturn(Arrays.asList(new Person("Mateusz", "Przybylski")));

        List<Person> mateusz = filteredByName.findByName("Mateusz");
        assertEquals(1, mateusz.size());
    }

    @Test
    public void shouldFilterPersonsByName() {
        Mockito.when(repository.findAllPersons()).thenReturn(Arrays.asList(new Person("Stefan", "Batory")));
        FilteredByName filteredByName = new FilteredByName(repository);
        List<Person> byName = filteredByName.findByName("Andrzej");

    }
    @Test
    public void shouldThrowNullPointerByName() {
        Mockito.when(repository.findAllPersons()).thenReturn(null);
        FilteredByName filteredByName = new FilteredByName(repository);
        try {
            List<Person> byName = filteredByName.findByName("Andrzej");
        } catch (Exception e) {
            assertTrue(e instanceof NullPointerException);
        }
    }



}