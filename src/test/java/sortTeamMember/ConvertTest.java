package sortTeamMember;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertIterableEquals;

public class ConvertTest  {
    private MyConvert convert;

    @BeforeEach
    void setUp() {
        convert = new MyConvert();
    }

    @Test
    void should_convert_one_name_to_name_list() {
      assertEquals("huang lizhen",convert.convertNameToList("huang lizhen").get(0));
    }

    @Test
    void should_convert_multiple_name_to_name_list() {
        assertIterableEquals(Arrays.asList("huang lizhen","lan yixing","yang kaiguang","sun ming"), convert.convertNameToList("huang lizhen,lan yixing,yang kaiguang,sun ming"));
    }
}
