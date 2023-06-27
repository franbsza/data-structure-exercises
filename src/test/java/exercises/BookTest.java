package exercises;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;

import java.util.Stack;

public class BookTest {

    @InjectMocks
    Stack<Book> stackTest;

    @Mock
    Book book;

    @BeforeEach
    public void setup(){
        book = new Book(
                "Caibalion",
                "012245878",
                "Three Initiates",
                1880);
        stackTest = new Stack<>();
        stackTest.push(book);
    }

    @RepeatedTest(3)
    public void addItem(){

        stackTest.push(book);
        Assertions.assertEquals(book, stackTest.push(book));
    }

    @Test
    public void isNotEmpty(){
        Assertions.assertFalse(stackTest.isEmpty());
    }

    @Test
    public void isEmpty(){
        stackTest = new Stack<>();
        Assertions.assertTrue(stackTest.isEmpty());
    }

    @Test
    public void searchFailure(){
        book = new Book("The little prince", "012245878", "Antoine de Saint-Exupéry", 1880);
        Assertions.assertEquals(-1, stackTest.search(book));
    }

    @Test
    public void searchSuccess(){
        Assertions.assertEquals(1, stackTest.search(book));
    }
}
