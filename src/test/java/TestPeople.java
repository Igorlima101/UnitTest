import org.example.Person;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
// the static ignore the use Assertions in each test, example: Assertions.AssertEquals...

public class TestPeople {

    Person person = new Person("Igor", 18);

    @Test
    void validateAge() {
        assertEquals(18, person.getAge());
    }

    @Test
    void biggestThan18Test() {
        assertTrue(person.biggestThan18());
    }

    @Test
    void verifyIfPersonIsNotNull(){
        assertNotNull(person);
    }




}


