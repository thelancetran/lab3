import static org.junit.Assert.*;
import org.junit.*;
import java.util.ArrayList;
import java.util.List;

public class ListTests {
    @Test
    public void testFilter() {
        List<String> input1 = new ArrayList<>();
        input1.add("long");
        input1.add("longer");
        input1.add("longest");
    }
}