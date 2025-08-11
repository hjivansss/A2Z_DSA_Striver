package Basic_Maths;

public class Count_Digits{
    public static void main(String[] args  ){
        int count = countDigits(969857657);
        System.out.println(count);
    }
    public static int countDigits(int n){
        //edge case,if n=1, its one digit number
        if(n==0){
            return 1;
        }

        int count=0;
        while(n!=0){
            n=n/10;
            count ++;
        }
        return count;

    }
}