package sortTeamMember;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertIterableEquals;

public class ConvertTest {
    private MyConvert convert;
    private String names;

    @BeforeEach
    void setUp() {
        convert = new MyConvert();
        names = "huang lizhen,lan yixing,yang kaiguang,sun ming";
    }

    @Test
    void should_convert_one_name_to_name_list() {
        assertEquals("huang lizhen", convert.convertNameToList("huang lizhen").get(0));
    }

    @Test
    void should_convert_multiple_name_to_name_list() {
        assertIterableEquals(Arrays.asList("huang lizhen", "lan yixing", "yang kaiguang", "sun ming"), convert.convertNameToList(names));
    }

    @Test
    void should_convert_one_name_to_person() {
        List<String> nameList = convert.convertNameToList(names);
        assertIterableEquals(Arrays.asList(
                new Person("HUANG,LIZHEN"),
                new Person("LAN,YIXING"),
                new Person("YANG,KAIGUANG"),
                new Person("SUN,MING")),
                convert.convertNamesToPerson(nameList));
    }

    @Test
    void should_sorted_person_by_passport_format() {
        List<Person> persons = Arrays.asList(new Person("b"), new Person("a"), new Person("c"));
        assertIterableEquals(Arrays.asList(new Person("A"), new Person("B"), new Person("C")), convert.sortPersons(persons));
    }
}
