package exercises;

import java.util.LinkedList;
import java.util.Locale;
import java.util.Queue;
import java.util.Stack;

public class Palindrome {

    public boolean isPalindrome(String text){

        text = text.toLowerCase(Locale.ROOT).replace(" ", "").replace(".", "");
        int n = text.length() / 2;

        String init = text.substring(0,n);
        String end;

        if(text.length() % 2 == 0)  {
            end = text.substring(n);
        }
        else{
            end = text.substring(n+1);
        }

        StringBuilder sbr = new StringBuilder(end);
        String endReversed = String.valueOf(sbr.reverse());

        return init.equals(endReversed);
    }

    public boolean isPalindromeUsingStack(String text){

        text = text.toLowerCase(Locale.ROOT).replace(" ", "").replace(".", "");

        Stack<Character> stackText = new Stack<>();

        for(int i = 0; i < text.length(); i++){
            stackText.push(text.charAt(i));
        }

        StringBuilder inversedText = new StringBuilder();
        while (!stackText.isEmpty()){
            inversedText.append(stackText.pop());
        }

        return text.contentEquals(inversedText);
    }

    public boolean isPalindromeUsingQueueStack(String text){
        char[] textChar = text.toLowerCase(Locale.ROOT).trim().replace(".", "").toCharArray();

        Stack<Character> stackText = new Stack<>();
        Queue<Character> queueText = new LinkedList<>();

        for(char character : textChar){
            stackText.push(character);
            queueText.add(character);
        }

        boolean isPalindrome = true;

        for(int i = 0; i < textChar.length/2 ; i++){
            if(stackText.pop() != queueText.remove()){
                isPalindrome = false;
                break;
            }
        }
        return isPalindrome;
    }
}
