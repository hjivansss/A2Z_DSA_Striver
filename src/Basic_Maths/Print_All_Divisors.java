package Basic_Maths;
import java.util.ArrayList;
import java.util.Comparator;
public class Print_All_Divisors {
    public static void main(String[] args) {
        checkDivisors(36);
    }

    public static void checkDivisors(int n) {
        ArrayList<Integer> divisors = new ArrayList<>();
        int sqrtN = (int) Math.sqrt(n);
        for (int i = 1; i <= sqrtN; i++) {
            if (n % i == 0) {
                divisors.add(i);
                if (n / i != i) {
                    divisors.add(n / i);
                }
            }
        }
        //Collections.sort(divisors);
        divisors.sort(Comparator.naturalOrder());
        for (int a : divisors) {
            System.out.println(a + " ");
        }

    }
}