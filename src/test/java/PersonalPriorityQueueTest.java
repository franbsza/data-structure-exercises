import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import vectors.model.Contact;
import vectors.PersonalPriorityQueue;

public class PersonalPriorityQueueTest {

    @InjectMocks
    PersonalPriorityQueue<Contact> personalPriorityQueue;

    @Mock
    Contact contact;
    Contact contactTwo;

    @BeforeEach
    public void setup(){
        personalPriorityQueue = new PersonalPriorityQueue<>();
    }

    @Test
    public void enqueue(){

        contact = new Contact(3333333, "Marco", "home", 2);
        contactTwo = new Contact(99999999, "Silvia", "work", 1);

        personalPriorityQueue.enqueue(contact);
        personalPriorityQueue.enqueue(contactTwo);

        Assertions.assertEquals("[Contact{phone=99999999, type='work', name='Silvia'}, Contact{phone=3333333, type='home', name='Marco'}]"
                                ,personalPriorityQueue.convertToString());
    }
}
