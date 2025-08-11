package Basic_Maths;

public class Check_Palindrome {
    public static void main(String[] args) {
        boolean b=checkPalindrome(787);
        System.out.println(b);
    }
    public static boolean checkPalindrome(int n){
        int revSum=0;
        int temp =n;
        while(n!=0){
            int lastDigit=n%10;
            revSum=revSum*10 + lastDigit;
            n=n/10;
        }
        if(temp<0){
            revSum=revSum+'-';
        }
        return revSum==temp;
    }
}