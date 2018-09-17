package sortTeamMember;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ConvertTest  {
    private MyConvert convert;

    @BeforeEach
    void setUp() {
        convert = new MyConvert();
    }

    @Test
    void should_convert_name_to_name_list() {
      assertEquals("huang lizhen",convert.converNameToList("huang lizhen").get(0));
    }
}
