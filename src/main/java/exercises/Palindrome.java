package exercises;

import java.util.Locale;
import java.util.Stack;

public class Palindrome {

    public boolean isPalindrome(String text){

        text = text.toLowerCase(Locale.ROOT).replace(" ", "").replace(".", "");
        int n = text.length() / 2;

        String init = text.substring(0,n);
        String end = "";

        if(text.length() % 2 == 0)  {
            end = text.substring(n,text.length());
        }
        else{
            end = text.substring(n+1,text.length());
        }


        StringBuffer sbr = new StringBuffer(end);
        String endReversed = String.valueOf(sbr.reverse());

        if(init.equals(endReversed)){
            System.out.println("It's Palindrome!");
            return true;
        }
        else{
            System.out.println("It is not Palindrome!");
            return false;
        }
    }

    public boolean isPalindromeUsingStack(String text){

        text = text.toLowerCase(Locale.ROOT).replace(" ", "").replace(".", "");

        Stack<Character> stackText = new Stack<>();

        for(int i = 0; i < text.length(); i++){
            stackText.push(text.charAt(i));
        }

        String inversedText = "";
        while (!stackText.isEmpty()){
            inversedText += stackText.pop();
        }

        if (text.equals(inversedText)) {
            System.out.println("It's Palindrome!");
            return true;
        }
        else{
            System.out.println("It is not Palindrome!");
            return false;
        }
    }
}
