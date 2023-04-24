import exercises.Palindrome;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import org.mockito.InjectMocks;

public class PalindromeTest {

    @InjectMocks
    Palindrome palindrome;

    @BeforeEach
    public void setup(){
        palindrome = new Palindrome();
    }

    @ParameterizedTest
    @ValueSource(strings = {"Anilina", "aibofobia.", "A base do teto desaba.", "sopapos", "reger", "Ato idiota.", "Missa é assim.", "Renner","20022002", "Ana Rita a tirana"})
    public void verifyPalindrome(String text){
        Assertions.assertTrue(palindrome.isPalindrome(text));
    }

    @ParameterizedTest
    @ValueSource(strings = {"AAAnilina", "aPPOPibofobia.", "SSSPPP", "123455"})
    public void verifyFalsePalindrome(String text){
        Assertions.assertFalse(palindrome.isPalindrome(text));
    }

    @ParameterizedTest
    @ValueSource(strings = {"Anilina", "aibofobia.", "A base do teto desaba.", "sopapos", "reger", "Ato idiota.", "Missa é assim.", "Renner","20022002", "Ana Rita a tirana"})
    public void verifyPalindromeUsingStack(String text){
        Assertions.assertTrue(palindrome.isPalindromeUsingStack(text));
    }

    @ParameterizedTest
    @ValueSource(strings = {"AAAnilina", "aPPOPibofobia.", "SSSPPP", "123455"})
    public void verifyFalsePalindromeUsingStack(String text){
        Assertions.assertFalse(palindrome.isPalindromeUsingStack(text));
    }

    @ParameterizedTest
    @ValueSource(strings = {"Anilina", "aibofobia.", "A base do teto desaba.", "sopapos", "reger", "Ato idiota.", "Missa é assim.", "Renner","20022002", "Ana Rita a tirana"})
    public void verifyPalindromeUsingStackQueue(String text){
        Assertions.assertTrue(palindrome.isPalindromeUsingQueueStack(text));
    }

    @ParameterizedTest
    @ValueSource(strings = {"AAAnilina", "aPPOPibofobia.", "SSSPPP", "123455"})
    public void verifyFalsePalindromeUsingStackQueue(String text){
        Assertions.assertFalse(palindrome.isPalindromeUsingQueueStack(text));
    }
}
