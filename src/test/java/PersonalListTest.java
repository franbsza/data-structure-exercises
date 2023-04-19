import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import org.mockito.InjectMocks;
import vectors.PersonalList;

public class PersonalListTest {

    @InjectMocks
    PersonalList personalList;

    @BeforeEach
    public void setup(){
        personalList = new PersonalList<>(1);
    }

    @ParameterizedTest
    @ValueSource(strings = {"text one", "text two", "text three", "text four"})
    public void addItem(String text){

        personalList.push(text);
        Assertions.assertEquals(1, personalList.getSize());
    }

    @RepeatedTest(3)
    public void addItemError(){

        personalList.push("A");
        Assertions.assertEquals(true, personalList.push("B"));
    }

    @Test
    public void pushItemByIndex(){

        personalList.push("A", 0);
        personalList.push("B", 1);
        personalList.push("D", 2);

        personalList.push("C", 2);

        Assertions.assertEquals("[A, B, C, D]", personalList.convertToString());
    }
}
