package Basic_Maths;

public class GCD_HCF {
    public static void main(String[] args) {
        System.out.println(findGCD(20,40));
    }

    /* Good Approach
    public  static int findGCD(int a , int b){
        int gcd=1;
        int i=1;
        while(i<=min(a,b)){
            if (a % i == 0 && b % i == 0 && i>=gcd) {
                gcd=i;
               }
            i++;
            }
            return gcd;
        }


    public static int min(int a ,int b) {
        if (a < b) {
            return a;
        } else {
            return b;
        }

    }
    */

    /*Optimal - use Euclidean Algo*/
    public static int findGCD(int a ,int b){
        while(a>0 && b>0){
            if(a>b){a=a%b;
            }else {b=b%a;}
        }
        if (a==0){
            return b;
        }
        return a;
    }

}