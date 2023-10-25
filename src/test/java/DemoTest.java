import org.example.Exercise;
import org.example.Main;
import org.junit.Test;
import org.junit.jupiter.api.DisplayName;

import java.util.Arrays;

import static org.example.Exercise.greet;
import static org.junit.Assert.assertEquals;

public class DemoTest {

    @Test
    @DisplayName("Requirement 1 - Returning the name when running greet()")
    public void testIfNameReturns() {

        Exercise name = new Exercise();

        String[] result = greet("Bob");

        assertEquals(result, new String[]{"Bob"});
    }

    @Test
    @DisplayName("Requirement 2 - Given an empty string when running greet() then return 'Hello my friend' ")
    public void testEmptyString() {

        Exercise name = new Exercise();

        String[] result = greet(null);

        assertEquals(result, new String[]{"Hello, my friend."});
    }

    @Test
    @DisplayName("Requirement 3 - When name is all uppercase return the name with 'HELLO + name + !' ")
    public void upperCaseTest() {

        Exercise name = new Exercise();

        String[] result = greet("JERRY");

        assertEquals(result, new String[]{"HELLO JERRY!"});
    }

    @Test
    @DisplayName("Requirement 4 ")
    public void testTwoNames() {
        Exercise name = new Exercise();

        String[] result = greet("Jill"+"Jane");

        assertEquals(result, new String[]{"Hello, Jill and Jane."});

    }


}
