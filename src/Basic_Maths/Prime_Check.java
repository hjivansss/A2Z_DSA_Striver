package Basic_Maths;

public class Prime_Check {
    public static void main(String[] args) {
        System.out.println(checkPrime(12));
    }

    public static boolean checkPrime(int n){
        int count =0;
        for (int i = 1; i*i<= n; i++) {
            if (n % i == 0) {
                count++;
                if (n / i != i) {
                    count++;
                }
            }
        }
        if(count==2){
            return true;
        }else return false;
    }
}