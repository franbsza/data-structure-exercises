import org.junit.jupiter.api.*;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import vectors.Contact;
import vectors.PersonalQueue;

public class PersonalQueueTest {

    @InjectMocks
    PersonalQueue personalQueue;

    @Mock
    Contact contact;
    Contact contactTwo;

    @BeforeEach
    public void setup(){
        personalQueue = new PersonalQueue();
        contact = new Contact(3333333, "Marco", "home", 1);
        contactTwo = new Contact(99999999, "Silvia", "work", 1);

        personalQueue.enqueue(contact);
    }

    @Test
    @DisplayName("Check if it returns size 1 ")
    public void enqueue(){
       Assertions.assertEquals(1, personalQueue.getSize());
    }

    @Test
    @DisplayName("Check if it returns contact object when dequeuing")
    public void dequeueTestOne(){
        Assertions.assertEquals(contact,  personalQueue.dequeue());
    }

    @Test
    @DisplayName("Check if it returns null since the queue is empty")
    public void dequeueTestTwo(){
        personalQueue = new PersonalQueue();
        Assertions.assertEquals(null,  personalQueue.dequeue());
    }

    @Test
    @DisplayName("Check if it returns contact object")
    public void peepTestOne(){
        personalQueue.enqueue(contactTwo);
        Assertions.assertEquals(contact,  personalQueue.peep());
    }

    @Test
    @DisplayName("Check if it returns null since the queue has been reloaded")
    public void peepTestTwo(){
        personalQueue = new PersonalQueue();
        Assertions.assertEquals(null,  personalQueue.peep());
    }
}
