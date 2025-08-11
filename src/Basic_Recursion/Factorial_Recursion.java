package Basic_Recursion;

public class Factorial_Recursion {
    public static void main(String[] args) {
        int n=5;
        System.out.println(factorial(5));
    }

    public static int factorial(int n){
        if(n==0)
            return 1;
        return n*factorial(n-1);
    }
    //Its time complexity is O(n) since recursive function is called n times
    //Its space complexity is O(n), In the worst case, the recursion stack space would be full with all the function calls waiting to get completed and that would make it an O(N) recursion stack space.


    //Using for loop time and space complexity is O(n) and O(1)
}