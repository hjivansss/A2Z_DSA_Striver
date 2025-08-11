package Basic_Recursion;
import java.io.*;
import java.util.Arrays;
public class Check_if_a_string_is_Palindrome {
    public static void main(String[] args) {
        String s="jivanavij";
        System.out.println(isPalindrome(s));

    }

    public static boolean isPalindrome(String s) {
        int left=0;
        int right=  s.length()-1;
        while(left<right){
            //skiping non-alphanumeric character
            while(left<right && !Character.isLetterOrDigit(s.charAt(left))){
                left++;
            }
            while(left<right && !Character.isLetterOrDigit(s.charAt(right))){
                right--;
            }

            if(Character.toLowerCase(s.charAt(left)) != Character.toLowerCase(s.charAt(right))){
                return false;
            }
            left ++;
            right--;

        }
        return true;
    }
}