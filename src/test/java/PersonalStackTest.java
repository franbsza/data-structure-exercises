import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import vectors.PersonalStack;

public class PersonalStackTest {

    @InjectMocks
    PersonalStack personalStack;

    @BeforeEach
    public void setup(){
        personalStack = new PersonalStack(10);

        personalStack.push("A");
        personalStack.push("B");
        personalStack.push("C");
    }

    @Test
    public void isEmptyFalse(){
        Assertions.assertEquals(false, personalStack.isEmpty());
    }

    @Test //remover todos para testar o isEmpty true
    public void isEmptyTrue(){
        personalStack = new PersonalStack<>();
        Assertions.assertEquals(true, personalStack.isEmpty());
    }

    @Test
    public void addItem(){
        String s = "Any Text";
        personalStack.push(s);

        Assertions.assertEquals(4, personalStack.getSize());
    }

    @Test
    public void peekTest(){
        Assertions.assertEquals("C", personalStack.peek());
    }

    @Test
    public void popTest(){
        Assertions.assertEquals("C",  personalStack.pop());
    }
}
