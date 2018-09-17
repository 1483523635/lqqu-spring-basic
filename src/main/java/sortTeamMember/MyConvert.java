package sortTeamMember;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class MyConvert {
    public List<String> convertNameToList(String name) {
        return Arrays.stream(name.split(",")).collect(Collectors.toList());
    }
}
