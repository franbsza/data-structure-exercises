import dinamic.PersonalLinkedList;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;

public class PersonalLinkedListTest {

    @InjectMocks
    PersonalLinkedList personalLinkedList;

    @BeforeEach
    public void setup(){
        personalLinkedList = new PersonalLinkedList();
    }
    
    @Test
    public void add(){
        personalLinkedList.add(1);
        personalLinkedList.add("aaa");
        personalLinkedList.add(true);
    }

    @Test
    public void printList(){
        personalLinkedList.add(1);
        personalLinkedList.add("Any string");
        personalLinkedList.add(true);
        Assertions.assertEquals("[1,Any string,true,]", personalLinkedList.print());
    }
}
