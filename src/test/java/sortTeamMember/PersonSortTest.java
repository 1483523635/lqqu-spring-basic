package sortTeamMember;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertIterableEquals;

public class PersonSortTest {

    private MyConvert convert;
    private String names;

    @BeforeEach
    void setUp() {
        convert = new MyConvert();
        names = "huang lizhen,lan yixing,yang kaiguang,sun ming";
    }

    @Test
    void should_sorted_person_by_passport_format() {
        List<Person> persons = Arrays.asList(new Person("b"), new Person("a"), new Person("c"));
        assertIterableEquals(Arrays.asList(new Person("A"), new Person("B"), new Person("C")), convert.sortPersons(persons));
    }

    @Test
    void should_sort_by_passport_name() {
        List<String> nameList = convert.convertNameToList(names);
        List<Person> persons = convert.convertNamesToPerson(nameList);
        List<Person> sortedPersons = convert.sortPersons(persons);
        assertIterableEquals(Arrays.asList(new Person("HUANG,LIZHEN"), new Person("LAN,YIXING"), new Person("SUN,MING"), new Person("YANG,KAIGUANG")), sortedPersons);
    }
}

